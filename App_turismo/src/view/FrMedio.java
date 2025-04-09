package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import model.Medio;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class FrMedio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel MedioPane;
	private JTextField textNombre;
	private JTextField textObservacion;
	private JTextField textIDTipo;
	Medio cr = new Medio();
	private JTextField textIDMedio;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrMedio frame = new FrMedio();
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
	public FrMedio() {
		setTitle("MEDIO DE COMUNICACION");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\9004661_envelope_mail_email_letter_icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 362);
		MedioPane = new JPanel();
		MedioPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(MedioPane);
		MedioPane.setLayout(null);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\326688_floppy_save_guardar_icon.png"));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				try {
					cr.datosMedio(textNombre.getText(), textObservacion.getText(), Integer.parseInt(textIDTipo.getText()));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "ingrese datos");
				}
				textNombre.setText("");
				textObservacion.setText("");
				textIDTipo.setText("");
			}
		});
		btnGuardar.setBounds(158, 246, 56, 52);
		MedioPane.add(btnGuardar);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(31, 77, 46, 14);
		MedioPane.add(lblNombre);
		
		JLabel lblObservacion = new JLabel("Observacion");
		lblObservacion.setBounds(25, 108, 75, 14);
		MedioPane.add(lblObservacion);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(181, 74, 228, 20);
		MedioPane.add(textNombre);
		
		textObservacion = new JTextField();
		textObservacion.setColumns(10);
		textObservacion.setBounds(181, 105, 228, 90);
		MedioPane.add(textObservacion);
		
		JLabel lblMedio = new JLabel("DATOS MEDIO");
		lblMedio.setBounds(181, 11, 86, 14);
		MedioPane.add(lblMedio);
		
		JLabel lblidTipo = new JLabel("ID Tipo del medio");
		lblidTipo.setBounds(25, 209, 87, 14);
		MedioPane.add(lblidTipo);
		
		textIDTipo = new JTextField();
		textIDTipo.setColumns(10);
		textIDTipo.setBounds(181, 206, 228, 20);
		MedioPane.add(textIDTipo);
		
		JButton btnBorrar = new JButton("");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				try {
				cr.delete(Integer.parseInt(textIDMedio.getText()));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "ingrese datos");
				}
				textIDMedio.setText("");
			}
		});
		btnBorrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564505_close_delete_exit_remove_icon.png"));
		btnBorrar.setBounds(224, 246, 56, 52);
		MedioPane.add(btnBorrar);
		
		JLabel lblidMedio = new JLabel("ID Medio");
		lblidMedio.setBounds(25, 39, 87, 14);
		MedioPane.add(lblidMedio);
		
		textIDMedio = new JTextField();
		textIDMedio.setColumns(10);
		textIDMedio.setBounds(181, 36, 228, 20);
		MedioPane.add(textIDMedio);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cr.read(Integer.parseInt(textIDMedio.getText()), textNombre, textObservacion, textIDTipo);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ingrese datos");
				}
				}
		});
		btnBuscar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\5402443_search_find_magnifier_magnifying_magnifying glass_icon.png"));
		btnBuscar.setBounds(290, 246, 56, 52);
		MedioPane.add(btnBuscar);
		
		JButton btnUpdate = new JButton("");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cr.update(Integer.parseInt(textIDMedio.getText()), textNombre.getText(), textObservacion.getText(), Integer.parseInt(textIDTipo.getText()));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ingrese datos");
				}
				textIDMedio.setText("");
				textNombre.setText("");
				textObservacion.setText("");
				textIDTipo.setText("");
			}
		});
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4213447_arrow_load_loading_refresh_reload_icon.png"));
		btnUpdate.setBounds(356, 246, 52, 50);
		MedioPane.add(btnUpdate);
	}
}