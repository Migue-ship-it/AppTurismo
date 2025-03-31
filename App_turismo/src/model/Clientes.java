package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import controller.Conexion;

public class Clientes {
	public String tipodocumento="";
	public int numerodocumento=0;
	public String nombres="";
	public String apellidos="";
	public String direccion="";
	public String correoelectronico="";
	public int numerotelefonico=0;
	public String eps="";
	public String alergias="";
	public String fechanacimiento="";
	public String estadocivil="";
	
	Conexion conector = new Conexion();

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
	
	public void create(String tipodocumento, int numerodocumento, String nombres, String apellidos, String direccion, String correoelectronico, int numerotelefonico, String eps,
	String alergias, String fechanacimiento, String estadocivil) {
		Connection conexionBD = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tblclientes (tipodocumento, numerodocumento, nombres, apellidos, direccion, correoelectronico, numerotelefonico, eps, alergias, fechanacimiento, estadocivil)"
		+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
}