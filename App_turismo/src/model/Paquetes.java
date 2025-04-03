package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Paquetes {
	public int idpaquete;
	public int codigoventa;
	public int iddestino;
	public int idorigen;
	public String fechaventa;
	public String horaventa;
	public String fechaejecucion;
	public String horasalida;
	public String observacion;
	public String precio;
	public int idagencia;
	public int idvehiculo;
	public int idclientes;
	public int idpromotor;

	Conexion conector = new Conexion();
	Connection conexionBD = null;
	PreparedStatement pst = null;
	
	public Conexion getConector() {
		return conector;
	}
	public void setConector(Conexion conector) {
		this.conector = conector;
	}
	public int getCodigoventa() {
		return codigoventa;
	}
	public void setCodigoventa(int codigoventa) {
		this.codigoventa = codigoventa;
	}
	public int getIddestino() {
		return iddestino;
	}
	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
	}
	public int getIdorigen() {
		return idorigen;
	}
	public void setIdorigen(int idorigen) {
		this.idorigen = idorigen;
	}
	public String getFechaventa() {
		return fechaventa;
	}
	public void setFechaventa(String fechaventa) {
		this.fechaventa = fechaventa;
	}
	public String getHoraventa() {
		return horaventa;
	}
	public void setHoraventa(String horaventa) {
		this.horaventa = horaventa;
	}
	public String getFechaejecucion() {
		return fechaejecucion;
	}
	public void setFechaejecucion(String fechaejecucion) {
		this.fechaejecucion = fechaejecucion;
	}
	public String getHorasalida() {
		return horasalida;
	}
	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public int getIdagencia() {
		return idagencia;
	}
	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}
	public int getIdvehiculo() {
		return idvehiculo;
	}
	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}
	public int getIdclientes() {
		return idclientes;
	}
	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}
	public int getIdpromotor() {
		return idpromotor;
	}
	public void setIdpromotor(int idpromotor) {
		this.idpromotor = idpromotor;
	}
	public int getIdpaquete() {
		return idpaquete;
	}
	public void setIdpaquete(int idpaquete) {
		this.idpaquete = idpaquete;
	}
	
	public void datosPaquetes(int codigoventa, int iddestino, int idorigen, String fechaventa, String horaventa, String fechaejecucion, String horasalida, String observacion, String precio, int idagencia,
		int idvehiculo, int idclientes, int idpromotor) {
		String script = "INSERT INTO tblpaquetes (codigoventa, iddestino, idorigen, fechaventa, horaventa, fechaejecucion, horasalida, observacion, precio, idagencia, idvehiculo, idclientes, idpromotor) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, codigoventa);
			pst.setInt(2, iddestino);
			pst.setInt(3, idorigen);
			pst.setString(4, fechaventa);
			pst.setString(5, horaventa);
			pst.setString(6, fechaejecucion);
			pst.setString(7, horasalida);
			pst.setString(8, observacion);
			pst.setString(9, precio);
			pst.setInt(10, idagencia);
			pst.setInt(11, idvehiculo);
			pst.setInt(12, idclientes);
			pst.setInt(13, idpromotor);
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	public void delete(int idpaquete) {
		String script = "delete from tblpaquetes where idpaquete = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, idpaquete);
			int confirmacion = JOptionPane.showConfirmDialog(null, "desea eliminar esta fila?");
			if (confirmacion==JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "fila eliminada");
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	public void read(int idpaquete, JTextField codigoventa, JTextField iddestino, JTextField idorigen, JTextField fechaventa, JTextField horaventa, JTextField fechaejecucion, JTextField horasalida,
			JTextField observacion, JTextField precio, JTextField idagencia, JTextField idvehiculo, JTextField idclientes, JTextField idpromotor) {
		String script = "SELECT * FROM tblpaquetes WHERE idpaquete = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, idpaquete);
			ResultSet rs = pst.executeQuery(); //almacenamiento temporal
			while (rs.next()) {
				codigoventa.setText(rs.getString(2));
				iddestino.setText(rs.getString(3));
				idorigen.setText(rs.getString(4));
				fechaventa.setText(rs.getString(5));
				horaventa.setText(rs.getString(6));
				fechaejecucion.setText(rs.getString(7));
				horasalida.setText(rs.getString(8));
				observacion.setText(rs.getString(9));
				precio.setText(rs.getString(10));
				idagencia.setText(rs.getString(11));
				idvehiculo.setText(rs.getString(12));
				idclientes.setText(rs.getString(13));
				idpromotor.setText(rs.getString(14));
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
}