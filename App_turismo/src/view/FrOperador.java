package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import model.Operador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JButton btnBuscar;
	private JButton btnUpdate;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\7791667_necktie_businessman_suit_manager_employee_icon.png"));
		setTitle("OPERADOR TURISTICO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 319);
		operadorPane = new JPanel();
		operadorPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(operadorPane);
		operadorPane.setLayout(null);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\326688_floppy_save_guardar_icon.png"));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				try {
					cr.create(textNombres.getText(), textApellidos.getText(), textCorreo.getText(), Integer.parseInt(textNoTelefono.getText()), textTipoDocumento.getText(), 
					Integer.parseInt(textNoDocumento.getText()), textDireccion.getText(), Integer.parseInt(textIDVehiculo.getText()));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "ingrese datos");
				}
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
		btnGuardar.setBounds(364, 153, 65, 49);
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
		lblNoDocumento.setBounds(264, 61, 86, 14);
		operadorPane.add(lblNoDocumento);
		
		textNombres = new JTextField();
		textNombres.setColumns(10);
		textNombres.setBounds(138, 89, 116, 20);
		operadorPane.add(textNombres);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(138, 122, 116, 20);
		operadorPane.add(textApellidos);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(138, 153, 160, 20);
		operadorPane.add(textCorreo);
		
		textNoTelefono = new JTextField();
		textNoTelefono.setColumns(10);
		textNoTelefono.setBounds(138, 185, 116, 20);
		operadorPane.add(textNoTelefono);
		
		textTipoDocumento = new JTextField();
		textTipoDocumento.setColumns(10);
		textTipoDocumento.setBounds(138, 210, 116, 20);
		operadorPane.add(textTipoDocumento);
		
		textNoDocumento = new JTextField();
		textNoDocumento.setColumns(10);
		textNoDocumento.setBounds(360, 58, 86, 20);
		operadorPane.add(textNoDocumento);
		
		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setBounds(264, 92, 74, 14);
		operadorPane.add(lblDireccion);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(360, 89, 161, 20);
		operadorPane.add(textDireccion);
		textDireccion.setColumns(10);
		
		lblOperador = new JLabel("DATOS OPERADOR");
		lblOperador.setBounds(200, 22, 123, 14);
		operadorPane.add(lblOperador);
		
		JLabel lblidVehiculo = new JLabel("ID Vehiculo");
		lblidVehiculo.setBounds(264, 125, 86, 14);
		operadorPane.add(lblidVehiculo);
		
		textIDVehiculo = new JTextField();
		textIDVehiculo.setColumns(10);
		textIDVehiculo.setBounds(360, 122, 86, 20);
		operadorPane.add(textIDVehiculo);
		
		btnBorrar = new JButton("");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cr.delete(Integer.parseInt(textIDOperador.getText()));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ingrese datos");
				}
				textIDOperador.setText("");
			}
		});
		btnBorrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564505_close_delete_exit_remove_icon.png"));
		btnBorrar.setBounds(439, 153, 65, 49);
		operadorPane.add(btnBorrar);
		
		textIDOperador = new JTextField();
		textIDOperador.setColumns(10);
		textIDOperador.setBounds(138, 58, 116, 20);
		operadorPane.add(textIDOperador);
		
		lblidOperador = new JLabel("ID del operador");
		lblidOperador.setBounds(25, 61, 103, 14);
		operadorPane.add(lblidOperador);
		
		btnBuscar = new JButton("");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cr.read(Integer.parseInt(textIDOperador.getText()), textNombres, textApellidos, textCorreo, textNoTelefono, textTipoDocumento, textNoDocumento, textDireccion, textIDVehiculo);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ingrese datos");
				}
			}
		});
		btnBuscar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\5402443_search_find_magnifier_magnifying_magnifying glass_icon.png"));
		btnBuscar.setBounds(364, 212, 65, 49);
		operadorPane.add(btnBuscar);
		
		btnUpdate = new JButton("");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cr.update(Integer.parseInt(textIDOperador.getText()), textNombres.getText(), textApellidos.getText(), textCorreo.getText(), Integer.parseInt(textNoTelefono.getText()), textTipoDocumento.getText(), 
					Integer.parseInt(textNoDocumento.getText()), textDireccion.getText(), Integer.parseInt(textIDVehiculo.getText()));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ingrese datos");
				}
				textIDOperador.setText("");
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
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4213447_arrow_load_loading_refresh_reload_icon.png"));
		btnUpdate.setBounds(439, 211, 65, 50);
		operadorPane.add(btnUpdate);
	}
}