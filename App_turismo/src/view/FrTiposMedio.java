package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.TiposMedio;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrTiposMedio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel TiposMedioPane;
	private JTextField textObservacion;
	private JTextField textNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrTiposMedio frame = new FrTiposMedio();
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
	public FrTiposMedio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		TiposMedioPane = new JPanel();
		TiposMedioPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(TiposMedioPane);
		TiposMedioPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setBounds(42, 83, 46, 14);
		TiposMedioPane.add(lblNombre);
		
		JLabel lblObservacion = new JLabel("Observacion");
		lblObservacion.setBounds(42, 151, 68, 14);
		TiposMedioPane.add(lblObservacion);
		
		textObservacion = new JTextField();
		textObservacion.setBounds(120, 151, 189, 91);
		TiposMedioPane.add(textObservacion);
		textObservacion.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(120, 80, 86, 20);
		TiposMedioPane.add(textNombre);
		textNombre.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TiposMedio create = new TiposMedio();
				create.create(textNombre.getText(), textObservacion.getText());
				textNombre.setText("");
				textObservacion.setText("");
			}
		});
		btnGuardar.setBounds(320, 109, 89, 23);
		TiposMedioPane.add(btnGuardar);
		
		JLabel lblTiposMedio = new JLabel("DATOS TIPOS DE MEDIO");
		lblTiposMedio.setBounds(152, 25, 149, 36);
		TiposMedioPane.add(lblTiposMedio);
	}

}
