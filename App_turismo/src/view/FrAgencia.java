package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Agencia;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class FrAgencia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel agenciaPane;
	private JTextField textNombre;
	private JTextField textTelefono;
	private JTextField textDireccion;
	private JTextField textWeb;
	private JTextField textCorreo;
	private JLabel lblAgencia;
	private JTextField textidCompañia;
	private JTextField textidAgencia;
	Agencia cr = new Agencia();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrAgencia frame = new FrAgencia();
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
	public FrAgencia() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\7648081_travel_agency_service_tourism_icon.png"));
		setTitle("AGENCIA DE VIAJES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 348);
		agenciaPane = new JPanel();
		agenciaPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(agenciaPane);
		agenciaPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setBounds(27, 84, 46, 14);
		agenciaPane.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("telefono");
		lblTelefono.setBounds(27, 113, 46, 17);
		agenciaPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setBounds(27, 150, 46, 20);
		agenciaPane.add(lblDireccion);
		
		JLabel lblWeb = new JLabel("web");
		lblWeb.setBounds(27, 181, 46, 14);
		agenciaPane.add(lblWeb);
		
		JLabel lblCorreo = new JLabel("correo");
		lblCorreo.setBounds(27, 212, 46, 14);
		agenciaPane.add(lblCorreo);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(94, 81, 171, 20);
		agenciaPane.add(textNombre);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(94, 111, 171, 20);
		agenciaPane.add(textTelefono);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(94, 147, 171, 20);
		agenciaPane.add(textDireccion);
		
		textWeb = new JTextField();
		textWeb.setColumns(10);
		textWeb.setBounds(94, 178, 171, 20);
		agenciaPane.add(textWeb);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(94, 209, 171, 20);
		agenciaPane.add(textCorreo);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setForeground(new Color(0, 0, 0));
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\326688_floppy_save_guardar_icon.png"));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				cr.create(textNombre.getText(), Integer.parseInt(textTelefono.getText()), textDireccion.getText(), textWeb.getText(), textCorreo.getText(), Integer.parseInt(textidCompañia.getText()));
				textNombre.setText("");
				textTelefono.setText("");
				textDireccion.setText("");
				textWeb.setText("");
				textCorreo.setText("");
				textidCompañia.setText("");
				}
		});
		btnGuardar.setBounds(312, 205, 57, 50);
		agenciaPane.add(btnGuardar);
		
		lblAgencia = new JLabel("DATOS AGENCIA");
		lblAgencia.setBounds(163, 11, 107, 14);
		agenciaPane.add(lblAgencia);
		
		JLabel lblidCompañia = new JLabel("idcompañia");
		lblidCompañia.setBounds(27, 251, 57, 14);
		agenciaPane.add(lblidCompañia);
		
		textidCompañia = new JTextField();
		textidCompañia.setColumns(10);
		textidCompañia.setBounds(94, 248, 171, 20);
		agenciaPane.add(textidCompañia);
		
		JButton btnBorrar = new JButton("");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				cr.delete(Integer.parseInt(textidAgencia.getText()));
				textidAgencia.setText("");
			}
		});
		btnBorrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564505_close_delete_exit_remove_icon.png"));
		btnBorrar.setBounds(397, 205, 42, 50);
		agenciaPane.add(btnBorrar);
		
		JLabel lblidAgencia = new JLabel("idagencia");
		lblidAgencia.setBounds(27, 49, 57, 14);
		agenciaPane.add(lblidAgencia);
		
		textidAgencia = new JTextField();
		textidAgencia.setColumns(10);
		textidAgencia.setBounds(94, 46, 171, 20);
		agenciaPane.add(textidAgencia);
		
		JButton btnRead = new JButton("");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.read(Integer.parseInt(textidAgencia.getText()), textNombre, textTelefono, textDireccion, textWeb, textCorreo, textidCompañia);
			}
		});
		btnRead.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\5402443_search_find_magnifier_magnifying_magnifying glass_icon.png"));
		btnRead.setBounds(312, 147, 57, 50);
		agenciaPane.add(btnRead);
		
		JButton btnUpdate = new JButton("");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.update(Integer.parseInt(textidAgencia.getText()), textNombre.getText(), Integer.parseInt(textTelefono.getText()), textDireccion.getText(), textWeb.getText(), textCorreo.getText(), Integer.parseInt(textidCompañia.getText()));
				textidAgencia.setText("");
				textNombre.setText("");
				textTelefono.setText("");
				textDireccion.setText("");
				textWeb.setText("");
				textCorreo.setText("");
				textidCompañia.setText("");
			}
		});
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4213447_arrow_load_loading_refresh_reload_icon.png"));
		btnUpdate.setBounds(387, 146, 52, 50);
		agenciaPane.add(btnUpdate);
	}
}
