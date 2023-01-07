package Herencia;
//SE PIDEN N PRODUCTOS CON SUS DATOS, SE IMPRIMEN SUS DATOS ORDENADOS, Y SE IMPRIME LA CANTIDAD DE ART�CULOS CON MENOS DE UNA PIEZA EN EXISTENCIA
public class LeyExpress {

	public static void main(String[] args) {
		System.out.print("�CU�NTOS ART�CULOS VAS A GUARDAR?: ");
		int N = Leer.datoInt();
		Inventario[] inventario = new Inventario[N];
		
		PedirDatos(inventario);
		ActualizarExistencia(inventario);
		String salida = MenorA10(inventario);
		System.out.println(salida);
	}
	
	//SE PIDEN LOS DATOS
	public static void PedirDatos(Inventario[] inventario) {
		System.out.println("CAPTURA DE DATOS");
		for(int a=0; a<inventario.length; a++) {
			System.out.print("CLAVE DEL ART�CULO " + (a+1) + ": ");
			int clave = Leer.datoInt();
			System.out.print("NOMBRE DEL ART�CULO: ");
			String nombre = Leer.dato();
			System.out.print("�CU�NTOS HAB�A AL INICIO?: ");
			int exis = Leer.datoInt();
			System.out.print("�CU�L ES EL PRECIO POR PIEZA?: ");
			double precio = Leer.datoDouble();
			System.out.print("�CU�NTOS COMPRASTE?: ");
			int compr = Leer.datoInt();
			System.out.print("�CU�NTOS VENDISTE?: ");
			int vend = Leer.datoInt();
			
			inventario[a] = new Inventario(clave, nombre, exis, precio, compr, vend);
			System.out.println();
		}
	}
	
	//SE IMPRIMEN LOS DATOS DE LOS PRODUCTOS EN LISTA
	public static void ActualizarExistencia(Inventario[] inventario) {
		int total=0;
		for(int b=0; b<inventario.length; b++) {
			total = inventario[b].getExis() - inventario[b].getCant_vend() + inventario[b].getCant_compr();
			System.out.println((b+1) + "- " + inventario[b].getDescr() + ".   EXISTENCIA ORIGINAL: " + inventario[b].getExis() + " PIEZAS" + 
					".   CANTIDAD COMPRADA: " + inventario[b].getCant_compr() + " PIEZAS.   CANTIDAD VENDIDA: " + inventario[b].getCant_vend() + " PIEZAS.   NUEVA EXISTENCIA: " + total + " PIEZAS");
		}
	}
	
	//SE IMPRIME LA CANTIDAD DE ART�CULOS CON MENOS DE UNA PIEZA EN EXISTENCIA
	public static String MenorA10(Inventario[] inventario) {
		String respuesta="";
		int acumulador=0;
		for(int c=0; c<inventario.length; c++) {
			if((inventario[c].getExis() - inventario[c].getCant_vend() + inventario[c].getCant_compr())<10) {
				acumulador++;
			}
		}
		System.out.println();
		if(acumulador==0) {
			System.out.println("NO HAY ART�CULOS CON EXISTENCIA MENOR A 10");
		}
		if(acumulador==1) {
			respuesta = "HAY 1 ART�CULO CON EXISTENCIA MENOR A 10";
		}
		if(acumulador>1) {
			respuesta = "HAY " + acumulador + " ART�CULOS CON EXISTENCIA MENOR A 10";
		}
		return respuesta;
	}
}