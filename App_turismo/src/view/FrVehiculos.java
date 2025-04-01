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
import javax.swing.ImageIcon;
import java.awt.Toolkit;

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
	private JButton btnBorrar;
	private JTextField textIDVehiculo;
	private JLabel lblidVehiculo;
	Vehiculos cr = new Vehiculos();
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\172508_motorcycle_icon.png"));
		setTitle("VEHICULOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 402);
		vehiculosPane = new JPanel();
		vehiculosPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(vehiculosPane);
		vehiculosPane.setLayout(null);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\326688_floppy_save_guardar_icon.png"));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
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
		btnGuardar.setBounds(202, 303, 65, 49);
		vehiculosPane.add(btnGuardar);
		
		JLabel lblMatricula = new JLabel("matricula");
		lblMatricula.setBounds(40, 80, 59, 14);
		vehiculosPane.add(lblMatricula);
		
		JLabel lblMarca = new JLabel("marca");
		lblMarca.setBounds(40, 105, 59, 14);
		vehiculosPane.add(lblMarca);
		
		JLabel lblPuestos = new JLabel("puestos");
		lblPuestos.setBounds(40, 138, 59, 14);
		vehiculosPane.add(lblPuestos);
		
		JLabel lblModelo = new JLabel("modelo");
		lblModelo.setBounds(40, 163, 59, 14);
		vehiculosPane.add(lblModelo);
		
		JLabel lblNoMotor = new JLabel("Numero de motores");
		lblNoMotor.setBounds(40, 194, 94, 14);
		vehiculosPane.add(lblNoMotor);
		
		JLabel lblCategoria = new JLabel("categoria");
		lblCategoria.setBounds(40, 219, 59, 14);
		vehiculosPane.add(lblCategoria);
		
		textMatricula = new JTextField();
		textMatricula.setColumns(10);
		textMatricula.setBounds(181, 77, 211, 20);
		vehiculosPane.add(textMatricula);
		
		textMarca = new JTextField();
		textMarca.setColumns(10);
		textMarca.setBounds(181, 102, 211, 20);
		vehiculosPane.add(textMarca);
		
		textPuestos = new JTextField();
		textPuestos.setColumns(10);
		textPuestos.setBounds(181, 129, 86, 20);
		vehiculosPane.add(textPuestos);
		
		textModelo = new JTextField();
		textModelo.setColumns(10);
		textModelo.setBounds(181, 160, 211, 20);
		vehiculosPane.add(textModelo);
		
		textNoMotor = new JTextField();
		textNoMotor.setColumns(10);
		textNoMotor.setBounds(181, 191, 86, 20);
		vehiculosPane.add(textNoMotor);
		
		textCategoria = new JTextField();
		textCategoria.setColumns(10);
		textCategoria.setBounds(181, 216, 212, 20);
		vehiculosPane.add(textCategoria);
		
		lblVehiculos = new JLabel("DATOS VEHICULOS");
		lblVehiculos.setBounds(146, 21, 104, 14);
		vehiculosPane.add(lblVehiculos);
		
		textIDTipoVehiculo = new JTextField();
		textIDTipoVehiculo.setColumns(10);
		textIDTipoVehiculo.setBounds(181, 253, 211, 20);
		vehiculosPane.add(textIDTipoVehiculo);
		
		lblidTipoVehiculo = new JLabel("ID Tipo de Vehiculo");
		lblidTipoVehiculo.setBounds(40, 256, 131, 14);
		vehiculosPane.add(lblidTipoVehiculo);
		
		btnBorrar = new JButton("");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				cr.delete(Integer.parseInt(textIDVehiculo.getText()));
				textIDVehiculo.setText("");
			}
		});
		btnBorrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564505_close_delete_exit_remove_icon.png"));
		btnBorrar.setBounds(107, 303, 65, 49);
		vehiculosPane.add(btnBorrar);
		
		textIDVehiculo = new JTextField();
		textIDVehiculo.setColumns(10);
		textIDVehiculo.setBounds(181, 46, 211, 20);
		vehiculosPane.add(textIDVehiculo);
		
		lblidVehiculo = new JLabel("ID del vehiculo");
		lblidVehiculo.setBounds(40, 55, 94, 14);
		vehiculosPane.add(lblidVehiculo);
	}

}
