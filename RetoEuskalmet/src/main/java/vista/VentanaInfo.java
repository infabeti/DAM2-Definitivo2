package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class VentanaInfo extends JFrame{
	
	Controlador c = new Controlador();
	private JPanel contentPane;
	public JTextField txtOk;
	public JButton btnActualizar = new JButton("Actualizar BBDD");
	public JButton btnSalir = new JButton("Salir");
	
	public VentanaInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtOk = new JTextField();
		txtOk.setBounds(139, 104, 222, 23);
		contentPane.add(txtOk);
		txtOk.setColumns(10);
		
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOk.setText("Trabajando en ello...");
				try {
					if(c.Actualizar().equals("Si")) {
						txtOk.setText("Base de datos actualizada");
					}
				} catch (IOException e1) {
					txtOk.setText("Los datos estan en regla");
				}
			}
		});
		
		btnActualizar.setBounds(58, 277, 136, 23);
		contentPane.add(btnActualizar);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnSalir.setBounds(332, 277, 89, 23);
		contentPane.add(btnSalir);
	}
}
