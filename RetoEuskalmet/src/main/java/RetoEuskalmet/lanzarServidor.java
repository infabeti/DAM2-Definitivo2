package RetoEuskalmet;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.JSONException;

import modelo.DescargarJSON;
import modelo.JSONtoXML;
import modelo.InsertarDatosGeograficos;
import modelo.DescargarDatosMetereologicos;
import modelo.InsertarDatosAtmosfericos;
import modelo.InsertarRelacionExiste;

public class lanzarServidor {

	public static void main(String[] args) throws FileNotFoundException, JSONException, IOException {

//  Lanza las clases en el orden:
//		
//	1.- DescargarJSON
//	2.- JSONtoXML
		//Aquí irá la comprobación con Hash 1
//	3.- InsertarDatosGeograficos
//	4.- DescargarDatosMetereologicos
		//Aquí irá la comprobación con Hash 2
//	5.- InsertarDatosAtmosfericos
//	6.- InsertarRelacionExiste
		
		DescargarJSON.DescargarJSON();
		JSONtoXML.JSONtoXML();
		
		InsertarDatosGeograficos.InsertarDatosGeograficos();
		DescargarDatosMetereologicos.DescargarDatosMetereologicos();
		
		InsertarDatosAtmosfericos.InsertarDatosAtmosfericos();
		InsertarRelacionExiste.InsertarRelacionExiste();
	}

}
