package POO;

public class ObjetosAlumnos {

	public static void main(String[] args) {
		System.out.println("¿CUÁNTOS ALUMNOS SON?: ");
		int N = Leer.datoInt();
		Alumno[] Alu = new Alumno[N];
		Alumno A = new Alumno();
		for(int j=0; j<N; j++){
			Alu[j] = Captura(A);
		}
		Mostrar(Alu);
		Actualiza(Alu);
		System.out.println("LISTADO DE PROMEDIOS DE SISTEMAS");
		PorCarrera(Alu, 1);
		System.out.println("LISTADO DE ALUMNOS DE TICS");
		PorCarrera(Alu, 2);
	}
	public static Alumno Captura(Alumno A) {
		String Nom="";
		String NC="";
		int C=0; double Ca1=80; double Ca2=93; double Ca3=86; double Ca4=98;
		System.out.println("NOMBRE DEL ALUMNO: ");
		Nom = Leer.dato();
		System.out.println("NUM. DE CONTROL DEL ALUMNO: ");
		NC = Leer.dato();
		System.out.println("CALIFICACIÓN 1 DEL ALUMNO: ");
		Ca1 = Leer.datoDouble();
		System.out.println("CALIFICACIÓN 2 DEL ALUMNO: ");
		Ca1 = Leer.datoDouble();
		System.out.println("CALIFICACIÓN 3 DEL ALUMNO: ");
		Ca1 = Leer.datoDouble();
		System.out.println("CALIFICACIÓN 4 DEL ALUMNO: ");
		Ca1 = Leer.datoDouble();
		
		A = new Alumno(NC, Nom, 0, Ca1, Ca2, Ca3, Ca4);
		return A;
	}
	public static void Mostrar(Alumno[] A){
		for(int j=0; j<A.length; j++){
			System.out.println(A[j].getNombres() + "\t" + A[j].getPromedio());
		}
	}
	public static void PorCarrera(Alumno[] A, int C){
		for(int j=0; j<A.length; j++){
			if(A[j].getCarrera()==C){
				System.out.println(A[j].getNombres() + "\t" + A[j].getPromedio());
			}
		}
	}
	public static void Actualiza(Alumno[] A){
		for(int j=0; j<A.length; j++){
			System.out.println("EL PROMEDIO DE " + A[j].getNombres() + " ES " + A[j].ActualizaProm()());
		}
	}
}