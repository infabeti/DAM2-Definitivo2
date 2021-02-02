package vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.json.JSONException;

import controlador.controladorInsertarActualizar;

public class VentanaEjecutar extends JFrame {
	
	private JPanel contentPane;
	private static JLabel label;
	private JButton btnIniciar;
	
	public static void main(String[] args) {
		VentanaEjecutar iniciar = new VentanaEjecutar();
		iniciar.setVisible(true);
	}
	
	public VentanaEjecutar() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 300, 750, 400);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		label = new JLabel("");
		label.setBounds(50, 200, 650, 100);
		contentPane.add(label);
		
		btnIniciar = new JButton("INICIAR");
		btnIniciar.setBounds(280, 75, 150, 50);
		contentPane.add(btnIniciar);
		btnIniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				controladorInsertarActualizar insertarActualizar = new controladorInsertarActualizar();
				try {
					String texto = insertarActualizar.ejecutar();
					label.setText(texto);
					label.setFont(new Font(label.getFont().getName(), Font.PLAIN, 40));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					label.setText("Ups... Ha habido un error.\n Disculpe las molestias");
					label.setFont(new Font(label.getFont().getName(), Font.PLAIN, 30));
				}
			}

		});
	}
}
