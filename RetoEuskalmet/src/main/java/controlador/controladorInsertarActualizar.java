package controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.JSONException;

import modelo.DescargarJSON;
import modelo.JSONtoXML;
import modelo.InsertarDatosGeograficos;
import modelo.DescargarDatosMetereologicos;
import modelo.InsertarDatosAtmosfericos;
import modelo.InsertarRelacionExiste;

public class controladorInsertarActualizar {

	public String ejecutar() throws FileNotFoundException, JSONException, IOException {
		boolean existen = false;
		String texto = "";
		
		File archivoMunicipios = new File("./archivos/municipios.json");
		File archivoIndex = new File("./archivos/index.json");
		File archivoEstaciones = new File("./archivos/estaciones.json");
		File archivoEspNaturales = new File("./archivos/espacios-naturales.json");
		
		if (archivoIndex.exists()) {
		    existen = true;
		}
		if (archivoMunicipios.exists()) {
		    existen = true;
		}
		if (archivoEstaciones.exists()) {
		    existen = true;
		}
		if (archivoEspNaturales.exists()) {
		    existen = true;
		}
	
		if (!existen) {
		    DescargarJSON descargarJSON = new DescargarJSON();
		    JSONtoXML jsonToXml = new JSONtoXML();
		    InsertarDatosGeograficos insertarDatosGeograficos = new InsertarDatosGeograficos();
		    InsertarRelacionExiste insertarRelacionExiste = new InsertarRelacionExiste();
		    DescargarDatosMetereologicos descargarDatosMetereologicos = new DescargarDatosMetereologicos();
		    InsertarDatosAtmosfericos insertarDatosAtmosfericos = new InsertarDatosAtmosfericos();
		    
	
		    descargarJSON.DescargarJSON();
		    jsonToXml.JSONtoXML();
		    insertarDatosGeograficos.InsertarDatosGeograficos();
		    insertarRelacionExiste.InsertarRelacionExiste();
		    descargarDatosMetereologicos.DescargarDatosMetereologicos();
		    insertarDatosAtmosfericos.InsertarDatosAtmosfericos();
		    
		    texto = "Se han cargado los datos correctamente :)";
		    
		}else {
			DescargarDatosMetereologicos descargarDatosMetereologicos = new DescargarDatosMetereologicos();
		    InsertarDatosAtmosfericos insertarDatosAtmosfericos = new InsertarDatosAtmosfericos();
			
			Boolean igual = descargarDatosMetereologicos.DescargarDatosMetereologicos();
			
		    if(!igual) {
		    	insertarDatosAtmosfericos.InsertarDatosAtmosfericos();
		    	texto = "Se ha actualizado la base de datos :)";
		    }else {
		    	texto = "No hay actualizaciones disponibles :(";
		    }
		    
		}
		
		return texto;
		
	}

}
