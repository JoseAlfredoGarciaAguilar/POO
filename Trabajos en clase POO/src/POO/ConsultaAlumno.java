package POO;

public class ConsultaAlumno {
private static int numerodealumnos;
static int [] arreglo = new int[numerodealumnos];

	public static void main(String[] args) {
		Alumno Alu = new Alumno();
		System.out.print("¿CUÁNTOS ALUMNOS QUIERES INGRESAR?: ");
		int numerodealumnos = Leer.datoInt();
		for(int i=1; i<=numerodealumnos; i++) {
		Alumno[] Al = new Alumno[numerodealumnos];
		String Nom="", Ape="", NC="";
		int Prom=0;
		System.out.print("INGRESA NOMBRE DEL ALUMNO " + i + ": ");
		Nom=Leer.dato();
		System.out.print("INGRESA APELLIDO DEL ALUMNO " + i + ": ");
		Ape=Leer.dato();
		System.out.print("INGRESA NÚMERO DE CONTROL DEL ALUMNO " + i + ": ");
		NC=Leer.dato();
		System.out.print("INGRESA PROMEDIO DEL ALUMNO " + i + ": ");
		Prom = Leer.datoInt();
		Alu = new Alumno(Nom, Ape, NC, Prom);
		Al[i]=Alu;
		
		imprime(Al);
	}
		}
		private static void imprime(Alumno[] A) {
			for(int k=0; k<A.length; k++) {
				System.out.println("El alumno " + A[k].getNombres() + " tiene promedio de " + A[k].getPromedio());
			}
			
		}
	}
//JOSÉ ALFREDO GARCÍA AGUILAR