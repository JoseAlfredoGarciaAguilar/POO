package POO;

public class PersonaProyecto {
	private String Nombre;
	private int Edad;
	private int Sexo;
	
	PersonaProyecto(){
		//CONSTRUCTOR VACÍO
	}
	PersonaProyecto(String N, int E, int S){
		Nombre = N;
		Edad = E;
		Sexo = S;
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
	public int getSexo() {
		return Sexo;
	}
	public void setSexo(int sexo) {
		Sexo = sexo;
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//PROYECTO
//CLASE 4-5 PM
//MAESTRO LUIS ESTEBAN LÓPEZ MENDOZA