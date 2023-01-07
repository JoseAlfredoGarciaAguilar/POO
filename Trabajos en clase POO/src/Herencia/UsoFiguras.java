package Herencia;
//PIDE BASE Y ALTURA DE UN TRI�NGULO Y CALCULA SU �REA
//PIDE EL LADO DE UN CUADRADO Y CALCULA SU �REA
public class UsoFiguras {

	public static void main(String[] args) {
		Cuadrado Cua = new Cuadrado();
		Triangulo Tri = new Triangulo();
		int A=0, B=0, L=0;
		System.out.print("BASE DEL TRI�NGULO: ");
		B = Leer.datoInt();
		System.out.print("ALTURA DEL TRI�NGULO: ");
		A = Leer.datoInt();
		System.out.print("�CU�NTO MIDE EL LADO DEL CUADRADO: ");
		L = Leer.datoInt();
		String No = null, Co=null;
		int Bo=0;
		System.out.print("NOMBRE DE LA FIGURA: ");
		No = Leer.dato();
		System.out.print("COLOR DE LA FIGURA: ");
		Co = Leer.dato();
		System.out.print("GROSOR DEL BORDE DE LA FIGURA: ");
		Bo = Leer.datoInt();
		Tri = new Triangulo(No, Bo, Co, B, A);
		Cua = new Cuadrado(No, Bo, Co, L);
		System.out.println("EL �REA DEL TRI�NGULO: " + Tri.CalcularArea());
		System.out.println("EL �REA DEL CUADRADO ES: " + Cua.CalcularArea());
	}
}