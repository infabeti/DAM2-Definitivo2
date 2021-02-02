package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.JSONException;
import modelo.DescargarDatosMetereologicos;
import modelo.DescargarJSON;
import modelo.InsertarDatosAtmosfericos;
import modelo.InsertarDatosGeograficos;
import modelo.InsertarRelacionExiste;
import modelo.JSONtoXML;

public class Controlador {

	public boolean EstaActualizado() throws FileNotFoundException, JSONException, IOException {
	//  Lanza las clases en el orden:
//			
//		1.- DescargarJSON
//		2.- JSONtoXML
			//Aquí irá la comprobación con Hash 1
//		3.- InsertarDatosGeograficos
//		4.- DescargarDatosMetereologicos
			//Aquí irá la comprobación con Hash 2
//		5.- InsertarDatosAtmosfericos
//		6.- InsertarRelacionExiste
		
			DescargarJSON.DescargarJSON();
			JSONtoXML.JSONtoXML();

		return true;
	}
	public String Actualizar() throws FileNotFoundException, IOException {
		String todook = "";
		if(EstaActualizado() == true){
			try {
				InsertarDatosGeograficos.InsertarDatosGeograficos();
				DescargarDatosMetereologicos.DescargarDatosMetereologicos();
		
				InsertarDatosAtmosfericos.InsertarDatosAtmosfericos();
				InsertarRelacionExiste.InsertarRelacionExiste();
				todook= "Si";
			}catch(IOException e) {
				todook = "No";
			}
		}else {
			todook = "No";
		}
		return todook;
	}
}
