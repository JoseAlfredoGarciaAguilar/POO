package Polimorfismo;

public class Profesor extends Persona {
	private int materia; //1-MATEMÁTICAS   2-PROGRAMACIÓN   3-CONTABILIDAD
	
	public Profesor(){
		//CONSTRUCTOR VACÍO
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
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM