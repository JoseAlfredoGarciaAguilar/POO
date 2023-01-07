package POO;

public class AgendaProyecto {
	private String Nombre;
	private int Telefono;
	
	AgendaProyecto(){
		//CONTRUCTOR VACÍO
	}
	
	AgendaProyecto(String N, int T){
		Nombre=N;
		Telefono=T;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	
	public String ToString() {
		return Nombre + "   " + Telefono;
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM
//MAESTRO LUIS ESTEBAN LÓPEZ MENDOZA