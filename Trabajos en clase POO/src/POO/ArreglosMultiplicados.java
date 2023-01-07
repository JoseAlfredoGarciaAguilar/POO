package POO;

public class ArreglosMultiplicados {

	public static void main(String[] args) {
		System.out.print("Escribe el tamaño del arreglo: ");
		int tamaño = Leer.datoInt();
		int arre1[] = new int[tamaño];
		int arre2[];
		
		numerosaleatorios(arre1, 10, 100);
		arre2 = arre1;
		arre1 = new int[tamaño];
		numerosaleatorios(arre1, 10, 100);
		
		int[] arre3 = multiplicararreglos(arre1, arre2);
		
		System.out.println("Arreglo 1: ");
		imprimirarreglo(arre1);
		System.out.println("Arreglo 2: ");
		imprimirarreglo(arre2);
		System.out.println("Arreglo 3: ");
		imprimirarreglo(arre3);
	}
	private static void numerosaleatorios(int[] aleatorio, int x, int y) {
		for(int i=0; i<aleatorio.length; i++) {
			aleatorio[i] = (int)(Math.random()*(x-y)+y);
		}
		
	}
	private static void imprimirarreglo(int[] aleatorio) {
		for(int i=0; i<aleatorio.length; i++) {
			System.out.println(aleatorio[i]);
		}
	}
	private static int[] multiplicararreglos(int[] elemento1, int[] elemento2) {
		int[] elemento3 = new int[elemento1.length];
		for(int i=0; i<elemento1.length; i++) {
			elemento3[i] = elemento1[i] * elemento2[i];
		}
		return elemento3;
	}
	}