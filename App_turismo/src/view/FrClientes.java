package view;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Clientes;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class FrClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel ClientesPane;
	private JTextField textNoDocumento;
	private JTextField textNombres;
	private JTextField textApellidos;
	private JTextField textDireccion;
	private JTextField textCorreo;
	private JTextField textNoTelefono;
	private JTextField textEstadoCivil;
	private JTextField textFechaNacimiento;
	private JTextField textAlergias;
	private JTextField textEps;
	private JTextField textTipoDocumento;
	private JTextField textIDClientes;
	Clientes cr = new Clientes();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrClientes frame = new FrClientes();
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
	public FrClientes() {
		setTitle("CLIENTES");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\309035_user_account_human_person_icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 342);
		ClientesPane = new JPanel();
		ClientesPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ClientesPane);
		ClientesPane.setLayout(null);
		
		JLabel lblTipoDeDocumento = new JLabel("tipo de documento");
		lblTipoDeDocumento.setBounds(24, 88, 97, 17);
		ClientesPane.add(lblTipoDeDocumento);
		
		JLabel lblNoDocumento = new JLabel("No. documento");
		lblNoDocumento.setBounds(24, 114, 73, 14);
		ClientesPane.add(lblNoDocumento);
		
		JLabel lblNombres = new JLabel("nombres");
		lblNombres.setBounds(24, 145, 46, 14);
		ClientesPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("apellidos");
		lblApellidos.setBounds(24, 178, 46, 14);
		ClientesPane.add(lblApellidos);
		
		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setBounds(24, 214, 46, 14);
		ClientesPane.add(lblDireccion);
		
		JLabel lblCorreoElectronico = new JLabel("correo electronico");
		lblCorreoElectronico.setBounds(24, 239, 97, 14);
		ClientesPane.add(lblCorreoElectronico);
		
		JLabel lblNoTelefono = new JLabel("No. telefono");
		lblNoTelefono.setBounds(24, 264, 73, 14);
		ClientesPane.add(lblNoTelefono);
		
		JLabel lblEps = new JLabel("E.P.S");
		lblEps.setBounds(229, 77, 46, 14);
		ClientesPane.add(lblEps);
		
		JLabel lblAlergias = new JLabel("alergias");
		lblAlergias.setBounds(229, 102, 46, 14);
		ClientesPane.add(lblAlergias);
		
		JLabel lblFechaDeNacimiento = new JLabel("fecha de nacimiento");
		lblFechaDeNacimiento.setBounds(221, 134, 105, 14);
		ClientesPane.add(lblFechaDeNacimiento);
		
		JLabel lblEstadoCivil = new JLabel("estado civil");
		lblEstadoCivil.setBounds(226, 165, 73, 14);
		ClientesPane.add(lblEstadoCivil);
		
		textNoDocumento = new JTextField();
		textNoDocumento.setColumns(10);
		textNoDocumento.setBounds(130, 111, 86, 20);
		ClientesPane.add(textNoDocumento);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\326688_floppy_save_guardar_icon.png"));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			cr.create(textTipoDocumento.getText(), Integer.parseInt(textNoDocumento.getText()), textNombres.getText(), textApellidos.getText(), textDireccion.getText(), 
			textCorreo.getText(), Integer.parseInt(textNoTelefono.getText()), textEps.getText(), textAlergias.getText(), textFechaNacimiento.getText(), textEstadoCivil.getText());
			textTipoDocumento.setText("");
			textNoDocumento.setText("");
			textNombres.setText("");
			textApellidos.setText("");
			textDireccion.setText("");
			textCorreo.setText("");
			textNoTelefono.setText("");
			textEps.setText("");
			textAlergias.setText("");
			textFechaNacimiento.setText("");
			textEstadoCivil.setText("");
			}
		});
		btnGuardar.setBounds(238, 190, 58, 63);
		ClientesPane.add(btnGuardar);
		
		textNombres = new JTextField();
		textNombres.setColumns(10);
		textNombres.setBounds(130, 142, 86, 20);
		ClientesPane.add(textNombres);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(130, 175, 86, 20);
		ClientesPane.add(textApellidos);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(131, 206, 86, 20);
		ClientesPane.add(textDireccion);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(130, 234, 86, 20);
		ClientesPane.add(textCorreo);
		
		textNoTelefono = new JTextField();
		textNoTelefono.setColumns(10);
		textNoTelefono.setBounds(130, 261, 86, 20);
		ClientesPane.add(textNoTelefono);
		
		textEstadoCivil = new JTextField();
		textEstadoCivil.setColumns(10);
		textEstadoCivil.setBounds(296, 159, 86, 20);
		ClientesPane.add(textEstadoCivil);
		
		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setColumns(10);
		textFechaNacimiento.setBounds(325, 131, 126, 20);
		ClientesPane.add(textFechaNacimiento);
		
		textAlergias = new JTextField();
		textAlergias.setColumns(10);
		textAlergias.setBounds(296, 99, 86, 20);
		ClientesPane.add(textAlergias);
		
		JLabel lblClientes = new JLabel("DATOS CLIENTES");
		lblClientes.setBounds(185, 20, 90, 14);
		ClientesPane.add(lblClientes);
		
		textEps = new JTextField();
		textEps.setBounds(296, 70, 86, 20);
		ClientesPane.add(textEps);
		textEps.setColumns(10);
		
		textTipoDocumento = new JTextField();
		textTipoDocumento.setBounds(130, 86, 86, 20);
		ClientesPane.add(textTipoDocumento);
		textTipoDocumento.setColumns(10);
		
		JButton btnBorrar = new JButton("");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.delete(Integer.parseInt(textIDClientes.getText()));
				textIDClientes.setText("");
			}
		});
		btnBorrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564505_close_delete_exit_remove_icon.png"));
		btnBorrar.setBounds(308, 190, 58, 63);
		ClientesPane.add(btnBorrar);
		
		JLabel lblidClientes = new JLabel("ID Cliente");
		lblidClientes.setBounds(24, 60, 97, 17);
		ClientesPane.add(lblidClientes);
		
		textIDClientes = new JTextField();
		textIDClientes.setColumns(10);
		textIDClientes.setBounds(130, 59, 86, 20);
		ClientesPane.add(textIDClientes);
	}
}
