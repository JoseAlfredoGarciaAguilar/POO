package Polimorfismo;

public class Estudiante extends Persona {
	private double calif; //ENTRE 0 Y 10
	
	public Estudiante(){
		//CONSTRUCTOR VAC�O
	}
	
	public Estudiante(String nombre, int edad, int sexo, int asistencia, double calif){
		super(nombre, edad, sexo, asistencia);
		this.calif = calif;
	}

	public double getCalif() {
		return calif;
	}

	public void setCalif(double calif) {
		this.calif = calif;
	}
}
//JOS� ALFREDO GARC�A AGUILAR
//CLASE 4-5 PM