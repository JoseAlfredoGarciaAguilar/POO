package POO;
import java.util.Arrays;

public class UsaPunto {

	public static void main(String[] args) {
		Punto P1 = new Punto();  //Crea objetos
		Punto P2 = new Punto();
		Punto P3 = P1;
		int x, y;
		System.out.print("Coordenada X del Punto 1: ");  //LEE coordenadas Punto 1
		x = Leer.datoInt();
		System.out.print("Coordenada Y del Punto 1: ");
		y = Leer.datoInt();
		P1 = new Punto(x,y);  //ALMACENA punto
		System.out.println("LA COORDENADA DE Y ES: " + P1.LeeYe());
		
		System.out.print("Coordenada X del Punto 2: "); //LEE cordenadas Punto 2
		x = Leer.datoInt();
		System.out.print("Coordenada Y del Punto 2: ");
		y = Leer.datoInt();
		P2 = new Punto(x,y);  //ALMACENA punto
		System.out.println("LA COORDENADA DE X ES: " + P2.LeeX());
		P3 = new Punto(7,0);
		Punto P4 = P3;
		
		Punto[] P = {P1,P2,P3,P4};  //CREA VECTOR Y ALMACENA Objetos
		
		System.out.println(Arrays.toString(P));
		System.out.println(P[0]);
		System.out.println("Puntos creados " + Punto.totalPuntos);
		
		imprime(P);
		}
	public static void imprime(Punto[] P) {
		for(int i=0; i<P.length; i++){
			System.out.println("Punto[" + i + "]=" +" "+ "(" + P[i].LeeX() + "," +  P[i].LeeYe() + ")");
	}
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR