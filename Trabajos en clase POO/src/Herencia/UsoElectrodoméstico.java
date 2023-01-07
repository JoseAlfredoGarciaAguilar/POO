package Herencia;
//PROGRAMA QUE IMPRIME PRECIOS POR SEPARADO DE DIFERENTES PRODUCTOS, CALCULA LAS SUMAS DE CADA TIPO POR SEPARADO,
//Y AL FINAL LA SUMA DE TODOS JUNTOS
public class UsoElectrodom�stico {

	public static void main(String[] args) {
		System.out.println("ELECTRODOM�STICOS");
		System.out.println();
		int suma_tele=0, suma_lava=0, suma_electro=0, suma_final=0;
		Electrodom�stico[] electro = new Electrodom�stico[5];
		Televisi�n tele = new Televisi�n();
		Lavadora lava = new Lavadora();
		//SE LES ASIGNAN VALORES A LOS ELECTRODOM�STICOS
		electro[0] = new Televisi�n(300,32);
		electro[1] = new Lavadora(380,22);
		electro[2] = new Electrodom�stico(500, "AZUL", 'C',18);
		electro[3] = new Televisi�n(40, true);
		electro[4] = new Lavadora(800,18);
		
		//SE UTILIZAN LOS M�TODOS
		for(int a=0; a<electro.length; a++){
			electro[a].ComprobarConsumoEnerg�tico();
			electro[a].PrecioFinal();
		}
		
		//IMPRIME LOS PRECIOS FINALES DE TODOS LOS ELECTRODOM�STICOS POR SEPARADO
		System.out.println("PRODUCTOS POR SEPARADO");
		for(int b=0; b<electro.length; b++){
			if(electro[b] instanceof Televisi�n){
				suma_tele+=electro[b].PrecioFinal();
				System.out.println("TELEVISI�N: $" + electro[b].getPrecio());
			}
			if(electro[b] instanceof Lavadora){
				suma_lava+=electro[b].PrecioFinal();
				System.out.println("LAVADORA: $" + electro[b].getPrecio());
			}
			if(electro[b] instanceof Electrodom�stico){
				suma_electro+=electro[b].PrecioFinal();
				System.out.println("ELECTRODOM�STICO: $" + electro[b].getPrecio());
			}
		}
		
		//SE IMPRIMEN LOS DATOS
		System.out.println();
		System.out.println("SUMAS");
		System.out.println("SUMA TELEVISIONES: $" + suma_tele);
		System.out.println("SUMA LAVADORAS: $" + suma_lava);
		System.out.println("SUMA ELECTRODOM�STICOS: $" + suma_electro);
		
		//SE CALCULA LA SUMA FINAL DE TODOS LOS ELECTRODOM�STICOS
		for(int c=0; c<electro.length; c++) {
			suma_final = suma_tele + suma_lava + suma_electro;
		}
		
		//SE CALCULA LA SUMA FINAL DE TODOS LOS ELECTRODOM�STICOS
		System.out.println("SUMA FINAL DE TODOS LOS ELECTRODOM�STICOS CON SU PRECIO FINAL: $" + suma_final);
	}
}
//JOS� ALFREDO GARC�A AGUILAR
//CLASE 4-5 PM