package Herencia;

public class Cuadrado extends Figuras {
	private int Lado;
	
	public Cuadrado(){
		System.out.println("CREA CUADRADO");
	}
	
	public Cuadrado(String N, int G, String C, int L){
		super(N,G,C);
		Lado=L;
	}

	public int getLado() {
		return Lado;
	}

	public void setLado(int lado) {
		Lado = lado;
	}
	
	public int CalcularArea(){
		int Area=Lado*Lado;
		return Area;
	}
}