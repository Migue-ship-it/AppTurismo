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
import javax.swing.ImageIcon;
import java.awt.Toolkit;

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
	private JButton btnBorrar;
	private JTextField textIDOperador;
	private JLabel lblidOperador;
	Operador cr = new Operador();
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\211875_plane_icon.png"));
		setTitle("OPERADOR TURISTICO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		operadorPane = new JPanel();
		operadorPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(operadorPane);
		operadorPane.setLayout(null);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\326688_floppy_save_guardar_icon.png"));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
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
		btnGuardar.setBounds(274, 153, 65, 49);
		operadorPane.add(btnGuardar);
		
		JLabel lblNombres = new JLabel("nombres");
		lblNombres.setBounds(25, 92, 86, 14);
		operadorPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("apellidos");
		lblApellidos.setBounds(25, 125, 86, 14);
		operadorPane.add(lblApellidos);
		
		JLabel lblCorreoElectronic = new JLabel("correo electronico");
		lblCorreoElectronic.setBounds(25, 153, 111, 14);
		operadorPane.add(lblCorreoElectronic);
		
		JLabel lblNoTelefono = new JLabel("No. telefono");
		lblNoTelefono.setBounds(25, 188, 86, 14);
		operadorPane.add(lblNoTelefono);
		
		JLabel lblTipoDeDocumento = new JLabel("tipo de documento");
		lblTipoDeDocumento.setBounds(25, 213, 123, 14);
		operadorPane.add(lblTipoDeDocumento);
		
		JLabel lblNoDocumento = new JLabel("No. documento");
		lblNoDocumento.setBounds(234, 61, 96, 14);
		operadorPane.add(lblNoDocumento);
		
		textNombres = new JTextField();
		textNombres.setColumns(10);
		textNombres.setBounds(138, 89, 86, 20);
		operadorPane.add(textNombres);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(138, 122, 86, 20);
		operadorPane.add(textApellidos);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(138, 153, 86, 20);
		operadorPane.add(textCorreo);
		
		textNoTelefono = new JTextField();
		textNoTelefono.setColumns(10);
		textNoTelefono.setBounds(138, 185, 86, 20);
		operadorPane.add(textNoTelefono);
		
		textTipoDocumento = new JTextField();
		textTipoDocumento.setColumns(10);
		textTipoDocumento.setBounds(138, 210, 86, 20);
		operadorPane.add(textTipoDocumento);
		
		textNoDocumento = new JTextField();
		textNoDocumento.setColumns(10);
		textNoDocumento.setBounds(328, 58, 86, 20);
		operadorPane.add(textNoDocumento);
		
		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setBounds(234, 92, 74, 14);
		operadorPane.add(lblDireccion);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(328, 89, 86, 20);
		operadorPane.add(textDireccion);
		textDireccion.setColumns(10);
		
		lblOperador = new JLabel("DATOS OPERADOR");
		lblOperador.setBounds(175, 23, 123, 14);
		operadorPane.add(lblOperador);
		
		JLabel lblidVehiculo = new JLabel("ID Vehiculo");
		lblidVehiculo.setBounds(234, 122, 86, 14);
		operadorPane.add(lblidVehiculo);
		
		textIDVehiculo = new JTextField();
		textIDVehiculo.setColumns(10);
		textIDVehiculo.setBounds(328, 122, 86, 20);
		operadorPane.add(textIDVehiculo);
		
		btnBorrar = new JButton("");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.delete(Integer.parseInt(textIDOperador.getText()));
				textIDOperador.setText("");
			}
		});
		btnBorrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564505_close_delete_exit_remove_icon.png"));
		btnBorrar.setBounds(349, 153, 65, 49);
		operadorPane.add(btnBorrar);
		
		textIDOperador = new JTextField();
		textIDOperador.setColumns(10);
		textIDOperador.setBounds(138, 58, 86, 20);
		operadorPane.add(textIDOperador);
		
		lblidOperador = new JLabel("ID del operador");
		lblidOperador.setBounds(25, 61, 103, 14);
		operadorPane.add(lblidOperador);
	}
}
