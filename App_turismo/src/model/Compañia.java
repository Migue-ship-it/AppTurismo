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
	PreparedStatement pst = null; //preparar la transaccion
	
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
			int confirmacion = JOptionPane.showConfirmDialog(null, "desea crear un nuevo registro?");
			if (confirmacion==JOptionPane.OK_OPTION) {
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null, "Registro con exito");
			}
			else {
				JOptionPane.showMessageDialog(null, "No se creo ningun registro");
			}
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
			int confirmacion = JOptionPane.showConfirmDialog(null, "desea eliminar el registro perteneciente al id # "+ idcompañia +"?");
			if (confirmacion==JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "ID " + idcompañia + " eliminada");
			}
			else {
				JOptionPane.showMessageDialog(null, "No se borro ningun registro");
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
			int confirmacion = JOptionPane.showConfirmDialog(null, "desea leer el registro perteneciente al id # "+idcompañia +"?");
			if (confirmacion==JOptionPane.OK_OPTION) {
			while (rs.next()) {
				telefono.setText(rs.getString(2));
				direccion.setText(rs.getString(3));
				fechacreacion.setText(rs.getString(4));
				razonsocial.setText(rs.getString(5));
				correo.setText(rs.getString(6));
				web.setText(rs.getString(7));
				JOptionPane.showMessageDialog(null, "Lectura de registro del ID # " +idcompañia + " finalizada");
			}
			}
			else {
				JOptionPane.showMessageDialog(null, "No se leyo ningun registro");
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	public void update(int idcompañia, int telefono, String direccion, String fechacreacion, String razonsocial, String correo, String web) {
		String script = "UPDATE tblcompañia set telefono = ?, direccion = ?, fechacreacion = ?, razonsocial = ?, correo = ?, web = ? where idcompañia = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, telefono);
			pst.setString(2, direccion);
			pst.setString(3, fechacreacion);
			pst.setString(4, razonsocial);
			pst.setString(5, correo);
			pst.setString(6, web);
			pst.setInt(7, idcompañia);
			int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro perteneciente al id # "+idcompañia+"?");
			if (confirmacion==JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "ID "+idcompañia+" actualizado");
			}
			else {
				JOptionPane.showMessageDialog(null, "No se modifico ningun registro");
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
}