package POO;
//Programa que pide N elementos con valores entre 20 y 70, donde después copia los números menores a 30, los que están entre 40 y 50, los que
//son mayores de 50, y luego suma todos los mayores de 50
public class VectoresRandom {

	public static void main(String[] args) {
		System.out.print("¿Cuántos elementos tendrá?: ");
		int numero_de_elementos = Leer.datoInt();
		int[] vector1 = new int[numero_de_elementos];
		int x=0, y=0;
		for(int i=0; i<numero_de_elementos; i++) {
			int numeros_aleatorios = (int)(Math.random()*(x-y)+y);
		}
		numerosentre20y70(vector1, 20, 70);
		numerosmenoresque30(vector1, 20, 30);
		numerosentre40y50(vector1, 40, 50);
		numerosmayoresque50(vector1, 50);
	}
	public static void numerosmayoresque50(int[] masde50, int y) {
		//muestra mayores de 50 y los suma
		int totalsuma=0;
		System.out.println("Números mayores que 50: ");
		for(int k=0; k<masde50.length; k++) {
		if(masde50[k]>50) {
			System.out.println(masde50[k]);
			totalsuma=totalsuma+masde50[k];
		}
		}
		System.out.println("Suma de los números mayores que 50: " + totalsuma);
	}
	public static void numerosentre40y50(int[] de_40_a_50, int c, int d) {
		//muestra números entre 40 y 50
		System.out.println("Números entre 40 y 50: ");
		for(int s=0; s<de_40_a_50.length; s++) {
		if(de_40_a_50[s]>=c && de_40_a_50[s]<=d) {
			System.out.println(de_40_a_50[s]);
		}
		}
	}
	public static void numerosmenoresque30(int[] de_20_a_30, int i, int j) {
		//muestra números entre 20 y 30
		System.out.println("Números menores de 30: ");
		for(int x=0; x<de_20_a_30.length; x++) {
		if(de_20_a_30[x]>=i && de_20_a_30[x]<j) {
			System.out.println(de_20_a_30[x]);
		}
		}
	}
	public static void numerosentre20y70(int[] de_20_a_70, int a, int b) {
		//muestra números entre 20 y 70
		System.out.println("Números entre 20 y 70: ");
		for(int i=0; i<de_20_a_70.length; i++) {
			de_20_a_70[i] = (int)(Math.random()*(a-b)+b);
			System.out.println(de_20_a_70[i]);
	}
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//POO