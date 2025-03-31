package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.TiposTransporte;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrTiposTransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel TiposTransportePane;
	private JTextField textNombre;
	private JTextField textObservacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrTiposTransporte frame = new FrTiposTransporte();
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
	public FrTiposTransporte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		TiposTransportePane = new JPanel();
		TiposTransportePane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(TiposTransportePane);
		TiposTransportePane.setLayout(null);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TiposTransporte create = new TiposTransporte();
				create.create(textNombre.getText(), textObservacion.getText());
				textNombre.setText("");
				textObservacion.setText("");
			}
		});
		btnGuardar.setBounds(286, 227, 89, 23);
		TiposTransportePane.add(btnGuardar);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setBounds(42, 73, 101, 14);
		TiposTransportePane.add(lblNombre);
		
		JLabel lblObservacion = new JLabel("observacion");
		lblObservacion.setBounds(42, 116, 101, 14);
		TiposTransportePane.add(lblObservacion);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(175, 70, 200, 20);
		TiposTransportePane.add(textNombre);
		
		textObservacion = new JTextField();
		textObservacion.setColumns(10);
		textObservacion.setBounds(175, 112, 200, 104);
		TiposTransportePane.add(textObservacion);
		
		JLabel lblTiposTransporte = new JLabel("DATOS TIPO DE TRANSPORTE");
		lblTiposTransporte.setBounds(118, 26, 172, 14);
		TiposTransportePane.add(lblTiposTransporte);
	}
}
