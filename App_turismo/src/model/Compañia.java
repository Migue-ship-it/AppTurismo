package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Compañia {
	public int idcompañia;
	public int telefono;
	public String direccion;
	public String fechacreacion;
	public String razonsocial;
	public String correo;
	public String web;
	Conexion conector = new Conexion();
	Connection conexionBD = null;
	PreparedStatement pst = null;
	
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
	public int getIdcompañia() {
		return idcompañia;
	}
	public void setIdcompañia(int idcompañia) {
		this.idcompañia = idcompañia;
	}
	
	public void create(int telefono, String direccion, String fechacreacion, String razonsocial, String correo, String web) {
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
	public void delete(int idcompañia) {
		String script = "delete from tblcompañia where idcompañia = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, idcompañia);
			int confirmacion = JOptionPane.showConfirmDialog(null, "desea eliminar esta fila?");
			if (confirmacion==JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "fila eliminada");
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
}
	public void read(int idcompañia, JTextField telefono, JTextField direccion, JTextField fechacreacion, JTextField razonsocial, JTextField correo, JTextField web) {
		String script = "SELECT * FROM tblcompañia where idcompañia = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, idcompañia);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				telefono.setText(rs.getString(2));
				direccion.setText(rs.getString(3));
				fechacreacion.setText(rs.getString(4));
				razonsocial.setText(rs.getString(5));
				correo.setText(rs.getString(6));
				web.setText(rs.getString(7));
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	/*public void update() {
		
	}*/
	
}