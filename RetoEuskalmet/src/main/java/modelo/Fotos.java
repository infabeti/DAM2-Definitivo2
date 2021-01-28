package modelo;

public class Fotos implements java.io.Serializable {

	private String id;
	private Municipios municipios;

	public Fotos() {
	}

	public Fotos(String id) {
		this.id = id;
	}

	public Fotos(String id, Municipios municipios) {
		this.id = id;
		this.municipios = municipios;
	}
	
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Municipios getMunicipios() {
		return this.municipios;
	}

	public void setMunicipios(Municipios municipios) {
		this.municipios = municipios;
	}


}
