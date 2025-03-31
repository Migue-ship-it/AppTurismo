package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import controller.Conexion;

public class Medio {
	public String nombre="";
	public String observacion="";
	public int idtipo=0;
	Conexion conector = new Conexion();
	
	public Conexion getConector() {
		return conector;
	}
	public void setConector(Conexion conector) {
		this.conector = conector;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public int getIdtipo() {
		return idtipo;
	}
	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}
	
	public void datosMedio(String nombre, String observacion, int idtipo) {
		Connection conexionBD = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tblmedio (nombre, observacion, idtipo) VALUES (?, ?, ?)";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setString(1, nombre);
			pst.setString(2, observacion);
			pst.setInt(3, idtipo);
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
}