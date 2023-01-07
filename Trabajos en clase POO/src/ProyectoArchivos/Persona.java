package ProyectoArchivos;
import java.io.Serializable;

public abstract class Persona implements Serializable {
	private String nombre;
	private int edad; //ENTRE 10 Y 100
	private char sexo; //H=HOMBRE   M=MUJER
	
	public Persona(){
		//CONSTRUCTOR VACÍO
	}
	
	public Persona(String nombre, int edad, char sexo){
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM