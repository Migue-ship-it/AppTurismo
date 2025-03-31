package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import model.Medio;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrMedio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel MedioPane;
	private JTextField textNombre;
	private JTextField textObservacion;
	private JTextField textIDTipo;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		MedioPane = new JPanel();
		MedioPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(MedioPane);
		MedioPane.setLayout(null);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				Medio cr = new Medio();
				cr.datosMedio(textNombre.getText(), textObservacion.getText(), Integer.parseInt(textIDTipo.getText()));
				textNombre.setText("");
				textObservacion.setText("");
				textIDTipo.setText("");
			}
		});
		btnGuardar.setBounds(181, 215, 89, 23);
		MedioPane.add(btnGuardar);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(84, 42, 46, 14);
		MedioPane.add(lblNombre);
		
		JLabel lblObservacion = new JLabel("Observacion");
		lblObservacion.setBounds(84, 67, 75, 14);
		MedioPane.add(lblObservacion);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(181, 39, 187, 20);
		MedioPane.add(textNombre);
		
		textObservacion = new JTextField();
		textObservacion.setColumns(10);
		textObservacion.setBounds(181, 67, 187, 102);
		MedioPane.add(textObservacion);
		
		JLabel lblMedio = new JLabel("DATOS MEDIO");
		lblMedio.setBounds(181, 11, 86, 14);
		MedioPane.add(lblMedio);
		
		JLabel lblidTipo = new JLabel("ID Tipo del medio");
		lblidTipo.setBounds(84, 187, 87, 14);
		MedioPane.add(lblidTipo);
		
		textIDTipo = new JTextField();
		textIDTipo.setColumns(10);
		textIDTipo.setBounds(181, 184, 187, 20);
		MedioPane.add(textIDTipo);
	}
}
