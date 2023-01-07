package Herencia;

public class Triangulo extends Figuras {
	private int base;
	private int altura;
	
	public Triangulo(String N, int G, String C, int B, int A){
		super(N,G,C);
		base=B;
		altura=A;
	}
	
	public Triangulo(){
		//CONSTRUCTOR VACÍO
	}
	
	public int CalcularArea(){
		int area = (base*altura) / 2;
		return area;
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}
}