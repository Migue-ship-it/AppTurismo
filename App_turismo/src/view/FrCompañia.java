package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Compañia;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class FrCompañia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel CompañiaPane;
	private JTextField textTelefono;
	private JTextField textDireccion;
	private JTextField textFechaDeCreacion;
	private JTextField textRazonSocial;
	private JTextField textCorreo;
	private JTextField textWeb;
	Compañia cr = new Compañia();
	private JTextField textIDCompañia;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrCompañia frame = new FrCompañia();
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
	public FrCompañia() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\211875_plane_icon.png"));
		setTitle("COMPAÑIA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 335);
		CompañiaPane = new JPanel();
		CompañiaPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(CompañiaPane);
		CompañiaPane.setLayout(null);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\326688_floppy_save_guardar_icon.png"));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
			cr.create(Integer.parseInt(textTelefono.getText()),textDireccion.getText(),textFechaDeCreacion.getText(), textRazonSocial.getText(), textCorreo.getText(), textWeb.getText());
			textTelefono.setText("");
			textDireccion.setText("");
			textFechaDeCreacion.setText("");
			textRazonSocial.setText("");
			textCorreo.setText("");
			textWeb.setText("");
			}
		});
		btnGuardar.setBounds(247, 160, 65, 51);
		CompañiaPane.add(btnGuardar);
		
		JLabel lblTelefono = new JLabel("telefono");
		lblTelefono.setBounds(28, 84, 71, 14);
		CompañiaPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setBounds(28, 112, 71, 14);
		CompañiaPane.add(lblDireccion);
		
		JLabel lblFechaDeCreacion = new JLabel("fecha de creacion");
		lblFechaDeCreacion.setBounds(28, 140, 94, 14);
		CompañiaPane.add(lblFechaDeCreacion);
		
		JLabel lblRazonSocial = new JLabel("razon social");
		lblRazonSocial.setBounds(28, 176, 71, 14);
		CompañiaPane.add(lblRazonSocial);
		
		JLabel lblCorreo = new JLabel("correo");
		lblCorreo.setBounds(28, 207, 71, 14);
		CompañiaPane.add(lblCorreo);
		
		JLabel lblWeb = new JLabel("web");
		lblWeb.setBounds(28, 240, 71, 14);
		CompañiaPane.add(lblWeb);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(132, 81, 86, 20);
		CompañiaPane.add(textTelefono);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(132, 109, 86, 20);
		CompañiaPane.add(textDireccion);
		
		textFechaDeCreacion = new JTextField();
		textFechaDeCreacion.setColumns(10);
		textFechaDeCreacion.setBounds(132, 137, 86, 20);
		CompañiaPane.add(textFechaDeCreacion);
		
		textRazonSocial = new JTextField();
		textRazonSocial.setColumns(10);
		textRazonSocial.setBounds(132, 173, 86, 20);
		CompañiaPane.add(textRazonSocial);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(132, 204, 86, 20);
		CompañiaPane.add(textCorreo);
		
		textWeb = new JTextField();
		textWeb.setColumns(10);
		textWeb.setBounds(132, 237, 86, 20);
		CompañiaPane.add(textWeb);
		
		JLabel lblCompañia = new JLabel("DATOS COMPAÑIA");
		lblCompañia.setBounds(163, 11, 124, 36);
		CompañiaPane.add(lblCompañia);
		
		JButton btnBorrar = new JButton("");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.delete(Integer.parseInt(textIDCompañia.getText()));
				textIDCompañia.setText("");
			}
		});
		btnBorrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564505_close_delete_exit_remove_icon.png"));
		btnBorrar.setBounds(322, 160, 65, 51);
		CompañiaPane.add(btnBorrar);
		
		JLabel lblidCompañia = new JLabel("ID Compañia");
		lblidCompañia.setBounds(28, 52, 71, 14);
		CompañiaPane.add(lblidCompañia);
		
		textIDCompañia = new JTextField();
		textIDCompañia.setColumns(10);
		textIDCompañia.setBounds(132, 49, 86, 20);
		CompañiaPane.add(textIDCompañia);
		
		JButton btnGuardar_1 = new JButton("");
		btnGuardar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.read(Integer.parseInt(textIDCompañia.getText()), textTelefono, textDireccion, textFechaDeCreacion, textRazonSocial, textCorreo, textWeb);
			}
		});
		btnGuardar_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\5402443_search_find_magnifier_magnifying_magnifying glass_icon.png"));
		btnGuardar_1.setBounds(247, 222, 65, 51);
		CompañiaPane.add(btnGuardar_1);
		
		JButton btnUpdate = new JButton("");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.update(Integer.parseInt(textIDCompañia.getText()), Integer.parseInt(textTelefono.getText()), textDireccion.getText(),textFechaDeCreacion.getText(), textRazonSocial.getText(), textCorreo.getText(), textWeb.getText());
				textIDCompañia.setText("");
				textTelefono.setText("");
				textDireccion.setText("");
				textFechaDeCreacion.setText("");
				textRazonSocial.setText("");
				textCorreo.setText("");
				textWeb.setText("");
			}
		});
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4213447_arrow_load_loading_refresh_reload_icon.png"));
		btnUpdate.setBounds(322, 223, 65, 50);
		CompañiaPane.add(btnUpdate);
	}
}
