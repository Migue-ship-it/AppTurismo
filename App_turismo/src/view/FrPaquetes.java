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
import javax.swing.ImageIcon;

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
	private JButton btnGuardar_1;
	private JTextField textIDPaquete;
	private JLabel lblidPaquete;
	Paquetes cr = new Paquetes();
	private JButton btnBuscar;
	private JButton btnUpdate;

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
		setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\9025861_package_box_icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 359);
		paquetesPane = new JPanel();
		paquetesPane.setToolTipText("");
		paquetesPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(paquetesPane);
		paquetesPane.setLayout(null);

		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\326688_floppy_save_guardar_icon.png"));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				try {
					cr.datosPaquetes(Integer.parseInt(textCodigoVenta.getText()), Integer.parseInt(textIDdestino.getText()), Integer.parseInt(textIDorigen.getText()), textFechaVenta.getText(), textHoraVenta.getText(),
					textFechaEjecucion.getText(), textHoraSalida.getText(), textObservacion.getText(), textPrecio.getText(), Integer.parseInt(textIDAgencia.getText()),
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
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "ingrese datos");
				}
			}
		});
		btnGuardar.setBounds(253, 257, 68, 52);
		paquetesPane.add(btnGuardar);

		JLabel lblIdorigen = new JLabel("idorigen");
		lblIdorigen.setBounds(33, 113, 68, 14);
		paquetesPane.add(lblIdorigen);

		JLabel lblIddestino = new JLabel("iddestino");
		lblIddestino.setBounds(33, 88, 68, 14);
		paquetesPane.add(lblIddestino);

		JLabel lblFechaDeVenta = new JLabel("fecha de venta");
		lblFechaDeVenta.setBounds(33, 146, 91, 14);
		paquetesPane.add(lblFechaDeVenta);

		JLabel lblHoraDeVenta = new JLabel("hora de venta");
		lblHoraDeVenta.setBounds(33, 171, 91, 14);
		paquetesPane.add(lblHoraDeVenta);

		JLabel lblFechaDeEjecucion = new JLabel("fecha de ejecucion");
		lblFechaDeEjecucion.setBounds(33, 196, 115, 14);
		paquetesPane.add(lblFechaDeEjecucion);

		JLabel lblHoraDeSalida = new JLabel("hora de salida");
		lblHoraDeSalida.setBounds(33, 229, 91, 14);
		paquetesPane.add(lblHoraDeSalida);

		JLabel lblObservacion = new JLabel("observacion");
		lblObservacion.setBounds(253, 35, 80, 14);
		paquetesPane.add(lblObservacion);

		JLabel lblcodigoventa = new JLabel("codigo de venta");
		lblcodigoventa.setBounds(33, 63, 91, 14);
		paquetesPane.add(lblcodigoventa);

		JLabel lblprecio = new JLabel("precio $");
		lblprecio.setBounds(253, 113, 68, 14);
		paquetesPane.add(lblprecio);

		textIDdestino = new JTextField();
		textIDdestino.setColumns(10);
		textIDdestino.setBounds(148, 85, 86, 20);
		paquetesPane.add(textIDdestino);

		textIDorigen = new JTextField();
		textIDorigen.setColumns(10);
		textIDorigen.setBounds(148, 110, 86, 20);
		paquetesPane.add(textIDorigen);

		textFechaVenta = new JTextField();
		textFechaVenta.setColumns(10);
		textFechaVenta.setBounds(148, 143, 86, 20);
		paquetesPane.add(textFechaVenta);

		textPrecio = new JTextField();
		textPrecio.setColumns(10);
		textPrecio.setBounds(332, 110, 115, 20);
		paquetesPane.add(textPrecio);

		textHoraVenta = new JTextField();
		textHoraVenta.setColumns(10);
		textHoraVenta.setBounds(148, 168, 86, 20);
		paquetesPane.add(textHoraVenta);

		textFechaEjecucion = new JTextField();
		textFechaEjecucion.setColumns(10);
		textFechaEjecucion.setBounds(148, 193, 86, 20);
		paquetesPane.add(textFechaEjecucion);

		textHoraSalida = new JTextField();
		textHoraSalida.setColumns(10);
		textHoraSalida.setBounds(148, 226, 86, 20);
		paquetesPane.add(textHoraSalida);

		textObservacion = new JTextField();
		textObservacion.setColumns(10);
		textObservacion.setBounds(332, 35, 115, 64);
		paquetesPane.add(textObservacion);

		textCodigoVenta = new JTextField();
		textCodigoVenta.setColumns(10);
		textCodigoVenta.setBounds(148, 60, 86, 20);
		paquetesPane.add(textCodigoVenta);

		lblPaquetes = new JLabel("DATOS PAQUETES");
		lblPaquetes.setBounds(174, 11, 115, 14);
		paquetesPane.add(lblPaquetes);

		lblIdAgencia = new JLabel("ID Agencia");
		lblIdAgencia.setBounds(253, 138, 68, 14);
		paquetesPane.add(lblIdAgencia);

		lblIdVehiculo = new JLabel("ID Vehiculo");
		lblIdVehiculo.setBounds(253, 171, 68, 14);
		paquetesPane.add(lblIdVehiculo);

		lblIdClientes = new JLabel("ID Clientes");
		lblIdClientes.setBounds(253, 196, 68, 14);
		paquetesPane.add(lblIdClientes);

		lblIdPromotor = new JLabel("ID Promotor");
		lblIdPromotor.setBounds(253, 229, 68, 14);
		paquetesPane.add(lblIdPromotor);

		textIDAgencia = new JTextField();
		textIDAgencia.setColumns(10);
		textIDAgencia.setBounds(332, 138, 86, 20);
		paquetesPane.add(textIDAgencia);

		textIDVehiculo = new JTextField();
		textIDVehiculo.setColumns(10);
		textIDVehiculo.setBounds(332, 168, 86, 20);
		paquetesPane.add(textIDVehiculo);

		textIDPromotor = new JTextField();
		textIDPromotor.setColumns(10);
		textIDPromotor.setBounds(332, 226, 86, 20);
		paquetesPane.add(textIDPromotor);

		textIDClientes = new JTextField();
		textIDClientes.setColumns(10);
		textIDClientes.setBounds(332, 193, 86, 20);
		paquetesPane.add(textIDClientes);

		btnGuardar_1 = new JButton("");
		btnGuardar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cr.delete(Integer.parseInt(textIDPaquete.getText()));
					textIDPaquete.setText("");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ingrese datos");
				}
			}
		});
		btnGuardar_1
				.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564505_close_delete_exit_remove_icon.png"));
		btnGuardar_1.setBounds(117, 257, 52, 52);
		paquetesPane.add(btnGuardar_1);

		textIDPaquete = new JTextField();
		textIDPaquete.setColumns(10);
		textIDPaquete.setBounds(148, 32, 86, 20);
		paquetesPane.add(textIDPaquete);

		lblidPaquete = new JLabel("ID del Paquete");
		lblidPaquete.setBounds(33, 35, 91, 14);
		paquetesPane.add(lblidPaquete);

		btnBuscar = new JButton("");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cr.read(Integer.parseInt(textIDPaquete.getText()), textCodigoVenta, textIDdestino, textIDorigen,
							textFechaVenta, textHoraVenta, textFechaEjecucion, textHoraSalida, textObservacion,
							textPrecio, textIDAgencia, textIDVehiculo, textIDClientes, textIDPromotor);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ingrese datos");
				}
			}
		});
		btnBuscar.setIcon(new ImageIcon(
				"C:\\Users\\APRENDIZ\\Downloads\\5402443_search_find_magnifier_magnifying_magnifying glass_icon.png"));
		btnBuscar.setBounds(190, 257, 52, 52);
		paquetesPane.add(btnBuscar);

		btnUpdate = new JButton("");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cr.update(Integer.parseInt(textIDPaquete.getText()), Integer.parseInt(textCodigoVenta.getText()), Integer.parseInt(textIDdestino.getText()), Integer.parseInt(textIDorigen.getText()),
					textFechaVenta.getText(), textHoraVenta.getText(), textFechaEjecucion.getText(), textHoraSalida.getText(), textObservacion.getText(), textPrecio.getText(),
					Integer.parseInt(textIDAgencia.getText()), Integer.parseInt(textIDVehiculo.getText()), Integer.parseInt(textIDClientes.getText()), Integer.parseInt(textIDPromotor.getText()));
					textIDPaquete.setText("");
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
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ingrese datos");
				}
			}
		});
		btnUpdate.setIcon(
				new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4213447_arrow_load_loading_refresh_reload_icon.png"));
		btnUpdate.setBounds(331, 257, 52, 50);
		paquetesPane.add(btnUpdate);
	}
}
