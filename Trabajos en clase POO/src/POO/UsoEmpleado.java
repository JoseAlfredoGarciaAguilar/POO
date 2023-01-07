package POO;

public class UsoEmpleado {

	public static void main(String[] args) {
		System.out.print("¿CUÁNTOS EMPLEADOS TIENE LA EMPRESA?: ");
		int numero_empleados = Leer.datoInt();
		Empleado[] E = new Empleado[numero_empleados];
		
		String nombre="";
		int edad=0;
		double peso=0;
		System.out.println();
		System.out.print("INGRESA LOS DATOS DE " + numero_empleados + " EMPLEADOS: ");
		System.out.println();
		for(int j=0; j<numero_empleados; j++) {
			System.out.println();
			System.out.print("NOMBRE " + (j+1) + ": ");
			nombre = Leer.dato();
			System.out.print("EDAD " + (j+1) + ": ");
			edad = Leer.datoInt();
			System.out.print("PESO " + (j+1) + ": ");
			peso = Leer.datoDouble();
			E[j] = new Empleado(nombre, edad, peso);
		}
		
		System.out.println();
		System.out.println("LISTADO DE EMPLEADOS DE POLUX CLICK");
		ImprimeDatos(E);
		System.out.println();
		System.out.println("PROMEDIO DE EDAD DE LOS EMPLEADOS: ");
		System.out.println(PromedioEdad(E) + " AÑOS");
		System.out.println();
		System.out.println("EMPLEADOS CON PESO MAYOR A 70 KGS: ");
		MayorA70(E);
	}
	
	//IMPRIME EL PROMEDIO DE LAS EDADES DE LOS EMPLEADOS
	public static double PromedioEdad(Empleado[] E) {
		int N = E.length;
		double promedio=0, suma=0;
		for(int j=0; j<E.length; j++){
			suma = suma + E[j].getEdad();
		}
		promedio = suma / N;
		return promedio;
	}
	
	//IMPRIME LOS NOMBRES DE LOS EMPLEADOS QUE PESAN MÁS DE 70 KILOS
	public static void MayorA70(Empleado[] arreglo) {
		int m=0;
		for(int a=0; a<arreglo.length; a++) {
			if(arreglo[a].getPeso()>70) {
				System.out.println(arreglo[a].getNombre());
			m++;
			}
		}
		if(m==0)
			System.out.println("NINGÚN EMPLEADO PESA MÁS DE 70 KGS");
	}
	
	//IMPRIME LOS DATOS DE EMPLEADO INGRESADO
	public static void ImprimeDatos(Empleado[] arreglo) {
		for(int j=0; j<arreglo.length; j++) {
			System.out.println(arreglo[j].getNombre() + " TIENE " + arreglo[j].getEdad() + " AÑOS DE EDAD, Y PESA " + arreglo[j].getPeso() + " KG");
		}
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR