package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Agencia {
	public int idagencia;
	public String nombre;
	public int telefono;
	public String direccion;
	public String web;
	public String correo;
	public int idcompañia;
	Conexion conector = new Conexion();
	Connection conexionBD = null;
	PreparedStatement pst = null;

	public Conexion getConector() {
		return conector;
	}
	public void setConector(Conexion conector) {
		this.conector = conector;
	}
	public int getIdcompañia() {
		return idcompañia;
	}
	public void setIdcompañia(int idcompañia) {
		this.idcompañia = idcompañia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getIdagencia() {
		return idagencia;
	}
	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}
	
	public void create(String nombre, int telefono, String direccion, String web, String correo, int idcompañia) {
		String script = "INSERT INTO tblagencia(nombre, telefono, direccion, web, correo, idcompañia) VALUES (?, ?, ?, ?, ?, ?)";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setString(1, nombre);
			pst.setInt(2, telefono);
			pst.setString(3, direccion);
			pst.setString(4, web);
			pst.setString(5, correo);
			pst.setInt(6, idcompañia);
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	public void delete(int idagencia) {
		String script = "delete from tblagencia where idagencia = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, idagencia);
			int confirmacion = JOptionPane.showConfirmDialog(null, "desea eliminar el registro perteneciente al id # "+idagencia +"?");
			if (confirmacion==JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "ID " +idagencia + "eliminado");
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	public void read(int idagencia, JTextField nombre, JTextField telefono, JTextField direccion, JTextField web, JTextField correo, JTextField idcompañia) {
		String script = "SELECT * FROM tblagencia where idagencia = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, idagencia);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				nombre.setText(rs.getString(2));
				telefono.setText(rs.getString(3));
				direccion.setText(rs.getString(4));
				web.setText(rs.getString(5));
				correo.setText(rs.getString(6));
				idcompañia.setText(rs.getString(7));
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	/*public void update() { }*/
}