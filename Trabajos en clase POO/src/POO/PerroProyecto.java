package POO;

public class PerroProyecto {
	private String Nombre;
	private int Edad;
	private String Raza;
	
	PerroProyecto(){
		//CONSTRUCTOR VAC�O
	}
	PerroProyecto(String N, int E, String R){
		Nombre = N;
		Edad = E;
		Raza = R;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getRaza() {
		return Raza;
	}
	public void setRaza(String raza) {
		Raza = raza;
	}
}
//JOS� ALFREDO GARC�A AGUILAR
//PROYECTO
//CLASE 4-5 PM
//MAESTRO LUIS ESTEBAN L�PEZ MENDOZA