package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Clientes;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel ClientesPane;
	private JTextField textNoDocumento;
	private JTextField textNombres;
	private JTextField textApellidos;
	private JTextField textDireccion;
	private JTextField textCorreo;
	private JTextField textNoTelefono;
	private JTextField textEstadoCivil;
	private JTextField textFechaNacimiento;
	private JTextField textAlergias;
	private JTextField textEps;
	private JTextField textTipoDocumento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrClientes frame = new FrClientes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ClientesPane = new JPanel();
		ClientesPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ClientesPane);
		ClientesPane.setLayout(null);
		
		JLabel lblTipoDeDocumento = new JLabel("tipo de documento");
		lblTipoDeDocumento.setBounds(24, 48, 97, 17);
		ClientesPane.add(lblTipoDeDocumento);
		
		JLabel lblNoDocumento = new JLabel("No. documento");
		lblNoDocumento.setBounds(24, 73, 73, 14);
		ClientesPane.add(lblNoDocumento);
		
		JLabel lblNombres = new JLabel("nombres");
		lblNombres.setBounds(24, 97, 46, 14);
		ClientesPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("apellidos");
		lblApellidos.setBounds(24, 120, 46, 14);
		ClientesPane.add(lblApellidos);
		
		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setBounds(24, 145, 46, 14);
		ClientesPane.add(lblDireccion);
		
		JLabel lblCorreoElectronico = new JLabel("correo electronico");
		lblCorreoElectronico.setBounds(24, 170, 97, 14);
		ClientesPane.add(lblCorreoElectronico);
		
		JLabel lblNoTelefono = new JLabel("No. telefono");
		lblNoTelefono.setBounds(24, 196, 73, 14);
		ClientesPane.add(lblNoTelefono);
		
		JLabel lblEps = new JLabel("E.P.S");
		lblEps.setBounds(238, 49, 46, 14);
		ClientesPane.add(lblEps);
		
		JLabel lblAlergias = new JLabel("alergias");
		lblAlergias.setBounds(226, 73, 46, 14);
		ClientesPane.add(lblAlergias);
		
		JLabel lblFechaDeNacimiento = new JLabel("fecha de nacimiento");
		lblFechaDeNacimiento.setBounds(226, 97, 105, 14);
		ClientesPane.add(lblFechaDeNacimiento);
		
		JLabel lblEstadoCivil = new JLabel("estado civil");
		lblEstadoCivil.setBounds(226, 145, 73, 14);
		ClientesPane.add(lblEstadoCivil);
		
		textNoDocumento = new JTextField();
		textNoDocumento.setColumns(10);
		textNoDocumento.setBounds(131, 70, 86, 20);
		ClientesPane.add(textNoDocumento);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Clientes create = new Clientes();
			create.create(textTipoDocumento.getText(), Integer.parseInt(textNoDocumento.getText()), textNombres.getText(), textApellidos.getText(), textDireccion.getText(), 
			textCorreo.getText(), Integer.parseInt(textNoTelefono.getText()), textEps.getText(), textAlergias.getText(), textFechaNacimiento.getText(), textEstadoCivil.getText());
			textTipoDocumento.setText("");
			textNoDocumento.setText("");
			textNombres.setText("");
			textApellidos.setText("");
			textDireccion.setText("");
			textCorreo.setText("");
			textNoTelefono.setText("");
			textEps.setText("");
			textAlergias.setText("");
			textFechaNacimiento.setText("");
			textEstadoCivil.setText("");
			}
		});
		btnGuardar.setBounds(267, 187, 89, 23);
		ClientesPane.add(btnGuardar);
		
		textNombres = new JTextField();
		textNombres.setColumns(10);
		textNombres.setBounds(131, 94, 86, 20);
		ClientesPane.add(textNombres);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(131, 117, 86, 20);
		ClientesPane.add(textApellidos);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(131, 142, 86, 20);
		ClientesPane.add(textDireccion);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(131, 167, 86, 20);
		ClientesPane.add(textCorreo);
		
		textNoTelefono = new JTextField();
		textNoTelefono.setColumns(10);
		textNoTelefono.setBounds(131, 193, 86, 20);
		ClientesPane.add(textNoTelefono);
		
		textEstadoCivil = new JTextField();
		textEstadoCivil.setColumns(10);
		textEstadoCivil.setBounds(296, 145, 86, 20);
		ClientesPane.add(textEstadoCivil);
		
		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setColumns(10);
		textFechaNacimiento.setBounds(226, 117, 156, 20);
		ClientesPane.add(textFechaNacimiento);
		
		textAlergias = new JTextField();
		textAlergias.setColumns(10);
		textAlergias.setBounds(296, 70, 86, 20);
		ClientesPane.add(textAlergias);
		
		JLabel lblClientes = new JLabel("DATOS CLIENTES");
		lblClientes.setBounds(185, 20, 90, 14);
		ClientesPane.add(lblClientes);
		
		textEps = new JTextField();
		textEps.setBounds(296, 46, 86, 20);
		ClientesPane.add(textEps);
		textEps.setColumns(10);
		
		textTipoDocumento = new JTextField();
		textTipoDocumento.setBounds(131, 46, 86, 20);
		ClientesPane.add(textTipoDocumento);
		textTipoDocumento.setColumns(10);
	}
}
