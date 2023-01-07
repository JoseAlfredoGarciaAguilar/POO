package POO;
//PROGRAMA QUE AL INGRESAR 2 DATOS DE PERSONAS, LOS IMPRIME ORDENADOS JUNTO CON UN DNI GENERADO
//ADEMÁS, IMPRIME SI ESTÁN DEBAJO DEL PESO NORMAL, PESO IDEAL O SOBREPESO, Y SI LAS PERSONAS SON MENORES O MAYORES DE EDAD
public class UsoPersonalProyecto {

	public static void main(String[] args){
		PersonalProyecto objeto1 = new PersonalProyecto();
		PersonalProyecto objeto2 = new PersonalProyecto();
		PersonalProyecto objeto3 = new PersonalProyecto();
		String DNI1 = objeto1.generaDNI();
		String DNI2 = objeto2.generaDNI();
		String DNI3 = objeto3.generaDNI();
		
		//SE PIDEN LOS DATOS DE LA PRIMERA PERSONA
		System.out.print("NOMBRE: ");
		String Nombre1 = Leer.dato();
		System.out.print("EDAD: ");
		int Edad1 = Leer.datoInt();
		System.out.print("PESO EN KG: ");
		double Peso1 = Leer.datoDouble();
		System.out.print("SEXO  H=HOMBRE   M=MUJER: ");
		char Sexo1 = Leer.datocar();
		System.out.print("ALTURA EN METROS: ");
		double Altura1 = Leer.datoDouble();
		
		objeto1 = new PersonalProyecto(Nombre1, Edad1, Peso1, Sexo1, Altura1);
		
		//SE PIDEN LOS DATOS DE LA SEGUNDA PERSONA
		System.out.println();
		System.out.print("NOMBRE: ");
		String Nombre2 = Leer.dato();
		System.out.print("EDAD: ");
		int Edad2 = Leer.datoInt();
		System.out.print("SEXO  H=HOMBRE   M=MUJER: ");
		char Sexo2 = Leer.datocar();
		
		objeto2 = new PersonalProyecto(Nombre2, Edad2, Sexo2);
		
		//MUESTRA LOS DATOS DE CADA PERSONA
		System.out.println();
		System.out.println("DNI: " + DNI1 + objeto1.toString());
		if(objeto1.calcularIMC()==-1){
			System.out.println(Nombre1 + " ESTÁ POR DEBAJO DEL PESO");
		}
		if(objeto1.calcularIMC()==0){
			System.out.println(Nombre1 + " ESTÁ EN SU PESO IDEAL");
		}
		if(objeto1.calcularIMC()==1) {
			System.out.println(Nombre1 + " ESTÁ EN SOBREPESO");
		}
		
		if(objeto1.esMayorDeEdad()){
			System.out.println(Nombre1 + " ES MAYOR DE EDAD");
		}
		else{
			System.out.println(Nombre1 + " ES MENOR DE EDAD");
		}
		
		System.out.println();
		System.out.println("DNI: " + DNI2 + objeto2.toString());
		if(objeto2.calcularIMC()==-1){
			System.out.println(Nombre2 + " ESTÁ POR DEBAJO DEL PESO");
		}
		if(objeto2.calcularIMC()==0){
			System.out.println(Nombre2 + " ESTÁ EN SU PESO IDEAL");
		}
		if(objeto2.calcularIMC()==1) {
			System.out.println(Nombre2 + " ESTÁ EN SOBREPESO");
		}
		
		if(objeto2.esMayorDeEdad()){
			System.out.println(Nombre2 + " ES MAYOR DE EDAD");
		}
		else{
			System.out.println(Nombre2 + " ES MENOR DE EDAD");
		}
		
		System.out.println();
		System.out.println("DNI: " + DNI3 + objeto3.toString());
		if(objeto3.calcularIMC()==-1){
			System.out.println("ESTÁ POR DEBAJO DEL PESO");
		}
		if(objeto3.calcularIMC()==0){
			System.out.println("ESTÁ EN SU PESO IDEAL");
		}
		if(objeto3.calcularIMC()==1) {
			System.out.println("ESTÁ EN SOBREPESO");
		}
		
		if(objeto3.esMayorDeEdad()){
			System.out.println("ES MAYOR DE EDAD");
		}
		else{
			System.out.println("ES MENOR DE EDAD");
		}
		
		String Nom="";
		int Ed=0;
		char Sex=' ';
		double Pe=0;
		double Al=0;
		objeto3.setNombre(Nom);
		objeto3.setEdad(Ed);
		objeto3.setSexo(Sex);
		objeto3.setPeso(Pe);
		objeto3.setAltura(Al);
	}	
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM
//PROGRAMACIÓN ORIENTADA A OBJETOS
//MAESTRO: LUIS ESTEBAN LÓPEZ MENDOZA