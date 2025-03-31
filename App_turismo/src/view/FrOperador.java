package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import model.Operador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrOperador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel operadorPane;
	private JTextField textNombres;
	private JTextField textApellidos;
	private JTextField textCorreo;
	private JTextField textNoTelefono;
	private JTextField textTipoDocumento;
	private JTextField textNoDocumento;
	private JTextField textDireccion;
	private JLabel lblOperador;
	private JTextField textIDVehiculo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrOperador frame = new FrOperador();
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
	public FrOperador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		operadorPane = new JPanel();
		operadorPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(operadorPane);
		operadorPane.setLayout(null);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				Operador cr = new Operador();
				cr.datosOperador(textNombres.getText(), textApellidos.getText(), textCorreo.getText(), Integer.parseInt(textNoTelefono.getText()), textTipoDocumento.getText(), 
				Integer.parseInt(textNoDocumento.getText()), textDireccion.getText(), Integer.parseInt(textIDVehiculo.getText()));
				textNombres.setText("");
				textApellidos.setText("");
				textCorreo.setText("");
				textNoTelefono.setText("");
				textTipoDocumento.setText("");
				textNoDocumento.setText("");
				textDireccion.setText("");
				textIDVehiculo.setText("");
			}
		});
		btnGuardar.setBounds(274, 118, 89, 23);
		operadorPane.add(btnGuardar);
		
		JLabel lblNombres = new JLabel("nombres");
		lblNombres.setBounds(45, 61, 86, 14);
		operadorPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("apellidos");
		lblApellidos.setBounds(45, 92, 86, 14);
		operadorPane.add(lblApellidos);
		
		JLabel lblCorreoElectronic = new JLabel("correo electronico");
		lblCorreoElectronic.setBounds(45, 122, 96, 14);
		operadorPane.add(lblCorreoElectronic);
		
		JLabel lblNoTelefono = new JLabel("No. telefono");
		lblNoTelefono.setBounds(45, 153, 86, 14);
		operadorPane.add(lblNoTelefono);
		
		JLabel lblTipoDeDocumento = new JLabel("tipo de documento");
		lblTipoDeDocumento.setBounds(45, 189, 96, 14);
		operadorPane.add(lblTipoDeDocumento);
		
		JLabel lblNoDocumento = new JLabel("No. documento");
		lblNoDocumento.setBounds(45, 220, 86, 14);
		operadorPane.add(lblNoDocumento);
		
		textNombres = new JTextField();
		textNombres.setColumns(10);
		textNombres.setBounds(158, 58, 86, 20);
		operadorPane.add(textNombres);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(158, 89, 86, 20);
		operadorPane.add(textApellidos);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(158, 119, 86, 20);
		operadorPane.add(textCorreo);
		
		textNoTelefono = new JTextField();
		textNoTelefono.setColumns(10);
		textNoTelefono.setBounds(158, 150, 86, 20);
		operadorPane.add(textNoTelefono);
		
		textTipoDocumento = new JTextField();
		textTipoDocumento.setColumns(10);
		textTipoDocumento.setBounds(158, 186, 86, 20);
		operadorPane.add(textTipoDocumento);
		
		textNoDocumento = new JTextField();
		textNoDocumento.setColumns(10);
		textNoDocumento.setBounds(158, 217, 86, 20);
		operadorPane.add(textNoDocumento);
		
		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setBounds(254, 61, 46, 14);
		operadorPane.add(lblDireccion);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(311, 58, 86, 20);
		operadorPane.add(textDireccion);
		textDireccion.setColumns(10);
		
		lblOperador = new JLabel("DATOS OPERADOR");
		lblOperador.setBounds(175, 23, 96, 14);
		operadorPane.add(lblOperador);
		
		JLabel lblidVehiculo = new JLabel("ID Vehiculo");
		lblidVehiculo.setBounds(254, 92, 60, 14);
		operadorPane.add(lblidVehiculo);
		
		textIDVehiculo = new JTextField();
		textIDVehiculo.setColumns(10);
		textIDVehiculo.setBounds(311, 89, 86, 20);
		operadorPane.add(textIDVehiculo);
	}
}
