package Herencia;

public class Persona {
	public String Nombre;
	public int Edad;
	
	Persona(){
		//CONSTRUCTOR VAC�O
	}
	
	public Persona(String nombre, int edad) {
		super();
		Nombre = nombre;
		Edad = edad;
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

	public void QuienSoy(){
		System.out.println("SOY " + Nombre + " Y TENGO " + Edad + " A�OS");
	}
}
//JOS� ALFREDO GARC�A AGUILAR
//PROGRAMACI�N ORIENTADA A OBJETOS
//CLASE 4-5 PM
//MAESTRO LUIS ESTEBAN L�PEZ MENDOZA