package Herencia;

public class Profesor extends Persona {
	public double Sueldo;
	public int Tipo;
	public int Especialidad;
	
	public Profesor(){
		//CONSTRUCTOR VAC�O
	}

	public Profesor(String nombre, int edad, double sueldo, int tipo, int especialidad) {
		super(nombre, edad);
		Sueldo = sueldo;
		Tipo = tipo;
		Especialidad = especialidad;
	}

	public double getSueldo() {
		return Sueldo;
	}

	public void setSueldo(double sueldo) {
		Sueldo = sueldo;
	}

	public int getTipo() {
		return Tipo;
	}

	public void setTipo(int tipo) {
		Tipo = tipo;
	}

	public int getEspecialidad() {
		return Especialidad;
	}

	public void setEspecialidad(int especialidad) {
		Especialidad = especialidad;
	}
	
	public String ToString(){
		String tiempo="", empleo="";
		if(Tipo == 1){
			tiempo = "TIEMPO COMPLETO";
		}
		if(Tipo == 2){
			tiempo = "MEDIO TIEMPO";
		}
		
		if(Especialidad == 1){
			empleo = "LICENCIATURA";
		}
		if(Especialidad == 2){
			empleo = "MAESTR�A";
		}
		if(Especialidad == 3){
			empleo = "DOCTORADO";
		}
		
		return Nombre + " TIENE " + Edad + " A�OS DE EDAD, SU SUELDO SIN INCREMENTAR ES $" + Sueldo + " AL MES, TRABAJA A " + tiempo + ", CON " + empleo;
	}
}
//JOS� ALFREDO GARC�A AGUILAR
//PROGRAMACI�N ORIENTADA A OBJETOS
//CLASE 4-5 PM
//MAESTRO LUIS ESTEBAN L�PEZ MENDOZA