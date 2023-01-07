package Herencia;
//PROGRAMA QUE IMPRIME PRECIOS POR SEPARADO DE DIFERENTES PRODUCTOS, CALCULA LAS SUMAS DE CADA TIPO POR SEPARADO,
//Y AL FINAL LA SUMA DE TODOS JUNTOS
public class UsoElectrodoméstico {

	public static void main(String[] args) {
		System.out.println("ELECTRODOMÉSTICOS");
		System.out.println();
		int suma_tele=0, suma_lava=0, suma_electro=0, suma_final=0;
		Electrodoméstico[] electro = new Electrodoméstico[5];
		Televisión tele = new Televisión();
		Lavadora lava = new Lavadora();
		//SE LES ASIGNAN VALORES A LOS ELECTRODOMÉSTICOS
		electro[0] = new Televisión(300,32);
		electro[1] = new Lavadora(380,22);
		electro[2] = new Electrodoméstico(500, "AZUL", 'C',18);
		electro[3] = new Televisión(40, true);
		electro[4] = new Lavadora(800,18);
		
		//SE UTILIZAN LOS MÉTODOS
		for(int a=0; a<electro.length; a++){
			electro[a].ComprobarConsumoEnergético();
			electro[a].PrecioFinal();
		}
		
		//IMPRIME LOS PRECIOS FINALES DE TODOS LOS ELECTRODOMÉSTICOS POR SEPARADO
		System.out.println("PRODUCTOS POR SEPARADO");
		for(int b=0; b<electro.length; b++){
			if(electro[b] instanceof Televisión){
				suma_tele+=electro[b].PrecioFinal();
				System.out.println("TELEVISIÓN: $" + electro[b].getPrecio());
			}
			if(electro[b] instanceof Lavadora){
				suma_lava+=electro[b].PrecioFinal();
				System.out.println("LAVADORA: $" + electro[b].getPrecio());
			}
			if(electro[b] instanceof Electrodoméstico){
				suma_electro+=electro[b].PrecioFinal();
				System.out.println("ELECTRODOMÉSTICO: $" + electro[b].getPrecio());
			}
		}
		
		//SE IMPRIMEN LOS DATOS
		System.out.println();
		System.out.println("SUMAS");
		System.out.println("SUMA TELEVISIONES: $" + suma_tele);
		System.out.println("SUMA LAVADORAS: $" + suma_lava);
		System.out.println("SUMA ELECTRODOMÉSTICOS: $" + suma_electro);
		
		//SE CALCULA LA SUMA FINAL DE TODOS LOS ELECTRODOMÉSTICOS
		for(int c=0; c<electro.length; c++) {
			suma_final = suma_tele + suma_lava + suma_electro;
		}
		
		//SE CALCULA LA SUMA FINAL DE TODOS LOS ELECTRODOMÉSTICOS
		System.out.println("SUMA FINAL DE TODOS LOS ELECTRODOMÉSTICOS CON SU PRECIO FINAL: $" + suma_final);
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM