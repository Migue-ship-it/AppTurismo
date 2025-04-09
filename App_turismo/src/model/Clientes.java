package model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Clientes {
	public int idclientes;
	public String tipodocumento;
	public int numerodocumento;
	public String nombres;
	public String apellidos;
	public String direccion;
	public String correoelectronico;
	public int numerotelefonico;
	public String eps;
	public String alergias;
	public String fechanacimiento;
	public String estadocivil;
	
	Conexion conector = new Conexion();
	Connection conexionBD = null;
	PreparedStatement pst = null; //preparar la transaccion
	
	public Conexion getConector() {
		return conector;
	}
	public void setConector(Conexion conector) {
		this.conector = conector;
	}
	public String getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public int getNumerodocumento() {
		return numerodocumento;
	}
	public void setNumerodocumento(int numerodocumento) {
		this.numerodocumento = numerodocumento;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreoelectronico() {
		return correoelectronico;
	}
	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}
	public int getNumerotelefonico() {
		return numerotelefonico;
	}
	public void setNumerotelefonico(int numerotelefonico) {
		this.numerotelefonico = numerotelefonico;
	}
	public String getEps() {
		return eps;
	}
	public void setEps(String eps) {
		this.eps = eps;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	public int getIdclientes() {
		return idclientes;
	}
	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}
	
	public void create(String tipodocumento, int numerodocumento, String nombres, String apellidos, String direccion, String correoelectronico, int numerotelefonico, String eps,
	String alergias, String fechanacimiento, String estadocivil) {
		String script = "INSERT INTO tblclientes (tipodocumento, numerodocumento, nombres, apellidos, direccion, correoelectronico, numerotelefonico, eps, alergias, fechanacimiento, estadocivil) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setString(1, tipodocumento);
			pst.setInt(2, numerodocumento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, direccion);
			pst.setString(6, correoelectronico);
			pst.setInt(7, numerotelefonico);
			pst.setString(8, eps);
			pst.setString(9, alergias);
			pst.setString(10, fechanacimiento);
			pst.setString(11, estadocivil);
			int confirmacion = JOptionPane.showConfirmDialog(null, "desea crear un nuevo registro?");
			if (confirmacion==JOptionPane.OK_OPTION) {
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null, "Registro creado");
			}
			else {
				JOptionPane.showMessageDialog(null, "No se creo ningun registro");
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	public void delete(int idclientes) {
		String script = "delete from tblclientes where idclientes = ?";
		try {
			conexionBD = conector.conectarBD(); //abrir la conexion
			pst = conexionBD.prepareStatement(script); //abrir el buffer
			pst.setInt(1, idclientes); //parametrizar el campo
			int confirmacion = JOptionPane.showConfirmDialog(null, "desea eliminar el registro perteneciente al id # "+ idclientes +"?");
			if (confirmacion==JOptionPane.OK_OPTION) {
				pst.executeUpdate(); // confirmar la operacion
				JOptionPane.showMessageDialog(null, "ID" + idclientes +" eliminada");
			}
			else {
				JOptionPane.showMessageDialog(null, "No se borro ningun registro");
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	public void read(int idclientes, JTextField tipodocumento, JTextField documento, JTextField nombres, JTextField apellidos, JTextField direccion, JTextField correo, JTextField telefono, JTextField eps,
			JTextField alergias, JTextField fechanacimiento, JTextField estadocivil) {
		String script = "SELECT * FROM tblclientes WHERE idclientes = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, idclientes);
			ResultSet rs = pst.executeQuery(); //almacenamiento temporal
			int confirmacion = JOptionPane.showConfirmDialog(null, "desea leer el registro perteneciente al id # "+idclientes +"?");
			if (confirmacion==JOptionPane.OK_OPTION) {
			while (rs.next()) {
				tipodocumento.setText(rs.getString(2));
				documento.setText(rs.getString(3));
				nombres.setText(rs.getString(4));
				apellidos.setText(rs.getString(5));
				direccion.setText(rs.getString(6));
				correo.setText(rs.getString(7));
				telefono.setText(rs.getString(8));
				eps.setText(rs.getString(9));
				alergias.setText(rs.getString(10));
				fechanacimiento.setText(rs.getString(11));
				estadocivil.setText(rs.getString(12));
				JOptionPane.showMessageDialog(null, "Lectura de registro del ID # " +idclientes + " finalizada");
			}
			}
			else {
				JOptionPane.showMessageDialog(null, "No se leyo ningun registro");
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	public void update(int idclientes, String tipodocumento, int numerodocumento, String nombres, String apellidos, String direccion, String correoelectronico, int numerotelefonico, String eps,
			String alergias, String fechanacimiento, String estadocivil) {
		String script = "UPDATE tblclientes set tipodocumento = ?, numerodocumento = ?, nombres = ?, apellidos = ?, direccion = ?, correoelectronico = ?, numerotelefonico = ?, eps = ?, alergias = ?, fechanacimiento = ?, estadocivil = ? where idclientes = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setString(1, tipodocumento);
			pst.setInt(2, numerodocumento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, direccion);
			pst.setString(6, correoelectronico);
			pst.setInt(7, numerotelefonico);
			pst.setString(8, eps);
			pst.setString(9, alergias);
			pst.setString(10, fechanacimiento);
			pst.setString(11, estadocivil);
			pst.setInt(12, idclientes);
			int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro perteneciente al id # "+idclientes+"?");
			if (confirmacion==JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "ID "+idclientes+" actualizado");
			}
			else {
				JOptionPane.showMessageDialog(null, "No se modifico ningun registro");
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
}