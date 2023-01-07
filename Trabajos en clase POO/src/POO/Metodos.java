package POO;
//EL PROGRAMA GENERA DOS NÚMEROS ALEATORIOS Y LOS SUMA EN UN MÉTODO
public class Metodos {

	public static void main(String[] args) {
		System.out.println(CalculaSuma()); //IMPRIME EL VALOR DEL MÉTODO
	}
	public static String CalculaSuma(){
		int S=0;
		int A=(int)(Math.random()*10);
		int B=(int)(Math.random()*10);
		S=A+B;
		return "LA SUMA ES: " + S;
	}
}