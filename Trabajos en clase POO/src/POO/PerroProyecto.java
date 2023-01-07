package POO;

public class PerroProyecto {
	private String Nombre;
	private int Edad;
	private String Raza;
	
	PerroProyecto(){
		//CONSTRUCTOR VACÍO
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
//JOSÉ ALFREDO GARCÍA AGUILAR
//PROYECTO
//CLASE 4-5 PM
//MAESTRO LUIS ESTEBAN LÓPEZ MENDOZA