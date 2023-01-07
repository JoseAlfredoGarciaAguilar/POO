package POO;

public class Persona {
	private String Nombre;
	private int Edad;
	
	Persona(){
		//CONSTRUCTOR VACÍO
	}
	
	Persona(String N, int E){
		super();
		Nombre=N;
		Edad=E;
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
}