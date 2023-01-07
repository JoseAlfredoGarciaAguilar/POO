package POO;
//PROGRAMA QUE AL INGRESAR NOMBRE, EDAD Y RAZA DE 3 PERROS, MUESTRA SUS DATOS DE FORMA ORDENADA
public class UsoPerroProyecto {

	public static void main(String[] args) {
		PerroProyecto P1 = new PerroProyecto();
		PerroProyecto P2 = new PerroProyecto();
		PerroProyecto P3 = new PerroProyecto();

		System.out.println("-CAPTURA DE LOS DATOS-");
		P1 = CapturaDatos(P1);
		P2 = CapturaDatos(P2);
		P3 = CapturaDatos(P3);
		System.out.println();
		System.out.println("-MUESTRA DE LOS DATOS-");
		System.out.println();
		ImprimeDatos(P1);
		ImprimeDatos(P2);
		ImprimeDatos(P3);
	}

	//CAPTURA LOS DATOS DE LOS 3 PERROS
	public static PerroProyecto CapturaDatos(PerroProyecto P1) {
		System.out.println();
		System.out.print("NOMBRE PERRO: ");
		String Nombre = Leer.dato();
		System.out.print("EDAD PERRO: ");
		int Edad = Leer.datoInt();
		System.out.print("RAZA PERRO: ");
		String Raza = Leer.dato();
		return P1 = new PerroProyecto(Nombre, Edad, Raza);
	}
	
	//IMPRIME LOS DATOS DE LOS 3 PERROS
	public static void ImprimeDatos(PerroProyecto P1){
		System.out.println(P1.getNombre() + " TIENE " + P1.getEdad() + " AÑOS Y ES RAZA " + P1.getRaza());
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//PROYECTO
//CLASE 4-5 PM
//MAESTRO LUIS ESTEBAN LÓPEZ MENDOZA