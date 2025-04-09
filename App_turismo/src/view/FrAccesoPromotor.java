package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Promotor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;

public class FrAccesoPromotor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDocumento;
	private JPasswordField passwordField;
	Promotor cr = new Promotor();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrAccesoPromotor frame = new FrAccesoPromotor();
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
	public FrAccesoPromotor() {
		setTitle("Control de Acceso");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\9044396_group_access_icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(40, 31, 66, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setBounds(40, 88, 86, 14);
		contentPane.add(lblContraseña);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.setBackground(new Color(0, 255, 0));
		btnRegistrar.setForeground(new Color(0, 0, 0));
		btnRegistrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
			try {
				cr.controlacceso(Integer.parseInt(textDocumento.getText()), passwordField.getText());
			} catch (Exception erroringresodatos) {
				JOptionPane.showMessageDialog(null, "ingrese correctamente los datos");
			}
			textDocumento.setText("");
			passwordField.setText("");
			}
		});
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9104178_done_complete_accept_check_list_icon.png"));
		btnRegistrar.setBounds(172, 141, 47, 31);
		contentPane.add(btnRegistrar);
		
		textDocumento = new JTextField();
		textDocumento.setBounds(172, 28, 159, 20);
		contentPane.add(textDocumento);
		textDocumento.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(172, 85, 159, 20);
		contentPane.add(passwordField);
	}
}