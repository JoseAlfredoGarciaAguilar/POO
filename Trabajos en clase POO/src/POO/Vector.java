package POO;
import java.util.Scanner;
//PROGRAMA QUE PIDE N NÚMEROS, Y LUEGO LOS IMPRIME NUEVAMENTE
public class Vector {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("¿Cuántos dígitos tendrá tu arreglo?: ");
		int elementos = entrada.nextInt();
		int[] digitos = new int[elementos];
		
		System.out.println("Escribe los dígitos de tu arreglo: ");
		for(int i=0; i<elementos; i++) {
			System.out.print((i+1) + " Escribe el dígito: ");
			digitos[i] = entrada.nextInt();
		}
		vectororiginal(elementos, digitos);
		vectorinvertido(elementos, digitos);
	}

	public static void vectororiginal(int elementos, int[] digitos) {
		System.out.println(" ");
		System.out.println("Vector original: ");
		for(int i=0; i<elementos; i++) {
			System.out.println(digitos[i]);
		}
	}
	public static void vectorinvertido(int elementos, int[] digitos){
		int aux;
		System.out.println();
		System.out.println("Vector invertido: ");
		for(int i=0; i<elementos; i++) {
			aux = digitos[elementos-1];
			digitos[elementos-1] = digitos[i];
			digitos[i] = aux;
			elementos--;
			System.out.println(digitos[i]);
		}
	}
}