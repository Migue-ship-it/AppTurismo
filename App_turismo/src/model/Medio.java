package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Medio {
	public int idmedio;
	public String nombre;
	public String observacion;
	public int idtipo;
	
	Conexion conector = new Conexion();
	Connection conexionBD = null;
	PreparedStatement pst = null;
	
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
	public int getIdmedio() {
		return idmedio;
	}
	public void setIdmedio(int idmedio) {
		this.idmedio = idmedio;
	}
	
	public void datosMedio(String nombre, String observacion, int idtipo) {
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
	public void delete(int idmedio) {
		String script = "delete from tblmedio where idmedio = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, idmedio);
			int confirmacion = JOptionPane.showConfirmDialog(null, "desea eliminar esta fila?");
			if (confirmacion==JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "fila eliminada");
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
}
	public void read(int idmedio, JTextField nombre, JTextField observacion, JTextField idtipomedio) {
		String script = "SELECT * FROM tblmedio WHERE idmedio = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, idmedio);
			ResultSet rs = pst.executeQuery(); //almacenamiento temporal
			while (rs.next()) {
				nombre.setText(rs.getString(2));
				observacion.setText(rs.getString(3));
				idtipomedio.setText(rs.getString(4));
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	
}