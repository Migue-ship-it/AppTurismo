package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Compañia;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrCompañia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel CompañiaPane;
	private JTextField textTelefono;
	private JTextField textDireccion;
	private JTextField textFechaDeCreacion;
	private JTextField textRazonSocial;
	private JTextField textCorreo;
	private JTextField textWeb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrCompañia frame = new FrCompañia();
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
	public FrCompañia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		CompañiaPane = new JPanel();
		CompañiaPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(CompañiaPane);
		CompañiaPane.setLayout(null);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
			Compañia create = new Compañia();
			create.create(Integer.parseInt(textTelefono.getText()),textDireccion.getText(),textFechaDeCreacion.getText(), textRazonSocial.getText(), textCorreo.getText(), textWeb.getText());
			textTelefono.setText("");
			textDireccion.setText("");
			textFechaDeCreacion.setText("");
			textRazonSocial.setText("");
			textCorreo.setText("");
			textWeb.setText("");
			}
		});
		btnGuardar.setBounds(302, 193, 89, 23);
		CompañiaPane.add(btnGuardar);
		
		JLabel lblTelefono = new JLabel("telefono");
		lblTelefono.setBounds(28, 55, 71, 14);
		CompañiaPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setBounds(28, 87, 71, 14);
		CompañiaPane.add(lblDireccion);
		
		JLabel lblFechaDeCreacion = new JLabel("fecha de creacion");
		lblFechaDeCreacion.setBounds(28, 112, 94, 14);
		CompañiaPane.add(lblFechaDeCreacion);
		
		JLabel lblRazonSocial = new JLabel("razon social");
		lblRazonSocial.setBounds(28, 140, 71, 14);
		CompañiaPane.add(lblRazonSocial);
		
		JLabel lblCorreo = new JLabel("correo");
		lblCorreo.setBounds(28, 165, 71, 14);
		CompañiaPane.add(lblCorreo);
		
		JLabel lblWeb = new JLabel("web");
		lblWeb.setBounds(28, 197, 71, 14);
		CompañiaPane.add(lblWeb);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(109, 58, 86, 20);
		CompañiaPane.add(textTelefono);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(109, 84, 86, 20);
		CompañiaPane.add(textDireccion);
		
		textFechaDeCreacion = new JTextField();
		textFechaDeCreacion.setColumns(10);
		textFechaDeCreacion.setBounds(132, 109, 86, 20);
		CompañiaPane.add(textFechaDeCreacion);
		
		textRazonSocial = new JTextField();
		textRazonSocial.setColumns(10);
		textRazonSocial.setBounds(109, 137, 86, 20);
		CompañiaPane.add(textRazonSocial);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(109, 162, 86, 20);
		CompañiaPane.add(textCorreo);
		
		textWeb = new JTextField();
		textWeb.setColumns(10);
		textWeb.setBounds(109, 194, 86, 20);
		CompañiaPane.add(textWeb);
		
		JLabel lblCompañia = new JLabel("DATOS COMPAÑIA");
		lblCompañia.setBounds(163, 11, 124, 36);
		CompañiaPane.add(lblCompañia);
	}
}
