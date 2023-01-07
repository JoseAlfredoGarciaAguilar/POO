package Herencia;

public class Alumno extends Persona {
	private double Promedio;
	private int Carrera;
	private int Semestre;
	
	Alumno(){
		//CONSTRUCTOR VAC�O
	}

	public Alumno(String nombre, int edad, double promedio, int carrera, int semestre) {
		super(nombre, edad);
		Promedio = promedio;
		Carrera = carrera;
		Semestre = semestre;
	}

	public double getPromedio() {
		return Promedio;
	}

	public void setPromedio(double promedio) {
		Promedio = promedio;
	}

	public int getCarrera() {
		return Carrera;
	}

	public void setCarrera(int carrera) {
		Carrera = carrera;
	}

	public int getSemestre() {
		return Semestre;
	}

	public void setSemestre(int semestre) {
		Semestre = semestre;
	}
	
	public String ToString(){
		String estudio="";
		if(Carrera==1){
			estudio = "SISTEMAS";
		}
		if(Carrera==2){
			estudio = "TICS";
		}
		
		return Nombre + " TIENE " + Edad + " A�OS DE EDAD, TIENE " + Promedio + " DE PROMEDIO SEMESTRAL, ESTUDIA " + estudio + ", EN EL SEMESTRE " + Semestre;
		}
	}
//JOS� ALFREDO GARC�A AGUILAR
//PROGRAMACI�N ORIENTADA A OBJETOS
//CLASE 4-5 PM
//MAESTRO LUIS ESTEBAN L�PEZ MENDOZA