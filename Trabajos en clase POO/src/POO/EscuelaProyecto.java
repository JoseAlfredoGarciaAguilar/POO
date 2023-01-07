package POO;

public class EscuelaProyecto {

	public static void main(String[] args) {
		String Nombre="", Carrera="";
		int Numero_de_Control=0, Eleccion=0;
		double cali1=0, cali2=0, cali3=0, cali4=0, Promedio=0;
		
		System.out.print("INGRESA LA CANTIDAD DE ALUMNOS: ");
		int numero_de_alumnos = Leer.datoInt();
		System.out.println("SE REGISTRARÁN " + numero_de_alumnos + " ALUMNOS");
		AlumnoProyecto[] arreglo = new AlumnoProyecto[numero_de_alumnos];

		CapturaDeDatos(arreglo, numero_de_alumnos, Nombre, Carrera, Numero_de_Control, Eleccion, cali1, cali2, cali3, cali4, Promedio);
		CalcularPromedios(arreglo, cali1, cali2, cali3, cali4, Promedio);
		ImprimirAlumnosYPromedios(arreglo);
	}
	
	//CAPTURA LOS DATOS DE TODOS LOS ALUMNOS
	public static void CapturaDeDatos(AlumnoProyecto[] arreglo, int numero_de_alumnos, String Nombre, String Carrera,
			int Numero_de_Control, int Eleccion, double cali1, double cali2, double cali3, double cali4, double Promedio) {
		for(int a=0; a<numero_de_alumnos; a++) {
			System.out.println();
			System.out.print("NOMBRE " + (a+1) + ": ");
			Nombre = Leer.dato();
			System.out.print("NÚMERO DE CONTROL DE " + Nombre + ": ");
			Numero_de_Control = Leer.datoInt();
			System.out.print("¿LA CARRERA DE " + Nombre + " ES SISTEMAS=1, TIC=2?: ");
			Eleccion = Leer.datoInt();
			
			if(Eleccion==1) {
				Carrera = "SISTEMAS";
			}
			else if(Eleccion==2) {
				Carrera = "TICS";
			}
			else {
				System.out.println("ERROR. NO EXISTE ESA CARRERA EN ESTE MENÚ");
				break;
			}
			
			//PIDE LAS 4 CALIFICACIONES DE CADA ALUMNO
			System.out.print("CALIFICACIÓN 1 DE " + Nombre + ": ");
			cali1 = Leer.datoDouble();
			System.out.print("CALIFICACIÓN 2 DE " + Nombre + ": ");
			cali2 = Leer.datoDouble();
			System.out.print("CALIFICACIÓN 3 DE " + Nombre + ": ");
			cali3 = Leer.datoDouble();
			System.out.print("CALIFICACIÓN 4 DE " + Nombre + ": ");
			cali4 = Leer.datoDouble();
			
			arreglo[a] = new AlumnoProyecto(Nombre, Numero_de_Control, Eleccion, a, cali1, cali2, cali3, cali4, cali4);
		}
	}
	
	//CALCULA EL PROMEDIO DE CADA ALUMNO
	public static void CalcularPromedios(AlumnoProyecto[] arreglo, double cali1, double cali2, double cali3, double cali4, double Promedio) {
		for(int e=0; e<arreglo.length; e++) {
			double suma = arreglo[e].getCali1() + arreglo[e].getCali2() + arreglo[e].getCali3() + arreglo[e].getCali4();
			Promedio = suma / 4;
			arreglo[e].setPromedio(Promedio);
		}
	}
		
	//IMPRIME LA CARRERA QUE CURSA CADA ALUMNO Y SU PROMEDIO
	public static void ImprimirAlumnosYPromedios(AlumnoProyecto[] arreglo) {
		System.out.println();
		System.out.print("ELIGE LA CARRERA PARA IMPRIMIR SUS DATOS: SISTEMAS=1, TIC=2: ");
		int Opcion = Leer.datoInt();
		for(int c=0; c<arreglo.length; c++) {
			if(arreglo[c].getCarrera() == Opcion) {
				System.out.println(arreglo[c].getNombre() + " OBTUVO DE PROMEDIO " + arreglo[c].getPromedio());
			}
			else if(arreglo[c].getCarrera() == Opcion) {
				System.out.println(arreglo[c].getNombre() + " OBTUVO DE PROMEDIO " + arreglo[c].getPromedio());
				}
			}
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//PROYECTO 1
//PROGRAMACIÓN ORIENTADA A OBJETOS
//MAESTRO LUIS ESTEBAN LÓPEZ MENDOZA