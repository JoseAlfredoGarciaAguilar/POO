package POO;

public class UsoTienda {

	public static void main(String[] args) {
		Tienda[] arreglo = new Tienda[12];
		
		MasDulces(arreglo);
		PromedioBebidas(arreglo);
		MenosLacteos(arreglo);
		MenosAgosto(arreglo);
	}
	
	//IMPRIME EL TOTAL Y EL NOMBRE DEL MES DONDE SE VENDIERON MÁS DULCES
	public static void MasDulces(Tienda[] arreglo) {
		int Mayor=0, Mes=0;
		for(int a=0; a<arreglo.length; a++) {
			if(arreglo[a].getTotalDulces() > Mayor) {
				Mes=a+1;
			}
		}
		System.out.println(Mes);
	}
	
	//IMPRIME EL PROMEDIO ANUAL DE VENTA DE BEBIDAS
	public static int PromedioBebidas(Tienda[] arreglo) {
		int Suma=0, Promedio=0;
		for(int b=0; b<arreglo.length; b++) {
			Suma+=arreglo[b].getTotalBebidas();
		}
		Promedio=Suma/12;
		System.out.print("PROMEDIO ANUAL DE VENTA DE BEBIDAS: " + Promedio);
		return Promedio;
	}
	
	//IMPRIME EL TOTAL Y EL NOMBRE DEL MÉS DONDE SE VENDIERON MENOS LÁCTEOS
	public static void MenosLacteos(Tienda[] arreglo) {
		int Menor=arreglo[0].getTotalLacteos(), Mes=0;
		for(int c=0; c<arreglo.length; c++) {
			if(arreglo[c].getTotalLacteos() < Menor) {
				Menor = arreglo[c].getTotalLacteos();
				Mes = c+1;
			}
		}
		System.out.println("LA MAYOR VENTA DE DULCES FUE DE " + Menor + " EN EL MES " + Mes);
	}
	
	//IMPRIME EL NOMBRE DEL DEPARTAMENTO QUE VENDIÓ MENOS EN AGOSTO
	public static void MenosAgosto(Tienda[] arreglo) {
		int Menor=0, Dulces=0, Lacteos=0, Bebidas=0, Abarrotes=0;
		String Departamento="";
		
		Dulces = arreglo[7].getTotalDulces();
		Abarrotes = arreglo[7].getTotalAbarrotes();
		Lacteos = arreglo[7].getTotalLacteos();
		Bebidas = arreglo[7].getTotalBebidas();
		
		if(Dulces < Menor) {
			Menor = Dulces;
			Departamento = "DULCES";
		}
		
		if(Bebidas < Menor) {
			Menor = Bebidas;
			Departamento = "BEBIDAS";
		}
		
		if(Abarrotes < Menor) {
			Menor = Abarrotes;
			Departamento = "ABARROTES";
		}
		
		if(Lacteos < Menor) {
			Menor = Lacteos;
			Departamento = "LACTEOS";
		}
		System.out.println("LA MAYOR VENTA DE DULCES FUE DE $" + Menor + " EN EL DEPARTAMENTO DE " + Departamento);
	}
}