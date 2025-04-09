package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class FrPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrPrincipal frameP = new FrPrincipal();
					frameP.setVisible(true);
					frameP.setExtendedState(MAXIMIZED_BOTH);
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(255, 250, 250));
		setType(Type.UTILITY);
		setTitle("GESTION DE REGISTROS");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\2620519_employee_hierarchy_job_seeker_unemployee_icon.png"));
		setBounds(100, 100, 467, 300);
		getContentPane().setLayout(null);
		
		JLabel lblAgencia = new JLabel("Agencia");
		lblAgencia.setFont(new Font("Verdana", Font.BOLD, 11));
		lblAgencia.setForeground(Color.ORANGE);
		lblAgencia.setBounds(29, 26, 69, 14);
		getContentPane().add(lblAgencia);
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setFont(new Font("Verdana", Font.BOLD, 11));
		lblClientes.setBounds(108, 26, 69, 14);
		getContentPane().add(lblClientes);
		
		JLabel lblCompañia = new JLabel("Compañia");
		lblCompañia.setForeground(new Color(0, 128, 255));
		lblCompañia.setFont(new Font("Verdana", Font.BOLD, 11));
		lblCompañia.setBackground(new Color(0, 0, 0));
		lblCompañia.setBounds(187, 26, 69, 14);
		getContentPane().add(lblCompañia);
		
		JLabel lblMedio = new JLabel("Medio");
		lblMedio.setForeground(new Color(255, 34, 145));
		lblMedio.setBackground(new Color(0, 0, 0));
		lblMedio.setFont(new Font("Verdana", Font.BOLD, 11));
		lblMedio.setBounds(275, 26, 69, 14);
		getContentPane().add(lblMedio);
		
		JLabel lblOperador = new JLabel("Operador");
		lblOperador.setForeground(new Color(83, 83, 255));
		lblOperador.setFont(new Font("Verdana", Font.BOLD, 11));
		lblOperador.setBounds(372, 26, 69, 14);
		lblOperador.setIcon(null);
		getContentPane().add(lblOperador);
		
		JLabel lblPaquetes = new JLabel("Paquetes");
		lblPaquetes.setForeground(new Color(114, 56, 56));
		lblPaquetes.setBackground(new Color(0, 0, 0));
		lblPaquetes.setFont(new Font("Verdana", Font.BOLD, 11));
		lblPaquetes.setBounds(29, 127, 69, 14);
		getContentPane().add(lblPaquetes);
		
		JLabel lblPromotor = new JLabel("Promotor");
		lblPromotor.setForeground(new Color(191, 125, 125));
		lblPromotor.setFont(new Font("Verdana", Font.BOLD, 11));
		lblPromotor.setBounds(108, 127, 69, 14);
		getContentPane().add(lblPromotor);
		
		JLabel lblTiposMedio = new JLabel("Tipos Medio");
		lblTiposMedio.setForeground(new Color(0, 204, 51));
		lblTiposMedio.setBackground(new Color(0, 0, 0));
		lblTiposMedio.setFont(new Font("Verdana", Font.BOLD, 11));
		lblTiposMedio.setBounds(187, 127, 82, 14);
		getContentPane().add(lblTiposMedio);
		
		JLabel lblTiposTransporte = new JLabel("Tipos Vehiculos");
		lblTiposTransporte.setForeground(new Color(128, 128, 192));
		lblTiposTransporte.setFont(new Font("Verdana", Font.BOLD, 11));
		lblTiposTransporte.setBounds(275, 122, 105, 24);
		getContentPane().add(lblTiposTransporte);
		
		JLabel lblVehiculos = new JLabel("Vehiculos");
		lblVehiculos.setForeground(new Color(255, 108, 182));
		lblVehiculos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVehiculos.setBounds(382, 128, 69, 14);
		getContentPane().add(lblVehiculos);
		
		JButton btnAgencia = new JButton("");
		btnAgencia.setBackground(new Color(250, 250, 210));
		btnAgencia.setForeground(Color.BLACK);
		btnAgencia.setBounds(36, 51, 51, 49);
		btnAgencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrAgencia agencia = new FrAgencia(); //llamar al frame de la clase FrAgencia
				agencia.setVisible(true); //mostrar el frame de dicha clase
			}
		});
		btnAgencia.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\7648081_travel_agency_service_tourism_icon.png"));
		getContentPane().add(btnAgencia);
		
		JButton btnClientes = new JButton("");
		btnClientes.setBackground(new Color(192, 192, 192));
		btnClientes.setBounds(121, 51, 45, 49);
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrClientes cliente = new FrClientes();
				cliente.setVisible(true);
			}
		});
		btnClientes.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\309035_user_account_human_person_icon.png"));
		getContentPane().add(btnClientes);
		
		JButton btnCompañia = new JButton("");
		btnCompañia.setBackground(new Color(135, 206, 250));
		btnCompañia.setBounds(200, 51, 51, 49);
		btnCompañia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrCompañia compañia = new FrCompañia();
				compañia.setVisible(true);
			}
		});
		btnCompañia.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\211875_plane_icon.png"));
		getContentPane().add(btnCompañia);
		
		JButton btnMedio = new JButton("");
		btnMedio.setBackground(new Color(255, 26, 140));
		btnMedio.setForeground(new Color(0, 0, 0));
		btnMedio.setBounds(285, 51, 51, 49);
		btnMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrMedio medio = new FrMedio();
				medio.setVisible(true);
			}
		});
		btnMedio.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9004661_envelope_mail_email_letter_icon.png"));
		getContentPane().add(btnMedio);
		
		JButton btnOperador = new JButton("");
		btnOperador.setBackground(new Color(43, 43, 255));
		btnOperador.setBounds(372, 51, 58, 49);
		btnOperador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrOperador operador = new FrOperador();
				operador.setVisible(true);
			}
		});
		btnOperador.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\7791667_necktie_businessman_suit_manager_employee_icon.png"));
		getContentPane().add(btnOperador);
		
		JButton btnPaquetes = new JButton("");
		btnPaquetes.setBackground(new Color(182, 107, 107));
		btnPaquetes.setBounds(39, 157, 46, 49);
		btnPaquetes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrPaquetes paquete = new FrPaquetes();
				paquete.setVisible(true);
			}
		});
		btnPaquetes.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9025861_package_box_icon.png"));
		getContentPane().add(btnPaquetes);
		
		JButton btnPromotor = new JButton("");
		btnPromotor.setBackground(new Color(170, 0, 85));
		btnPromotor.setBounds(121, 157, 45, 49);
		btnPromotor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrPromotor promotor = new FrPromotor();
				promotor.setVisible(true);
			}
		});
		btnPromotor.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3994384_local_location_map_travel_world_icon.png"));
		getContentPane().add(btnPromotor);
		
		JButton btnTiposMedio = new JButton("");
		btnTiposMedio.setBackground(new Color(0, 255, 0));
		btnTiposMedio.setBounds(200, 157, 51, 49);
		btnTiposMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrTiposMedio tiposmedio = new FrTiposMedio();
				tiposmedio.setVisible(true);
			}
		});
		btnTiposMedio.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\352135_smartphone_icon.png"));
		getContentPane().add(btnTiposMedio);
		
		JButton btnTiposTransporte = new JButton("");
		btnTiposTransporte.setBackground(new Color(217, 207, 254));
		btnTiposTransporte.setBounds(285, 157, 51, 49);
		btnTiposTransporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrTiposTransporte tipostransporte = new FrTiposTransporte();
				tipostransporte.setVisible(true);
			}
		});
		btnTiposTransporte.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8541772_car_transport_icon.png"));
		getContentPane().add(btnTiposTransporte);
		
		JButton btnVehiculos = new JButton("");
		btnVehiculos.setBackground(new Color(255, 128, 128));
		btnVehiculos.setForeground(new Color(0, 0, 0));
		btnVehiculos.setBounds(372, 157, 55, 49);
		btnVehiculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrVehiculos vehiculo = new FrVehiculos();
				vehiculo.setVisible(true);
			}
		});
		btnVehiculos.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\172508_motorcycle_icon.png"));
		getContentPane().add(btnVehiculos);
	}
}
