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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Downloads\\2620519_employee_hierarchy_job_seeker_unemployee_icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 300);
		getContentPane().setLayout(null);
		
		JLabel lblAgencia = new JLabel("Agencia");
		lblAgencia.setBounds(42, 40, 69, 14);
		getContentPane().add(lblAgencia);
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setBounds(121, 40, 69, 14);
		getContentPane().add(lblClientes);
		
		JLabel lblCompañia = new JLabel("Compañia");
		lblCompañia.setBounds(200, 40, 69, 14);
		getContentPane().add(lblCompañia);
		
		JLabel lblMedio = new JLabel("Medio");
		lblMedio.setBounds(293, 40, 69, 14);
		getContentPane().add(lblMedio);
		
		JLabel lblOperador = new JLabel("Operador");
		lblOperador.setBounds(372, 40, 69, 14);
		lblOperador.setIcon(null);
		getContentPane().add(lblOperador);
		
		JLabel lblPaquetes = new JLabel("Paquetes");
		lblPaquetes.setBounds(42, 157, 69, 14);
		getContentPane().add(lblPaquetes);
		
		JLabel lblPromotor = new JLabel("Promotor");
		lblPromotor.setBounds(121, 157, 69, 14);
		getContentPane().add(lblPromotor);
		
		JLabel lblTiposMedio = new JLabel("Tipos Medio");
		lblTiposMedio.setBounds(196, 157, 69, 14);
		getContentPane().add(lblTiposMedio);
		
		JLabel lblTiposTransporte = new JLabel("Tipos Transporte");
		lblTiposTransporte.setBounds(275, 152, 83, 24);
		getContentPane().add(lblTiposTransporte);
		
		JLabel lblVehiculos = new JLabel("Vehiculos");
		lblVehiculos.setBounds(382, 157, 69, 14);
		getContentPane().add(lblVehiculos);
		
		JButton btnAgencia = new JButton("");
		btnAgencia.setBounds(42, 76, 45, 49);
		btnAgencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrAgencia agencia = new FrAgencia(); //llamar al frame de la clase FrAgencia
				agencia.setVisible(true); //mostrar el frame de dicha clase
			}
		});
		btnAgencia.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\7648081_travel_agency_service_tourism_icon.png"));
		getContentPane().add(btnAgencia);
		
		JButton btnClientes = new JButton("");
		btnClientes.setBounds(121, 76, 45, 49);
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrClientes cliente = new FrClientes();
				cliente.setVisible(true);
			}
		});
		btnClientes.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\309035_user_account_human_person_icon.png"));
		getContentPane().add(btnClientes);
		
		JButton btnCompañia = new JButton("");
		btnCompañia.setBounds(196, 76, 51, 49);
		btnCompañia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrCompañia compañia = new FrCompañia();
				compañia.setVisible(true);
			}
		});
		btnCompañia.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\211875_plane_icon.png"));
		getContentPane().add(btnCompañia);
		
		JButton btnMedio = new JButton("");
		btnMedio.setBounds(285, 76, 51, 49);
		btnMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrMedio medio = new FrMedio();
				medio.setVisible(true);
			}
		});
		btnMedio.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9004661_envelope_mail_email_letter_icon.png"));
		getContentPane().add(btnMedio);
		
		JButton btnOperador = new JButton("");
		btnOperador.setBounds(371, 76, 58, 49);
		btnOperador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrOperador operador = new FrOperador();
				operador.setVisible(true);
			}
		});
		btnOperador.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\7791667_necktie_businessman_suit_manager_employee_icon.png"));
		getContentPane().add(btnOperador);
		
		JButton btnPaquetes = new JButton("");
		btnPaquetes.setBounds(41, 201, 46, 49);
		btnPaquetes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrPaquetes paquete = new FrPaquetes();
				paquete.setVisible(true);
			}
		});
		btnPaquetes.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9025861_package_box_icon.png"));
		getContentPane().add(btnPaquetes);
		
		JButton btnPromotor = new JButton("");
		btnPromotor.setBounds(121, 201, 45, 49);
		btnPromotor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrPromotor promotor = new FrPromotor();
				promotor.setVisible(true);
			}
		});
		btnPromotor.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3994384_local_location_map_travel_world_icon.png"));
		getContentPane().add(btnPromotor);
		
		JButton btnTiposMedio = new JButton("");
		btnTiposMedio.setBounds(196, 201, 51, 49);
		btnTiposMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrTiposMedio tiposmedio = new FrTiposMedio();
				tiposmedio.setVisible(true);
			}
		});
		btnTiposMedio.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\352135_smartphone_icon.png"));
		getContentPane().add(btnTiposMedio);
		
		JButton btnTiposTransporte = new JButton("");
		btnTiposTransporte.setBounds(285, 201, 51, 49);
		btnTiposTransporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrTiposTransporte tipostransporte = new FrTiposTransporte();
				tipostransporte.setVisible(true);
			}
		});
		btnTiposTransporte.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8541772_car_transport_icon.png"));
		getContentPane().add(btnTiposTransporte);
		
		JButton btnVehiculos = new JButton("");
		btnVehiculos.setBounds(374, 201, 55, 49);
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
