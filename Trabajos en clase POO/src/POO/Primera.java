package POO;
import java.util.Scanner;
//PROGRAMA QUE SUMA N N�MEROS
public class Primera {

	public static void main(String[] args) {
		int suma=0, num=0, cuantos=0;
		System.out.print("�CU�NTOS N�MEROS VAS A SUMAR?: ");
		cuantos = Leer.datoInt();
		System.out.println("ESTE PROGRAMA SUMAR� " + cuantos + " N�MEROS");
		System.out.println();
		for(int N=1; N<=cuantos; N++) {
			System.out.print("INGRESA EL VALOR ENTERO " + N + ": ");
			num = Leer.datoInt();
			suma = suma+num;
		}
		System.out.println();
		System.out.println("SUMA=" + suma);
	}
}