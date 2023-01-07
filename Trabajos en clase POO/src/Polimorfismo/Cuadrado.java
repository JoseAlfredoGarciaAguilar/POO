package Polimorfismo;

public class Cuadrado extends Figuras{
	private int lado;
	
	public Cuadrado(){
		//CONSTRUCTOR VACÍO
	}
	
	public Cuadrado(String N, int C, int G, int lado){
		super(N,C,G);
		this.lado=lado;
	}
	
	//METODOS ABSTRACTOS
	public int CalcularArea(){
		int area =(lado*lado);
		return area;
	}
	
	public int CalcularPerimetro(){
		int perimetro = lado*4;
		return perimetro;
	}
	
	public void Dibujar(){
		System.out.println("CUADRADO DE ASTERISCOS");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
	}
}
