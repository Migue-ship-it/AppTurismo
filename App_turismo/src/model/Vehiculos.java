package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Vehiculos {
	public int idvehiculo;
	public String matricula;
	public String marca;
	public int puestos;
	public String modelo;
	public int numeromotor;
	public String categoria;
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
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeromotor() {
		return numeromotor;
	}
	public void setNumeromotor(int numeromotor) {
		this.numeromotor = numeromotor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getIdtipo() {
		return idtipo;
	}
	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}
	public int getIdvehiculo() {
		return idvehiculo;
	}
	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}
	public void datosVehiculos(String matricula, String marca, int puestos, String modelo, int numeromotor, String categoria, int idtipo) {
		String script = "INSERT INTO tblvehiculos (matricula, marca, puestos, modelo, numeromotor, categoria, idtipo) VALUES (?, ?, ?, ?, ?, ?, ?)";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setString(1, matricula);
			pst.setString(2, marca);
			pst.setInt(3, puestos);
			pst.setString(4, modelo);
			pst.setInt(5, numeromotor);
			pst.setString(6, categoria);
			pst.setInt(7, idtipo);
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	public void delete(int idvehiculo) {
		String script = "delete from tblvehiculos where idvehiculo = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, idvehiculo);
			int confirmacion = JOptionPane.showConfirmDialog(null, "desea eliminar esta fila?");
			if (confirmacion==JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "fila eliminada");
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	public void read(int idvehiculo, JTextField matricula, JTextField marca, JTextField puestos, JTextField modelo, JTextField motores, JTextField categoria, JTextField idtipovehiculo) {
		String script = "SELECT * FROM tblvehiculos WHERE idvehiculo = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, idvehiculo);
			ResultSet rs = pst.executeQuery(); //almacenamiento temporal
			while (rs.next()) {
				matricula.setText(rs.getString(2));
				marca.setText(rs.getString(3));
				puestos.setText(rs.getString(4));
				modelo.setText(rs.getString(5));
				motores.setText(rs.getString(6));
				categoria.setText(rs.getString(7));
				idtipovehiculo.setText(rs.getString(8));
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
}