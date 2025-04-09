package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.TiposTransporte;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
				try {
					cr.create(textNombre.getText(), textObservacion.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ingrese datos");
				}
				textNombre.setText("");
				textObservacion.setText("");
			}
		});
		btnGuardar.setBounds(248, 236, 55, 47);
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
		
		JButton btnBorrar = new JButton("");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				try {
					cr.delete(Integer.parseInt(textIDTipoTransporte.getText()));
					} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "ingrese datos");
				}
				textIDTipoTransporte.setText("");
			}
		});
		btnBorrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564505_close_delete_exit_remove_icon.png"));
		btnBorrar.setBounds(118, 236, 55, 47);
		TiposTransportePane.add(btnBorrar);
		
		textIDTipoTransporte = new JTextField();
		textIDTipoTransporte.setColumns(10);
		textIDTipoTransporte.setBounds(173, 48, 200, 20);
		TiposTransportePane.add(textIDTipoTransporte);
		
		JLabel lblidTipoTransporte = new JLabel("ID Tipo");
		lblidTipoTransporte.setBounds(42, 51, 101, 14);
		TiposTransportePane.add(lblidTipoTransporte);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cr.read(Integer.parseInt(textIDTipoTransporte.getText()), textNombre, textObservacion);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ingrese datos");
				}
			}
		});
		btnBuscar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\5402443_search_find_magnifier_magnifying_magnifying glass_icon.png"));
		btnBuscar.setBounds(183, 236, 55, 47);
		TiposTransportePane.add(btnBuscar);
		
		JButton btnUpdate = new JButton("");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cr.update(Integer.parseInt(textIDTipoTransporte.getText()), textNombre.getText(), textObservacion.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ingrese datos");
				}
				textIDTipoTransporte.setText("");
				textNombre.setText("");
				textObservacion.setText("");
			}
		});
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4213447_arrow_load_loading_refresh_reload_icon.png"));
		btnUpdate.setBounds(313, 236, 52, 50);
		TiposTransportePane.add(btnUpdate);
	}
}