package Polimorfismo;

public class Profesor extends Persona {
	private int materia; //1-MATEM�TICAS   2-PROGRAMACI�N   3-CONTABILIDAD
	
	public Profesor(){
		//CONSTRUCTOR VAC�O
	}
	
	public Profesor(String nombre, int edad, int sexo, int asistencia, int materia){
		super(nombre, edad, sexo, asistencia);
		this.materia = materia;
	}

	public int getMateria() {
		return materia;
	}

	public void setMateria(int materia) {
		this.materia = materia;
	}
}
//JOS� ALFREDO GARC�A AGUILAR
//CLASE 4-5 PM