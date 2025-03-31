package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Vehiculos;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrVehiculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel vehiculosPane;
	private JTextField textMatricula;
	private JTextField textMarca;
	private JTextField textPuestos;
	private JTextField textModelo;
	private JTextField textNoMotor;
	private JTextField textCategoria;
	private JLabel lblVehiculos;
	private JTextField textIDTipoVehiculo;
	private JLabel lblidTipoVehiculo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrVehiculos frame = new FrVehiculos();
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
	public FrVehiculos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		vehiculosPane = new JPanel();
		vehiculosPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(vehiculosPane);
		vehiculosPane.setLayout(null);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				Vehiculos cr = new Vehiculos();
				cr.datosVehiculos(textMatricula.getText(), textMarca.getText(), Integer.parseInt(textPuestos.getText()), textModelo.getText(), Integer.parseInt(textNoMotor.getText()),
				textCategoria.getText(), Integer.parseInt(textIDTipoVehiculo.getText()));
				textMatricula.setText("");
				textMarca.setText("");
				textPuestos.setText("");
				textModelo.setText("");
				textNoMotor.setText("");
				textCategoria.setText("");
				textIDTipoVehiculo.setText("");
			}
		});
		btnGuardar.setBounds(283, 212, 89, 23);
		vehiculosPane.add(btnGuardar);
		
		JLabel lblMatricula = new JLabel("matricula");
		lblMatricula.setBounds(40, 39, 59, 14);
		vehiculosPane.add(lblMatricula);
		
		JLabel lblMarca = new JLabel("marca");
		lblMarca.setBounds(40, 64, 59, 14);
		vehiculosPane.add(lblMarca);
		
		JLabel lblPuestos = new JLabel("puestos");
		lblPuestos.setBounds(40, 89, 59, 14);
		vehiculosPane.add(lblPuestos);
		
		JLabel lblModelo = new JLabel("modelo");
		lblModelo.setBounds(40, 114, 59, 14);
		vehiculosPane.add(lblModelo);
		
		JLabel lblNoMotor = new JLabel("Numero de motores");
		lblNoMotor.setBounds(40, 139, 94, 14);
		vehiculosPane.add(lblNoMotor);
		
		JLabel lblCategoria = new JLabel("categoria");
		lblCategoria.setBounds(40, 164, 59, 14);
		vehiculosPane.add(lblCategoria);
		
		textMatricula = new JTextField();
		textMatricula.setColumns(10);
		textMatricula.setBounds(181, 36, 86, 20);
		vehiculosPane.add(textMatricula);
		
		textMarca = new JTextField();
		textMarca.setColumns(10);
		textMarca.setBounds(181, 61, 86, 20);
		vehiculosPane.add(textMarca);
		
		textPuestos = new JTextField();
		textPuestos.setColumns(10);
		textPuestos.setBounds(181, 86, 86, 20);
		vehiculosPane.add(textPuestos);
		
		textModelo = new JTextField();
		textModelo.setColumns(10);
		textModelo.setBounds(181, 111, 86, 20);
		vehiculosPane.add(textModelo);
		
		textNoMotor = new JTextField();
		textNoMotor.setColumns(10);
		textNoMotor.setBounds(181, 136, 86, 20);
		vehiculosPane.add(textNoMotor);
		
		textCategoria = new JTextField();
		textCategoria.setColumns(10);
		textCategoria.setBounds(181, 161, 86, 20);
		vehiculosPane.add(textCategoria);
		
		lblVehiculos = new JLabel("DATOS VEHICULOS");
		lblVehiculos.setBounds(165, 11, 104, 14);
		vehiculosPane.add(lblVehiculos);
		
		textIDTipoVehiculo = new JTextField();
		textIDTipoVehiculo.setColumns(10);
		textIDTipoVehiculo.setBounds(181, 186, 86, 20);
		vehiculosPane.add(textIDTipoVehiculo);
		
		lblidTipoVehiculo = new JLabel("ID Tipo de Vehiculo");
		lblidTipoVehiculo.setBounds(40, 189, 131, 14);
		vehiculosPane.add(lblidTipoVehiculo);
	}

}
