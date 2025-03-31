package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import controller.Conexion;

public class TiposMedio {
	public String nombre="";
	public String observacion="";
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
	
	public void create(String nombre, String observacion) {
		Connection conexionBD = null;
		PreparedStatement pst = null; //preparar la transaccion
		String script = "INSERT INTO tbltiposmedio (nombre, observacion) VALUES (?, ?)";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			
			pst.setString(1, nombre);
			pst.setString(2, observacion);
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
}