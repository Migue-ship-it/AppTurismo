package model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;
import view.FrPrincipal;

public class Promotor {
	public int idpromotor;
	public String nombres;
	public String apellidos;
	public String correopersonal;
	public int numerotelefonico;
	public String tipodocumento;
	public int documento;
	public String correocorp;
	public String direccion;
	public String fechanacimiento;
	public String password;
	Conexion conector = new Conexion();
	Connection conexionBD = null;
	PreparedStatement pst = null; //preparar la transaccion
	FrPrincipal principal = new FrPrincipal();//Interfaz del promotor (principal)
	
	public Conexion getConector() {
		return conector;
	}
	public void setConector(Conexion conector) {
		this.conector = conector;
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
	public String getCorreopersonal() {
		return correopersonal;
	}
	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
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
	public String getCorreocorp() {
		return correocorp;
	}
	public void setCorreocorp(String correocorp) {
		this.correocorp = correocorp;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public int getIdpromotor() {
		return idpromotor;
	}
	public void setIdpromotor(int idpromotor) {
		this.idpromotor = idpromotor;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public FrPrincipal getPrincipal() {
		return principal;
	}
	public void setPrincipal(FrPrincipal principal) {
		this.principal = principal;
	}
	public void create(String nombres, String apellidos, String correopersonal, int numerotelefonico, String tipodocumento, int documento, String correocorp, String direccion, String fechanacimiento) {
		String script = " INSERT INTO tblpromotor (nombres, apellidos, correopersonal, numerotelefonico, tipodocumento, documento, correocorp, direccion, fechanacimiento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			conexionBD = conector.conectarBD(); //abrir la conexion
			pst = conexionBD.prepareStatement(script); //abrir el buffer
			pst.setString(1, nombres);
			pst.setString(2, apellidos);
			pst.setString(3, correopersonal);
			pst.setInt(4, numerotelefonico);
			pst.setString(5, tipodocumento);
			pst.setInt(6, documento);
			pst.setString(7, correocorp);
			pst.setString(8, direccion);
			pst.setString(9, fechanacimiento);
			int confirmacion = JOptionPane.showConfirmDialog(null, "desea crear un nuevo registro?");
			if (confirmacion==JOptionPane.OK_OPTION) {
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null, "Registro con exito");
			}
			else {
				JOptionPane.showMessageDialog(null, "No se creo ningun registro");
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	public void delete(int idpromotor) {
		String script = "delete from tblpromotor where idpromotor = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, idpromotor);
			int confirmacion = JOptionPane.showConfirmDialog(null, "desea eliminar el registro perteneciente al id # "+ idpromotor + " ?");
			if (confirmacion==JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "ID " + idpromotor + " eliminada");
			}
			else {
				JOptionPane.showMessageDialog(null, "No se borro ningun registro");
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	public void read(int idpromotor, JTextField nombres, JTextField apellidos, JTextField correopersonal, JTextField telefono
			, JTextField tipodocumento, JTextField documento, JTextField correocorp, JTextField direccion, JTextField fechanacimiento) {
		String script = "SELECT * FROM tblpromotor WHERE idpromotor = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, idpromotor);
			ResultSet rs = pst.executeQuery(); //almacenamiento temporal
			int confirmacion = JOptionPane.showConfirmDialog(null, "desea leer el registro perteneciente al id # "+idpromotor +" ?");
			if (confirmacion==JOptionPane.OK_OPTION) {
			while (rs.next()) {
				nombres.setText(rs.getString(2));
				apellidos.setText(rs.getString(3));
				correopersonal.setText(rs.getString(4));
				telefono.setText(rs.getString(5));
				tipodocumento.setText(rs.getString(6));
				documento.setText(rs.getString(7));
				correocorp.setText(rs.getString(8));
				direccion.setText(rs.getString(9));
				fechanacimiento.setText(rs.getString(10));
				JOptionPane.showMessageDialog(null, "Lectura de registro del ID # " +idpromotor + " finalizada");
			}
			}
			else {
				JOptionPane.showMessageDialog(null, "No se leyo ningun registro");
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	public void update(int idpromotor, String nombres, String apellidos, String correopersonal, int numerotelefonico, String tipodocumento, int documento, String correocorp, String direccion, String fechanacimiento) {
		String script = "UPDATE tblpromotor set nombres = ?, apellidos = ?, correopersonal = ?, numerotelefonico = ?, tipodocumento = ?, documento = ?, correocorp = ?, direccion = ?, fechanacimiento = ? where idpromotor = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setString(1, nombres);
			pst.setString(2, apellidos);
			pst.setString(3, correopersonal);
			pst.setInt(4, numerotelefonico);
			pst.setString(5, tipodocumento);
			pst.setInt(6, documento);
			pst.setString(7, correocorp);
			pst.setString(8, direccion);
			pst.setString(9, fechanacimiento);
			pst.setInt(10, idpromotor);
			int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro perteneciente al id # "+ idpromotor +"?");
			if (confirmacion==JOptionPane.OK_OPTION) {
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "ID "+ idpromotor +" actualizado");
			}
			else {
				JOptionPane.showMessageDialog(null, "No se modifico ningun registro");
			}
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}
	}
	public void controlacceso(int user, String password) {
		String script = "SELECT * FROM tblpromotor WHERE documento = ? and contrasena = ?";
		try {
			conexionBD = conector.conectarBD();
			pst = conexionBD.prepareStatement(script);
			pst.setInt(1, user);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				principal.setVisible(true);
				JOptionPane.showMessageDialog(null, "Acceso permitido");
			}
			else {
				JOptionPane.showMessageDialog(null, "No se registro correctamente al control de acceso"); //si el campo user es correcto a diferencia de la contraseña enviara este mensaje 
			}	
		} catch (SQLException errorcontrolacceso) {
			System.out.println(errorcontrolacceso.getMessage());
		}
	}
}