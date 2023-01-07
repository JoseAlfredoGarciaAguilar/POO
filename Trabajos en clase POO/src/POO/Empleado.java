package POO;

public class Empleado {
	private String nombre;
	private int edad;
	private double peso;
	
	Empleado() {
		//Constructor vacío
	}
	Empleado(String n, int e, double p){
		nombre=n;
		edad=e;
		peso=p;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String CambiaNombre(){
		return "Hola " + nombre;
	}
	public String Calcula(){
		return "Resultado Peso x Edad: " + (peso*edad);
	}
}