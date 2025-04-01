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
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class FrTiposMedio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel TiposMedioPane;
	private JTextField textObservacion;
	private JTextField textNombre;
	private JTextField textIDTipoMedio;
	TiposMedio cr = new TiposMedio();
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
		setTitle("TIPOS DE MEDIO DE COMUNICACION");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\352135_smartphone_icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 333);
		TiposMedioPane = new JPanel();
		TiposMedioPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(TiposMedioPane);
		TiposMedioPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setBounds(47, 81, 46, 14);
		TiposMedioPane.add(lblNombre);
		
		JLabel lblObservacion = new JLabel("Observacion");
		lblObservacion.setBounds(42, 115, 68, 14);
		TiposMedioPane.add(lblObservacion);
		
		textObservacion = new JTextField();
		textObservacion.setBounds(120, 117, 246, 108);
		TiposMedioPane.add(textObservacion);
		textObservacion.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(120, 78, 246, 20);
		TiposMedioPane.add(textNombre);
		textNombre.setColumns(10);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\326688_floppy_save_guardar_icon.png"));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.create(textNombre.getText(), textObservacion.getText());
				textNombre.setText("");
				textObservacion.setText("");
			}
		});
		btnGuardar.setBounds(296, 236, 68, 47);
		TiposMedioPane.add(btnGuardar);
		
		JLabel lblTiposMedio = new JLabel("DATOS TIPOS DE MEDIO");
		lblTiposMedio.setBounds(160, 11, 149, 36);
		TiposMedioPane.add(lblTiposMedio);
		
		JButton btnGuardar_1 = new JButton("");
		btnGuardar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				cr.delete(Integer.parseInt(textIDTipoMedio.getText()));
				textIDTipoMedio.setText("");
			}
		});
		btnGuardar_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564505_close_delete_exit_remove_icon.png"));
		btnGuardar_1.setBounds(120, 236, 68, 47);
		TiposMedioPane.add(btnGuardar_1);
		
		textIDTipoMedio = new JTextField();
		textIDTipoMedio.setColumns(10);
		textIDTipoMedio.setBounds(120, 53, 246, 20);
		TiposMedioPane.add(textIDTipoMedio);
		
		JLabel lblidTipoMedio = new JLabel("ID Tipo");
		lblidTipoMedio.setBounds(47, 56, 46, 14);
		TiposMedioPane.add(lblidTipoMedio);
	}

}
