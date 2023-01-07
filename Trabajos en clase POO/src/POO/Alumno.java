package POO;

public class Alumno {
	//ATRIBUTOS DE LA CLASE
	private String NumControl;
	private String Nombres;
	private String Carrera;
	private double Promedio;
	private double ca1;
	private double ca2;
	private double ca3;
	private double ca4;
	
	Alumno(){
		//CONSTRUCTOR VACIO
	}
	Alumno(String NC, String N, String Car, double Prom, double c1, double c2, double c3, double c4){
		NumControl = NC;
		Nombres = N;
		Carrera = Car;
		Promedio = Prom;
		ca1 = c1;
		ca2 = c2;
		ca3 = c3;
		ca4 = c4;
	}
	public String getNumControl() {
		return NumControl;
	}
	public void setNumControl(String numControl) {
		NumControl = numControl;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public double getPromedio() {
		return Promedio;
	}
	public void setPromedio(double promedio) {
		Promedio = promedio;
	}
	public double getCa1() {
		return ca1;
	}
	public void setCa1(double ca1) {
		this.ca1 = ca1;
	}
	public double getCa2() {
		return ca2;
	}
	public void setCa2(double ca2) {
		this.ca2 = ca2;
	}
	public double getCa3() {
		return ca3;
	}
	public void setCa3(double ca3) {
		this.ca3 = ca3;
	}
	public double getCa4() {
		return ca4;
	}
	public void setCa4(double ca4) {
		this.ca4 = ca4;
	}
	public String getCarrera() {
		return Carrera;
	}
	public void setCarrera(String carrera) {
		Carrera = carrera;
	}
	public double ActualizaProm(){
		Promedio = (ca1+ca2+ca3+ca4)/4;
		return Promedio;
	}
}