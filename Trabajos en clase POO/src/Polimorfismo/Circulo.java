package Polimorfismo;

public class Circulo extends Figuras {
	private int radio;
	
	public Circulo(){
		//CONSTRUCTOR VAC�O
	}
	
	public Circulo(String N, int C, int G, int radio){
		super(N,C,G);
		this.radio=radio;
	}
	
	//METODOS ABSTRACTOS
	public int CalcularArea(){
		double area = (3.1416 * (radio*radio));
		//SE CASTEA EL �REA A INT
		return (int) area;
	}
	
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int CalcularPerimetro(){
		double perimetro = (2*radio)*Math.PI;
		//SE CASTEA EL PER�METRO A INT
		return (int) perimetro;
	}
	
	//INTERFAES
	public void Rebotar(){
		System.out.println("EL C�RCULO HA DADO UN REBOTE");
	}
	
	public void AumentarTama�o(double porcentaje){
		radio = (int) (radio+(radio*porcentaje));
	}
	
	public void ReducirTama�o(double porcentaje){
		radio = (int) (radio-(radio*porcentaje));
	}
}