package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Agencia;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrAgencia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel agenciaPane;
	private JTextField textNombre;
	private JTextField textTelefono;
	private JTextField textDireccion;
	private JTextField textWeb;
	private JTextField textCorreo;
	private JLabel lblAgencia;
	private JTextField textidCompañia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrAgencia frame = new FrAgencia();
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
	public FrAgencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		agenciaPane = new JPanel();
		agenciaPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(agenciaPane);
		agenciaPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setBounds(27, 49, 46, 14);
		agenciaPane.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("telefono");
		lblTelefono.setBounds(27, 83, 46, 17);
		agenciaPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setBounds(27, 111, 46, 20);
		agenciaPane.add(lblDireccion);
		
		JLabel lblWeb = new JLabel("web");
		lblWeb.setBounds(27, 150, 46, 14);
		agenciaPane.add(lblWeb);
		
		JLabel lblCorreo = new JLabel("correo");
		lblCorreo.setBounds(27, 181, 46, 14);
		agenciaPane.add(lblCorreo);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(94, 46, 171, 20);
		agenciaPane.add(textNombre);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(94, 81, 171, 20);
		agenciaPane.add(textTelefono);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(94, 112, 171, 20);
		agenciaPane.add(textDireccion);
		
		textWeb = new JTextField();
		textWeb.setColumns(10);
		textWeb.setBounds(94, 147, 171, 20);
		agenciaPane.add(textWeb);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(94, 178, 171, 20);
		agenciaPane.add(textCorreo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				Agencia cr = new Agencia();
				cr.create(textNombre.getText(), Integer.parseInt(textTelefono.getText()), textDireccion.getText(), textWeb.getText(), textCorreo.getText(), Integer.parseInt(textidCompañia.getText()));
				textNombre.setText("");
				textTelefono.setText("");
				textDireccion.setText("");
				textWeb.setText("");
				textCorreo.setText("");
				textidCompañia.setText("");
				}
		});
		btnGuardar.setBounds(302, 127, 89, 23);
		agenciaPane.add(btnGuardar);
		
		lblAgencia = new JLabel("DATOS AGENCIA");
		lblAgencia.setBounds(163, 11, 107, 14);
		agenciaPane.add(lblAgencia);
		
		JLabel lblidCompañia = new JLabel("idcompañia");
		lblidCompañia.setBounds(27, 212, 57, 14);
		agenciaPane.add(lblidCompañia);
		
		textidCompañia = new JTextField();
		textidCompañia.setColumns(10);
		textidCompañia.setBounds(94, 209, 171, 20);
		agenciaPane.add(textidCompañia);
	}
}
