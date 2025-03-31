package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Promotor;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrPromotor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel promotorPane;
	private JTextField textNombres;
	private JTextField textApellidos;
	private JTextField textDireccion;
	private JTextField textFechaNacimiento;
	private JTextField textCorreoPersonal;
	private JTextField textNoTelefono;
	private JTextField textTipoDocumento;
	private JTextField textNoDocumento;
	private JTextField textCorreoCorporativo;
	private JLabel lblPromotor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrPromotor frame = new FrPromotor();
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
	public FrPromotor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		promotorPane = new JPanel();
		promotorPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(promotorPane);
		promotorPane.setLayout(null);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Promotor create = new Promotor();
				create.create(textNombres.getText(), textApellidos.getText(), textCorreoPersonal.getText(), Integer.parseInt(textNoTelefono.getText()), textTipoDocumento.getText(),
				Integer.parseInt(textNoDocumento.getText()), textCorreoCorporativo.getText(), textDireccion.getText(), textFechaNacimiento.getText());
				textNombres.setText("");
				textApellidos.setText("");
				textCorreoPersonal.setText("");
				textNoTelefono.setText("");
				textTipoDocumento.setText("");
				textNoDocumento.setText("");
				textCorreoCorporativo.setText("");
				textDireccion.setText("");
				textFechaNacimiento.setText("");
			}
		});
		btnGuardar.setBounds(301, 216, 89, 23);
		promotorPane.add(btnGuardar);
		
		JLabel lblNombres = new JLabel("nombres");
		lblNombres.setBounds(30, 45, 73, 14);
		promotorPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("apellidos");
		lblApellidos.setBounds(30, 70, 73, 14);
		promotorPane.add(lblApellidos);
		
		JLabel lblCorreoPersonal = new JLabel("correo personal");
		lblCorreoPersonal.setBounds(30, 95, 86, 14);
		promotorPane.add(lblCorreoPersonal);
		
		JLabel lblNoTelefono = new JLabel("No. telefono");
		lblNoTelefono.setBounds(30, 120, 73, 14);
		promotorPane.add(lblNoTelefono);
		
		JLabel lblTipoDocumento = new JLabel("tipo documento");
		lblTipoDocumento.setBounds(30, 151, 86, 14);
		promotorPane.add(lblTipoDocumento);
		
		JLabel lblNoDocumento = new JLabel("No. documento");
		lblNoDocumento.setBounds(30, 176, 73, 14);
		promotorPane.add(lblNoDocumento);
		
		JLabel lblCorreoCorporativo = new JLabel("correo corporativo");
		lblCorreoCorporativo.setBounds(30, 203, 98, 14);
		promotorPane.add(lblCorreoCorporativo);
		
		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setBounds(226, 45, 73, 14);
		promotorPane.add(lblDireccion);
		
		JLabel lblFechaNacimiento = new JLabel("fecha de nacimiento");
		lblFechaNacimiento.setBounds(226, 64, 98, 20);
		promotorPane.add(lblFechaNacimiento);
		
		textNombres = new JTextField();
		textNombres.setColumns(10);
		textNombres.setBounds(113, 42, 86, 20);
		promotorPane.add(textNombres);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(113, 67, 86, 20);
		promotorPane.add(textApellidos);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(281, 42, 86, 20);
		promotorPane.add(textDireccion);
		
		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setColumns(10);
		textFechaNacimiento.setBounds(226, 92, 141, 20);
		promotorPane.add(textFechaNacimiento);
		
		textCorreoPersonal = new JTextField();
		textCorreoPersonal.setColumns(10);
		textCorreoPersonal.setBounds(113, 92, 86, 20);
		promotorPane.add(textCorreoPersonal);
		
		textNoTelefono = new JTextField();
		textNoTelefono.setColumns(10);
		textNoTelefono.setBounds(113, 120, 86, 20);
		promotorPane.add(textNoTelefono);
		
		textTipoDocumento = new JTextField();
		textTipoDocumento.setColumns(10);
		textTipoDocumento.setBounds(113, 148, 86, 20);
		promotorPane.add(textTipoDocumento);
		
		textNoDocumento = new JTextField();
		textNoDocumento.setColumns(10);
		textNoDocumento.setBounds(113, 176, 86, 20);
		promotorPane.add(textNoDocumento);
		
		textCorreoCorporativo = new JTextField();
		textCorreoCorporativo.setColumns(10);
		textCorreoCorporativo.setBounds(123, 200, 76, 20);
		promotorPane.add(textCorreoCorporativo);
		
		lblPromotor = new JLabel("DATOS PROMOTOR");
		lblPromotor.setBounds(151, 20, 120, 14);
		promotorPane.add(lblPromotor);
	}

}
