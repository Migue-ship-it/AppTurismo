package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Operador {
	public int idoperador;
	public String nombres;
	public String apellidos;
	public String correoelectronico;
	public int numerotelefonico;
	public String tipodocumento;
	public int documento;
	public String direccion;
	public int idvehiculo;
	Conexion conector = new Conexion();
	Connection conexionBD = null;
	PreparedStatement pst = null;
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public Conexion getConector() {
		return conector;
	}
	public void setConector(Conexion conector) {
		this.conector = conector;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	public String getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getIdvehiculo() {
		return idvehiculo;
	}
	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}
	public int getIdoperador() {
		return idoperador;
	}
	public void setIdoperador(int idoperador) {
		this.idoperador = idoperador;
	}
	
	public void datosOperador(String nombres, String apellidos, String correoelectronico, int numerotelefonico, String tipodocumento, int documento, String direccion, int idvehiculo) {
		String script = "INSERT INTO tbloperador (nombres, apellidos, correoelectronico, numerotelefonico, tipodocumento, documento, direccion, idvehiculo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setString(1, nombres);
			pst.setString(2, apellidos);
			pst.setString(3, correoelectronico);
			pst.setInt(4, numerotelefonico);
			pst.setString(5, tipodocumento);
			pst.setInt(6, documento);
			pst.setString(7, direccion);
			pst.setInt(8, idvehiculo);
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	public void delete(int idoperador) {
		String script = "delete from tbloperador where id = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, idoperador);
			int confirmacion = JOptionPane.showConfirmDialog(null, "desea eliminar esta fila?");
			if (confirmacion==JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "fila eliminada");
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
}
	public void read(int idoperador, JTextField nombres, JTextField apellidos, JTextField correo, JTextField telefono, JTextField tipodocumento, JTextField documento, JTextField direccion, JTextField idvehiculo) {
		String script = "SELECT * FROM tbloperador WHERE id = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, idoperador);
			ResultSet rs = pst.executeQuery(); //almacenamiento temporal
			while (rs.next()) {
				nombres.setText(rs.getString(2));
				apellidos.setText(rs.getString(3));
				correo.setText(rs.getString(4));
				telefono.setText(rs.getString(5));
				tipodocumento.setText(rs.getString(6));
				documento.setText(rs.getString(7));
				direccion.setText(rs.getString(8));
				idvehiculo.setText(rs.getString(9));
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	
}