package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Paquetes;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;

public class FrPaquetes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel paquetesPane;
	private JTextField textIDdestino;
	private JTextField textIDorigen;
	private JTextField textFechaVenta;
	private JTextField textPrecio;
	private JTextField textHoraVenta;
	private JTextField textFechaEjecucion;
	private JTextField textHoraSalida;
	private JTextField textObservacion;
	private JTextField textCodigoVenta;
	private JLabel lblPaquetes;
	private JLabel lblIdAgencia;
	private JLabel lblIdVehiculo;
	private JLabel lblIdClientes;
	private JLabel lblIdPromotor;
	private JTextField textIDAgencia;
	private JTextField textIDVehiculo;
	private JTextField textIDPromotor;
	private JTextField textIDClientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrPaquetes frame = new FrPaquetes();
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
	public FrPaquetes() {
		setTitle("PAQUETES");
		setBackground(Color.BLACK);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Pictures\\Screenshots\\Captura de pantalla 2025-02-21 100111.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		paquetesPane = new JPanel();
		paquetesPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(paquetesPane);
		paquetesPane.setLayout(null);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				Paquetes cr = new Paquetes();
				cr.datosPaquetes(Integer.parseInt(textCodigoVenta.getText()), Integer.parseInt(textIDdestino.getText()), Integer.parseInt(textIDorigen.getText()), textFechaVenta.getText(),
				textHoraVenta.getText(), textFechaEjecucion.getText(), textHoraSalida.getText(), textObservacion.getText(), textPrecio.getText(), Integer.parseInt(textIDAgencia.getText()), 
				Integer.parseInt(textIDVehiculo.getText()), Integer.parseInt(textIDClientes.getText()), Integer.parseInt(textIDPromotor.getText()));
				textCodigoVenta.setText("");
				textIDdestino.setText("");
				textIDorigen.setText("");
				textFechaVenta.setText("");
				textHoraVenta.setText("");
				textFechaEjecucion.setText("");
				textHoraSalida.setText("");
				textObservacion.setText("");
				textPrecio.setText("");
				textIDAgencia.setText("");
				textIDVehiculo.setText("");
				textIDClientes.setText("");
				textIDPromotor.setText("");
			}
		});
		btnGuardar.setBounds(268, 227, 89, 23);
		paquetesPane.add(btnGuardar);
		
		JLabel lblIdorigen = new JLabel("idorigen");
		lblIdorigen.setBounds(49, 85, 68, 14);
		paquetesPane.add(lblIdorigen);
		
		JLabel lblIddestino = new JLabel("iddestino");
		lblIddestino.setBounds(49, 60, 68, 14);
		paquetesPane.add(lblIddestino);
		
		JLabel lblFechaDeVenta = new JLabel("fecha de venta");
		lblFechaDeVenta.setBounds(49, 110, 91, 14);
		paquetesPane.add(lblFechaDeVenta);
		
		JLabel lblHoraDeVenta = new JLabel("hora de venta");
		lblHoraDeVenta.setBounds(49, 141, 68, 14);
		paquetesPane.add(lblHoraDeVenta);
		
		JLabel lblFechaDeEjecucion = new JLabel("fecha de ejecucion");
		lblFechaDeEjecucion.setBounds(35, 168, 91, 14);
		paquetesPane.add(lblFechaDeEjecucion);
		
		JLabel lblHoraDeSalida = new JLabel("hora de salida");
		lblHoraDeSalida.setBounds(49, 193, 68, 14);
		paquetesPane.add(lblHoraDeSalida);
		
		JLabel lblObservacion = new JLabel("observacion");
		lblObservacion.setBounds(234, 35, 68, 14);
		paquetesPane.add(lblObservacion);
		
		JLabel lblcodigoventa = new JLabel("codigo de venta");
		lblcodigoventa.setBounds(49, 35, 91, 14);
		paquetesPane.add(lblcodigoventa);
		
		JLabel lblprecio = new JLabel("precio $");
		lblprecio.setBounds(234, 98, 68, 14);
		paquetesPane.add(lblprecio);
		
		textIDdestino = new JTextField();
		textIDdestino.setColumns(10);
		textIDdestino.setBounds(138, 57, 86, 20);
		paquetesPane.add(textIDdestino);
		
		textIDorigen = new JTextField();
		textIDorigen.setColumns(10);
		textIDorigen.setBounds(138, 81, 86, 20);
		paquetesPane.add(textIDorigen);
		
		textFechaVenta = new JTextField();
		textFechaVenta.setColumns(10);
		textFechaVenta.setBounds(138, 107, 86, 20);
		paquetesPane.add(textFechaVenta);
		
		textPrecio = new JTextField();
		textPrecio.setColumns(10);
		textPrecio.setBounds(312, 95, 86, 20);
		paquetesPane.add(textPrecio);
		
		textHoraVenta = new JTextField();
		textHoraVenta.setColumns(10);
		textHoraVenta.setBounds(138, 135, 86, 20);
		paquetesPane.add(textHoraVenta);
		
		textFechaEjecucion = new JTextField();
		textFechaEjecucion.setColumns(10);
		textFechaEjecucion.setBounds(138, 165, 86, 20);
		paquetesPane.add(textFechaEjecucion);
		
		textHoraSalida = new JTextField();
		textHoraSalida.setColumns(10);
		textHoraSalida.setBounds(138, 190, 86, 20);
		paquetesPane.add(textHoraSalida);
		
		textObservacion = new JTextField();
		textObservacion.setColumns(10);
		textObservacion.setBounds(312, 35, 107, 49);
		paquetesPane.add(textObservacion);
		
		textCodigoVenta = new JTextField();
		textCodigoVenta.setColumns(10);
		textCodigoVenta.setBounds(138, 32, 86, 20);
		paquetesPane.add(textCodigoVenta);
		
		lblPaquetes = new JLabel("DATOS PAQUETES");
		lblPaquetes.setBounds(174, 11, 98, 14);
		paquetesPane.add(lblPaquetes);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int salida = JOptionPane.showConfirmDialog(null, "¿Desea salir?");
				if (salida==JOptionPane.OK_OPTION) {
					System.exit(0);
				}
				else {
					JOptionPane.showMessageDialog(null, "Continue");
				}
			}
		});
		btnSalir.setBounds(104, 227, 89, 23);
		paquetesPane.add(btnSalir);
		
		lblIdAgencia = new JLabel("ID Agencia");
		lblIdAgencia.setBounds(234, 123, 68, 14);
		paquetesPane.add(lblIdAgencia);
		
		lblIdVehiculo = new JLabel("ID Vehiculo");
		lblIdVehiculo.setBounds(234, 144, 68, 14);
		paquetesPane.add(lblIdVehiculo);
		
		lblIdClientes = new JLabel("ID Clientes");
		lblIdClientes.setBounds(234, 168, 68, 14);
		paquetesPane.add(lblIdClientes);
		
		lblIdPromotor = new JLabel("ID Promotor");
		lblIdPromotor.setBounds(234, 193, 68, 14);
		paquetesPane.add(lblIdPromotor);
		
		textIDAgencia = new JTextField();
		textIDAgencia.setColumns(10);
		textIDAgencia.setBounds(312, 120, 86, 20);
		paquetesPane.add(textIDAgencia);
		
		textIDVehiculo = new JTextField();
		textIDVehiculo.setColumns(10);
		textIDVehiculo.setBounds(312, 141, 86, 20);
		paquetesPane.add(textIDVehiculo);
		
		textIDPromotor = new JTextField();
		textIDPromotor.setColumns(10);
		textIDPromotor.setBounds(312, 190, 86, 20);
		paquetesPane.add(textIDPromotor);
		
		textIDClientes = new JTextField();
		textIDClientes.setColumns(10);
		textIDClientes.setBounds(312, 165, 86, 20);
		paquetesPane.add(textIDClientes);
	}
}
