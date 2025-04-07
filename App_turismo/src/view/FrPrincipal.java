package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrPrincipal frame = new FrPrincipal();
					frame.setVisible(true);
					frame.setExtendedState(MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\2620519_employee_hierarchy_job_seeker_unemployee_icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Agencia");
		lblNewLabel_1.setBounds(21, 40, 69, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Clientes");
		lblNewLabel_2.setBounds(96, 40, 69, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Compañia");
		lblNewLabel_3.setBounds(175, 40, 69, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Medio");
		lblNewLabel_4.setBounds(254, 40, 69, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Operador");
		lblNewLabel_5.setIcon(null);
		lblNewLabel_5.setBounds(349, 40, 69, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("Paquetes");
		lblNewLabel_1_1.setBounds(21, 157, 69, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Promotor");
		lblNewLabel_1_2.setBounds(96, 157, 69, 14);
		getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tipos Medio");
		lblNewLabel_1_3.setBounds(166, 157, 69, 14);
		getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Tipos Transporte");
		lblNewLabel_1_4.setBounds(243, 157, 97, 14);
		getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Vehiculos");
		lblNewLabel_1_5.setBounds(349, 157, 69, 14);
		getContentPane().add(lblNewLabel_1_5);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\7648081_travel_agency_service_tourism_icon.png"));
		btnNewButton.setBounds(22, 76, 45, 49);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\309035_user_account_human_person_icon.png"));
		btnNewButton_1.setBounds(96, 76, 45, 49);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\211875_plane_icon.png"));
		btnNewButton_2.setBounds(171, 76, 51, 49);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9004661_envelope_mail_email_letter_icon.png"));
		btnNewButton_3.setBounds(256, 76, 51, 49);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\7791667_necktie_businessman_suit_manager_employee_icon.png"));
		btnNewButton_4.setBounds(349, 76, 58, 49);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9025861_package_box_icon.png"));
		btnNewButton_5.setBounds(21, 201, 46, 49);
		getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3994384_local_location_map_travel_world_icon.png"));
		btnNewButton_6.setBounds(96, 201, 45, 49);
		getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\352135_smartphone_icon.png"));
		btnNewButton_7.setBounds(171, 201, 51, 49);
		getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8541772_car_transport_icon.png"));
		btnNewButton_8.setBounds(256, 201, 51, 49);
		getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\172508_motorcycle_icon.png"));
		btnNewButton_9.setBounds(349, 201, 55, 49);
		getContentPane().add(btnNewButton_9);
	}
}
