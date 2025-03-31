package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import controller.Conexion;

public class Compañia {
	public int telefono=0;
	public String direccion="";
	public String fechacreacion="";
	public String razonsocial="";
	public String correo="";
	public String web="";
	Conexion conector = new Conexion();
	
	public Conexion getConector() {
		return conector;
	}
	public void setConector(Conexion conector) {
		this.conector = conector;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public void create(int telefono, String direccion, String fechacreacion, String razonsocial, String correo, String web) {
		Connection conexionBD = null;
		PreparedStatement pst = null;
		String script = " INSERT INTO tblcompañia (telefono, direccion, fechacreacion, razonsocial, correo, web) VALUES (?, ?, ?, ?, ?, ?)";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, telefono);
			pst.setString(2, direccion);
			pst.setString(3, fechacreacion);
			pst.setString(4, razonsocial);
			pst.setString(5, correo);
			pst.setString(6, web);
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
}