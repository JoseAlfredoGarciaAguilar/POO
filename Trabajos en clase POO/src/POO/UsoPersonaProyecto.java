package POO;
//PROGRAMA QUE AL INGRESAR 10 NOMBRES, EDADES Y SEXOS, IMPRIME EL NÚMERO DE HOMBRES Y MUJERES, EL NOMBRE DE LA PERSONA DE MAYOR EDAD Y EL PROMEDIO DE TODAS LAS EDADES
public class UsoPersonaProyecto {

	public static void main(String[] args) {
		PersonaProyecto[] arreglo = new PersonaProyecto[10];
		CapturarDatos(arreglo);
		HombresYMujeres(arreglo);
		MayorEdad(arreglo);
		PromedioEdades(arreglo);
	}

	//GUARDA LOS DATOS DE LAS 10 PERSONAS
	public static void CapturarDatos(PersonaProyecto[] arreglo) {
		int Sexo=0;
		System.out.println("-LLENADO DE LOS DATOS-");
		System.out.println();
		System.out.println("SE REGISTRARÁN 10 PERSONAS: ");
		for(int i=0; i<arreglo.length; i++){
			System.out.println();
			System.out.print("NOMBRE " + (i+1) + ": ");
			String Nombre = Leer.dato();
			System.out.print("EDAD " + (i+1) + ": ");
			int Edad = Leer.datoInt();
			System.out.print("SEXO " + (i+1) + ":   1=HOMBRE   2=MUJER: ");
			Sexo = Leer.datoInt();
			arreglo[i] = new PersonaProyecto(Nombre, Edad, Sexo);
		}
	}
	
	//MUESTRA EL NÚMERO DE HOMBRES Y DE MUJERES
	public static void HombresYMujeres(PersonaProyecto[] arreglo) {
		int Hombre=0;
		int Mujer=0;
		for(int a=0; a<arreglo.length; a++){
			if(arreglo[a].getSexo() == 1){
				Hombre++;
			}
			else if(arreglo[a].getSexo() == 2){
				Mujer++;
			}
		}
		System.out.println();
		System.out.println("-MUESTRA DE LOS DATOS-");
		System.out.println();
		System.out.println("NÚMERO DE HOMBRES Y MUJERES");
		System.out.println("HOMBRES: " + Hombre);
		System.out.println("MUJERES: " + Mujer);
	}
	
	//MUESTRA EL NOMBRE DE LA PERSONA DE MAYOR EDAD
	public static void MayorEdad(PersonaProyecto[] arreglo){
		int EdadMayor=0;
		String PersonaMayor = "";
		for(int b=0; b<arreglo.length; b++) {
			if(arreglo[b].getEdad() > EdadMayor) {
				EdadMayor = arreglo[b].getEdad();
				PersonaMayor = arreglo[b].getNombre();
			}
		}
		System.out.println();
		System.out.println("PERSONA MAYOR");
		System.out.println(PersonaMayor + " CON " + EdadMayor + " AÑOS DE EDAD");
	}
	
	//MUESTRA EL PROMEDIO DE TODAS LAS EDADES
	public static void PromedioEdades(PersonaProyecto[] arreglo) {
		double Suma=0, Promedio=0;
		for(int c=0; c<arreglo.length; c++) {
			Suma = Suma + arreglo[c].getEdad();
			Promedio = Suma / 10;
		}
		System.out.println();
		System.out.println("PROMEDIO DE LAS EDADES");
		System.out.println(Promedio + " AÑOS");
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//PROYECTO
//CLASE 4-5 PM
//MAESTRO LUIS ESTEBAN LÓPEZ MENDOZA