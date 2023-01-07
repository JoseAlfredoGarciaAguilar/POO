package POO;
//PROGRAMA QUE GENERA NÚMEROS ALEATOROIOS DE 0 A 70 E IMPRIME APARTE LOS QUE SON MENORES DE 30
public class VectoresRandom2 {

	public static void main(String[] args) {
		System.out.print("Introduce un tamaño: ");
		int N = Leer.datoInt();
		int M30[] = new int[N];
		int Arre[] = new int[N];
		Rellena(Arre);
		System.out.println("NÚMEROS ALEATORIOS: ");
		Imprime(Arre);
		Menos30(Arre, M30);
		System.out.println("NÚMEROS MENORES DE 30: ");
		Imprime(M30);
	}
	public static void Rellena(int[] V) {
		for(int k=0; k<V.length; k++) {
			do{
				V[k] = (int)(Math.random()*70);
			}while(V[k]<20);
		}
	}
	public static void Menos30(int[] V, int[] M) {
		int p=0;
		for(int k=0; k<V.length; k++) {
			if(V[k]<30) {
				M[p] = V[k];
				p++;
			}
		}
	}
	public static void Imprime(int[] V) {
		for(int k=0; k<V.length; k++) {
			if(V[k]==0)
				break;
				System.out.println(V[k]);
			}
		}
	}