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
		DescargarJSON descargarJSON = new DescargarJSON();
		JSONtoXML jsonToXml = new JSONtoXML();
		InsertarDatosGeograficos insertarDatosGeograficos = new InsertarDatosGeograficos();
		DescargarDatosMetereologicos descargarDatosMetereologicos = new DescargarDatosMetereologicos();
		InsertarDatosAtmosfericos insertarDatosAtmosfericos = new InsertarDatosAtmosfericos();
		InsertarRelacionExiste insertarRelacionExiste = new InsertarRelacionExiste();
		
		descargarJSON.DescargarJSON();
		jsonToXml.JSONtoXML();
		insertarDatosGeograficos.InsertarDatosGeograficos();
		descargarDatosMetereologicos.DescargarDatosMetereologicos();
		insertarDatosAtmosfericos.InsertarDatosAtmosfericos();
		insertarRelacionExiste.InsertarRelacionExiste();
		
	}

}
