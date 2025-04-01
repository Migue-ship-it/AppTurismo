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
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class FrTiposTransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel TiposTransportePane;
	private JTextField textNombre;
	private JTextField textObservacion;
	private JTextField textIDTipoTransporte;
	TiposTransporte cr = new TiposTransporte();
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\8541772_car_transport_icon.png"));
		setTitle("TIPOS DE TRANSPORTE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 333);
		TiposTransportePane = new JPanel();
		TiposTransportePane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(TiposTransportePane);
		TiposTransportePane.setLayout(null);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\326688_floppy_save_guardar_icon.png"));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.create(textNombre.getText(), textObservacion.getText());
				textNombre.setText("");
				textObservacion.setText("");
			}
		});
		btnGuardar.setBounds(318, 236, 55, 47);
		TiposTransportePane.add(btnGuardar);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setBounds(42, 93, 101, 14);
		TiposTransportePane.add(lblNombre);
		
		JLabel lblObservacion = new JLabel("observacion");
		lblObservacion.setBounds(42, 124, 101, 14);
		TiposTransportePane.add(lblObservacion);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(173, 90, 200, 20);
		TiposTransportePane.add(textNombre);
		
		textObservacion = new JTextField();
		textObservacion.setColumns(10);
		textObservacion.setBounds(173, 121, 200, 104);
		TiposTransportePane.add(textObservacion);
		
		JLabel lblTiposTransporte = new JLabel("DATOS TIPO DE TRANSPORTE");
		lblTiposTransporte.setBounds(118, 26, 172, 14);
		TiposTransportePane.add(lblTiposTransporte);
		
		JButton btnGuardar_1 = new JButton("");
		btnGuardar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				cr.delete(Integer.parseInt(textIDTipoTransporte.getText()));
				textIDTipoTransporte.setText("");
			}
		});
		btnGuardar_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564505_close_delete_exit_remove_icon.png"));
		btnGuardar_1.setBounds(175, 236, 55, 47);
		TiposTransportePane.add(btnGuardar_1);
		
		textIDTipoTransporte = new JTextField();
		textIDTipoTransporte.setColumns(10);
		textIDTipoTransporte.setBounds(173, 48, 200, 20);
		TiposTransportePane.add(textIDTipoTransporte);
		
		JLabel lblidTipoTransporte = new JLabel("ID Tipo");
		lblidTipoTransporte.setBounds(42, 51, 101, 14);
		TiposTransportePane.add(lblidTipoTransporte);
	}
}
