package RetoEuskalmet;

import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.JSONException;

import vista.VentanaInfo;


public class lanzarServidor {

	public static void main(String[] args) throws FileNotFoundException, JSONException, IOException{
		controlador.Controlador c = new controlador.Controlador();
		vista.VentanaInfo ventana = new vista.VentanaInfo();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInfo frame = new VentanaInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

