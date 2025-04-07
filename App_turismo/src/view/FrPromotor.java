package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Promotor;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class FrPromotor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel promotorPane;
	private JTextField textNombres;
	private JTextField textApellidos;
	private JTextField textDireccion;
	private JTextField textFechaNacimiento;
	private JTextField textCorreoPersonal;
	private JTextField textNoTelefono;
	private JTextField textTipoDocumento;
	private JTextField textNoDocumento;
	private JTextField textCorreoCorporativo;
	private JLabel lblPromotor;
	private JButton btnBorrar;
	private JLabel lblidPromotor;
	private JTextField textIDPromotor;
	Promotor cr = new Promotor();
	private JButton btnUpdate;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrPromotor frame = new FrPromotor();
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
	public FrPromotor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\3994384_local_location_map_travel_world_icon.png"));
		setTitle("PROMOTOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 315);
		promotorPane = new JPanel();
		promotorPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(promotorPane);
		promotorPane.setLayout(null);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\326688_floppy_save_guardar_icon.png"));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				cr.create(textNombres.getText(), textApellidos.getText(), textCorreoPersonal.getText(), Integer.parseInt(textNoTelefono.getText()), textTipoDocumento.getText(),
				Integer.parseInt(textNoDocumento.getText()), textCorreoCorporativo.getText(), textDireccion.getText(), textFechaNacimiento.getText());
				textNombres.setText("");
				textApellidos.setText("");
				textCorreoPersonal.setText("");
				textNoTelefono.setText("");
				textTipoDocumento.setText("");
				textNoDocumento.setText("");
				textCorreoCorporativo.setText("");
				textDireccion.setText("");
				textFechaNacimiento.setText("");
			}
		});
		btnGuardar.setBounds(293, 217, 57, 52);
		promotorPane.add(btnGuardar);
		
		JLabel lblNombres = new JLabel("nombres");
		lblNombres.setBounds(17, 79, 73, 14);
		promotorPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("apellidos");
		lblApellidos.setBounds(17, 110, 73, 14);
		promotorPane.add(lblApellidos);
		
		JLabel lblCorreoPersonal = new JLabel("correo personal");
		lblCorreoPersonal.setBounds(17, 141, 98, 14);
		promotorPane.add(lblCorreoPersonal);
		
		JLabel lblNoTelefono = new JLabel("No. telefono");
		lblNoTelefono.setBounds(17, 172, 73, 14);
		promotorPane.add(lblNoTelefono);
		
		JLabel lblTipoDocumento = new JLabel("tipo documento");
		lblTipoDocumento.setBounds(252, 52, 98, 14);
		promotorPane.add(lblTipoDocumento);
		
		JLabel lblNoDocumento = new JLabel("No. documento");
		lblNoDocumento.setBounds(252, 79, 98, 14);
		promotorPane.add(lblNoDocumento);
		
		JLabel lblCorreoCorporativo = new JLabel("correo corporativo");
		lblCorreoCorporativo.setBounds(252, 110, 115, 14);
		promotorPane.add(lblCorreoCorporativo);
		
		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setBounds(252, 141, 73, 14);
		promotorPane.add(lblDireccion);
		
		JLabel lblFechaNacimiento = new JLabel("fecha de nacimiento");
		lblFechaNacimiento.setBounds(252, 169, 115, 20);
		promotorPane.add(lblFechaNacimiento);
		
		textNombres = new JTextField();
		textNombres.setColumns(10);
		textNombres.setBounds(113, 76, 112, 20);
		promotorPane.add(textNombres);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(113, 107, 112, 20);
		promotorPane.add(textApellidos);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(372, 138, 141, 20);
		promotorPane.add(textDireccion);
		
		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setColumns(10);
		textFechaNacimiento.setBounds(372, 169, 141, 20);
		promotorPane.add(textFechaNacimiento);
		
		textCorreoPersonal = new JTextField();
		textCorreoPersonal.setColumns(10);
		textCorreoPersonal.setBounds(113, 138, 112, 20);
		promotorPane.add(textCorreoPersonal);
		
		textNoTelefono = new JTextField();
		textNoTelefono.setColumns(10);
		textNoTelefono.setBounds(113, 169, 112, 20);
		promotorPane.add(textNoTelefono);
		
		textTipoDocumento = new JTextField();
		textTipoDocumento.setColumns(10);
		textTipoDocumento.setBounds(372, 49, 141, 20);
		promotorPane.add(textTipoDocumento);
		
		textNoDocumento = new JTextField();
		textNoDocumento.setColumns(10);
		textNoDocumento.setBounds(372, 76, 141, 20);
		promotorPane.add(textNoDocumento);
		
		textCorreoCorporativo = new JTextField();
		textCorreoCorporativo.setColumns(10);
		textCorreoCorporativo.setBounds(372, 107, 141, 20);
		promotorPane.add(textCorreoCorporativo);
		
		lblPromotor = new JLabel("DATOS PROMOTOR");
		lblPromotor.setBounds(188, 24, 120, 14);
		promotorPane.add(lblPromotor);
		
		btnBorrar = new JButton("");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				cr.delete(Integer.parseInt(textIDPromotor.getText()));
				textIDPromotor.setText("");
			}
		});
		btnBorrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564505_close_delete_exit_remove_icon.png"));
		btnBorrar.setBounds(161, 217, 57, 52);
		promotorPane.add(btnBorrar);
		
		lblidPromotor = new JLabel("ID del promotor");
		lblidPromotor.setBounds(17, 46, 98, 14);
		promotorPane.add(lblidPromotor);
		
		textIDPromotor = new JTextField();
		textIDPromotor.setColumns(10);
		textIDPromotor.setBounds(113, 49, 112, 20);
		promotorPane.add(textIDPromotor);
		
		JButton btnRead = new JButton("");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.read(Integer.parseInt(textIDPromotor.getText()), textNombres, textApellidos, textCorreoPersonal, textNoTelefono, textTipoDocumento, textNoDocumento, textCorreoCorporativo, textDireccion, textFechaNacimiento);
			}
		});
		btnRead.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\5402443_search_find_magnifier_magnifying_magnifying glass_icon.png"));
		btnRead.setBounds(232, 217, 51, 52);
		promotorPane.add(btnRead);
		
		btnUpdate = new JButton("");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.update(Integer.parseInt(textIDPromotor.getText()), textNombres.getText(), textApellidos.getText(), textCorreoPersonal.getText(), Integer.parseInt(textNoTelefono.getText()), textTipoDocumento.getText(),
				Integer.parseInt(textNoDocumento.getText()), textCorreoCorporativo.getText(), textDireccion.getText(), textFechaNacimiento.getText());
				textIDPromotor.setText("");
				textNombres.setText("");
				textApellidos.setText("");
				textCorreoPersonal.setText("");
				textNoTelefono.setText("");
				textTipoDocumento.setText("");
				textNoDocumento.setText("");
				textCorreoCorporativo.setText("");
				textDireccion.setText("");
				textFechaNacimiento.setText("");
			}
		});
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4213447_arrow_load_loading_refresh_reload_icon.png"));
		btnUpdate.setBounds(363, 219, 52, 50);
		promotorPane.add(btnUpdate);
	}
}
