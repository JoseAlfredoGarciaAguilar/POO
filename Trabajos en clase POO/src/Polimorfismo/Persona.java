package Polimorfismo;

public class Persona {
	private String nombre;
	private int edad; //DEL 1 AL 79
	private int sexo; //1-HOMBRE   2-MUJER
	private int asistencia; //1-SÍ   2-NO
	
	public Persona(){
		//CONSTRUCTOR VACÍO
	}

	public Persona(String nombre, int edad, int sexo, int asistencia) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.asistencia = asistencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public int getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(int asistencia) {
		this.asistencia = asistencia;
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM