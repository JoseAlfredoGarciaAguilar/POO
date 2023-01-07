package POO;

public class AlumnoProyecto {
	private String Nombre;
	private int Numero_de_Control, Carrera, Eleccion;
	private double cali1, cali2, cali3, cali4, Promedio;
	
	AlumnoProyecto(){
		//Constructor Vacío
	}
	AlumnoProyecto(String n, int nc, int car, int Ele, double c1, double c2, double c3, double c4, double prom) {
		Nombre = n;
		Numero_de_Control = nc;
		Carrera = car;
		Eleccion = Ele;
		cali1 = c1;
		cali2 = c2;
		cali3 = c3;
		cali4 = c4;
		Promedio = prom;
}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getNumero_de_Control() {
		return Numero_de_Control;
	}
	public void setNumero_de_Control(int numero_de_Control) {
		Numero_de_Control = numero_de_Control;
	}
	public int getCarrera() {
		return Carrera;
	}
	public void setCarrera(int carrera) {
		Carrera = carrera;
	}
	public int getEleccion() {
		return Eleccion;
	}
	public void setEleccion(int eleccion) {
		Eleccion = eleccion;
	}
	public double getCali1() {
		return cali1;
	}
	public void setCali1(double cali1) {
		this.cali1 = cali1;
	}
	public double getCali2() {
		return cali2;
	}
	public void setCali2(double cali2) {
		this.cali2 = cali2;
	}
	public double getCali3() {
		return cali3;
	}
	public void setCali3(double cali3) {
		this.cali3 = cali3;
	}
	public double getCali4() {
		return cali4;
	}
	public void setCali4(double cali4) {
		this.cali4 = cali4;
	}
	public double getPromedio() {
		return Promedio;
	}
	public void setPromedio(double promedio) {
		Promedio = promedio;
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//PROYECTO 1
//PROGRAMACIÓN ORIENTADA A OBJETOS
//MAESTRO LUIS ESTEBAN LÓPEZ MENDOZA