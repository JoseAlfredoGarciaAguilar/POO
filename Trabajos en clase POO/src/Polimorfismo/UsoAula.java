package Polimorfismo;
import POO.Leer;
//SE PIDEN DATOS DEL AULA, DE LOS ALUMNOS Y DEL PROFESOR, Y EN BASE A ELLOS SE MUESTRA SI HABRÁ O NO HABRÁ CLASE
//SOLO SI HAY CLASE, IMPRIME EL PORCENTAJE DE ASISTENCIA, Y EL PORCENTAJE, NÚMERO, Y LISTA DE APROBADOS (HOMBRES Y MUJERES)
//LAS ASISTENCIAS DE LOS ESTUDIANTES Y PROFESORES SE GENERAN ALEATORIAMENTE
public class UsoAula {

	public static void main(String[] args) {
		int materia_aula=0, cap_max=0, num_alu=0;
		//SOLO UN AULA
		Aula[] aul = new Aula[1];
		
		//SE PIDEN LOS DATOS DEL AULA
		System.out.println("-CAPTURA DEL AULA-");
		
		//GENERA UN NÚMERO ALEATORIO DE AULA DEL AL 20
		int num_aula = (int) (Math.random()*20);
		System.out.println("AULA " + num_aula);
		
		//SE VALIDA QUE NO SE INGRESE UNA CAPACIDAD IGUAL A 0
		do{
			System.out.print("¿CUÁL ES LA CAPACIDAD MÁXIMA PARA UN GRUPO?: ");
			cap_max = Leer.datoInt();
			if(cap_max==0){
				System.out.println("NO PUEDE HABER 0 ALUMNOS...");
			}
			else if(cap_max==1){
				System.out.println("AULA PARA 1 ALUMNO");
			}
			else{
				System.out.println("AULA PARA " + cap_max + " ALUMNOS");
			}
		}while(cap_max==0);
		
		//SE VALIDA QUE SE INGRESE UNA MATERIA 1, 2 O 3
		do{
			System.out.print("¿QUÉ MATERIA HAY EN EL AULA " + num_aula + "?:   1-MATEMÁTICAS   2-PROGRAMACIÓN   3-CONTABILIDAD: ");
			materia_aula = Leer.datoInt();
			if(materia_aula==1){
				System.out.println("AULA DE MATEMÁTICAS");
			}
			else if(materia_aula==2){
				System.out.println("AULA DE PROGRAMACIÓN");
			}
			else if(materia_aula==3){
				System.out.println("AULA DE CONTABILIDAD");
			}
			else{
				System.out.println("MATERIA INEXISTENTE...");
			}
		}while(materia_aula<1||materia_aula>3);
		
		//SE VALIDA QUE SE INGRESE UN NÚMERO DE ALUMNOS ENTRE 1 Y LA CAPACIDAD INGRESADA
		do{
			System.out.print("¿CUÁNTOS ALUMNOS HAY EN EL GRUPO " + num_aula + "?: (1-" + cap_max + "): ");
			num_alu = Leer.datoInt();
			if(num_alu==0) {
				System.out.println("NO PUEDE HABER 0 ALUMNOS");
			}
			if(num_alu<=cap_max&&num_alu==1){
				System.out.println("HAY 1 ALUMNO");
			}
			else if(num_alu<=cap_max&&num_alu>1){
				System.out.println("HAY " + num_alu + " ALUMNOS");
			}
			if(num_alu>cap_max) {
				System.out.println("LÍMITE EXCEDIDO...");
			}
		}while(num_alu<1||num_alu>cap_max);
		
		//SE GUARDAN LOS DATOS
		aul[0] = new Aula(num_aula, cap_max, materia_aula);
		
		//SE GUARDA EL NÚMERO DE ALUMNOS EN EL ARREGLO
		Estudiante[] estud = new Estudiante[num_alu];
		Profesor[] prof = new Profesor[1]; //SOLO UN PROFESOR
		
		//SE DECLARAN LOS MÉTODOS
		PedirAlumnos(estud);
		PedirProfesor(prof);
		Clase(estud, prof, aul);
	}
	
	//SE PIDEN LOS DATOS DE LOS ALUMNOS
	public static void PedirAlumnos(Estudiante[] estud){
		int edad_alu=0, sexo_alu=0, asist=0;
		double calif=0;
		System.out.println();
		System.out.println("-CAPTURA DE ALUMNOS-");
		for(int a=0; a<estud.length; a++){
			System.out.print("NOMBRE DEL ALUMNO " + (a+1) + ": ");
			String nom_alu = Leer.dato();
			
			//SE VALIDA QUE SE INGRESE UNA EDAD ENTRE 1 Y 79
			do{
				System.out.print("EDAD DE " + nom_alu + ": (1-79): ");
				edad_alu = Leer.datoInt();
				if(edad_alu<1){
					System.out.println(nom_alu + " NO PUEDE TENER 0 AÑOS...");
				}
				else if(edad_alu>79){
					System.out.println(nom_alu + " NO PUEDE TENER MÁS DE 79 AÑOS...");
				}
				else{
					System.out.println(nom_alu + " TIENE " + edad_alu + " AÑOS");
				}
			}while(edad_alu<1||edad_alu>79);
			
			//SE VALIDA QUE SE INGRESE UN SEXO 1 O 2
			do{
				System.out.print("SEXO DE " + nom_alu + ":   1-HOMBRE   2-MUJER: ");
				sexo_alu = Leer.datoInt();
				if(sexo_alu==1){
					System.out.println(nom_alu + " ES HOMBRE");
				}
				else if(sexo_alu==2){
					System.out.println(nom_alu + " ES MUJER");
				}
				else{
					System.out.println("SEXO INEXISTENTE...");
				}
			}while(sexo_alu!=1&&sexo_alu!=2);
			
			//GENERA UNA ASISTENCIA ALEATORIA (50% DE ASISTIR Y 50% DE FALTAR)
			int var = (int) (Math.random()*100000);
			if(var<=40000) {
				System.out.println(nom_alu + " ASISTIÓ");
				asist=1;
			}
			else {
				System.out.println(nom_alu + " NO ASISTIÓ (FALTÓ)");
				asist=2;
			}
			
			//SE VALIDA QUE SE INGRESE UNA CALIFICACIÓN ENTRE 0 Y 10
			do{
				System.out.print("CALIFICACIÓN DE " + nom_alu + ": (0-10): ");
				calif = Leer.datoDouble();
				System.out.println(nom_alu + " TIENE " + calif + " DE CALIFICACIÓN");
				if(calif>10) {
					System.out.println(nom_alu + " NO PUEDE TENER MÁS DE 10...");
				}
			}while(calif<0||calif>10);
			System.out.println();
			
			//SE GUARDAN LOS DATOS
			estud[a] = new Estudiante(nom_alu, edad_alu, sexo_alu, asist, calif);
		}
	}
	
	//SE PIDEN LOS DATOS DEL PROFESOR
	public static void PedirProfesor(Profesor[] prof) {
		int edad_prof=0, sexo_prof=0, materia_prof=0, asist=0;
		System.out.println("-CAPTURA DEL PROFESOR-");
		System.out.print("NOMBRE DEL PROFESOR: ");
		String nom_prof = Leer.dato();
		
		//SE VALIDA QUE SE INGRESE UNA EDAD ENTRE 1 Y 79
		do{
			System.out.print("EDAD DE " + nom_prof + ": (1-79): ");
			edad_prof= Leer.datoInt();
			if(edad_prof<1){
				System.out.println(nom_prof + " NO PUEDE TENER 0 AÑOS...");
			}
			else if(edad_prof>79){
				System.out.println(nom_prof + " NO PUEDE TENER MÁS DE 79 AÑOS...");
			}
			else{
				System.out.println(nom_prof + " TIENE " + edad_prof + " AÑOS");
			}
		}while(edad_prof<1||edad_prof>79);
		
		//SE VALIDA QUE SE INGRESE UN SEXO 1 O 2
		do{
			System.out.print("SEXO DE " + nom_prof + ":   1-HOMBRE   2-MUJER: ");
			sexo_prof = Leer.datoInt();
			if(sexo_prof==1){
				System.out.println(nom_prof + " ES HOMBRE");
			}
			else if(sexo_prof==2){
				System.out.println(nom_prof + " ES MUJER");
			}
			else {
				System.out.println("SEXO INEXISTENTE...");
			}
		}while(sexo_prof!=1&&sexo_prof!=2);
		
		//SE VALIDA QUE SE INGRESE UNA MATERIA 1, 2 O 3
		do{
			System.out.print("¿QUÉ MATERIA IMPARTE " + nom_prof + "?:   1-MATEMÁTICAS   2-PROGRAMACIÓN   3-CONTABILIDAD: ");
			materia_prof = Leer.datoInt();
			if(materia_prof==1) {
				System.out.println(nom_prof + " IMPARTE MATEMÁTICAS");
			}
			if(materia_prof==2) {
				System.out.println(nom_prof + " IMPARTE PROGRAMACIÓN");
			}
			if(materia_prof==3) {
				System.out.println(nom_prof + " IMPARTE CONTABILIDAD");
			}
			if(materia_prof<1||materia_prof>3) {
				System.out.println("MATERIA INEXISTENTE...");
			}
		}while(materia_prof<1||materia_prof>3);
		
		//GENERA UNA ASISTENCIA ALEATORIA (80% DE ASISTIR Y 20% DE FALTAR)
		int var = (int) (Math.random()*100000);
		if(var<=80000) {
			System.out.println(nom_prof + " ASISTIÓ");
			asist=1;
		}
		else {
			System.out.println(nom_prof + " NO ASISTIÓ (FALTÓ)");
			asist=2;
		}
		System.out.println();
		
		//SE GUARDAN LOS DATOS
		prof[0] = new Profesor(nom_prof, edad_prof, sexo_prof, asist, materia_prof);
	}
	
	//MUESTRA SI HAY O NO HAY CLASES, DEPENDIENDO DE LAS 3 CONDICIONES
	public static void Clase(Estudiante[] estud, Profesor[] prof, Aula[] aul){
		int x=0, y=0, z=0;
		double cont_asist=0, mitad=estud.length/2;	
		
		//SE CUENTAN LAS ASISTENCIAS
		for(int b=0; b<estud.length; b++) {
			if(estud[b].getAsistencia()==1) {
				cont_asist++;
			}
		}
		
		//SE CALCULA EL PORCENTAJE DE ASISTENCIAS
		double porc_asist = (cont_asist/estud.length)*100;
		
		System.out.println("-CONDICIONES-");
		//EN CASO DE QUE COINCIDAN LAS MATERIAS
		if(prof[0].getMateria()==aul[0].getMateria()) {
			System.out.println("LAS MATERIAS COINCIDEN");
			x=10;
		}
		else {
			System.out.println("LAS MATERIAS NO COINCIDEN");
		}
		
		//EN CASO DE QUE HAYA ASISTIDO MÁS DE LA MITAD
		if(cont_asist>mitad) {
			System.out.println("ASISTIÓ MÁS DE LA MITAD DEL GRUPO (" + porc_asist + "%)");
			y=10;
		}
		if(cont_asist==mitad) {
			System.out.println("ASISTIÓ LA MITAD DEL GRUPO (50%)");
		}
		if(cont_asist<mitad){
			System.out.println("ASISTIÓ MENOS DE LA MITAD DEL GRUPO (" + porc_asist + "%)");
		}
		
		//EN CASO DE QUE EL MAESTRO HAYA ASISTIDO
		if(prof[0].getAsistencia()==1) {
			System.out.println(prof[0].getNombre() + " ASISTIÓ");
			z=10;
			}
		else {
			System.out.println(prof[0].getNombre() + " NO ASISTIÓ (FALTÓ)");
		}
		
		//HAY CLASES SI SE CUMPLIERON LAS 3 CONDICIONES
		int suma=x+y+z;
		if(suma==30) {
			System.out.println("\t¡SÍ HAY CLASE!");
			//SOLO SI HAY CLASES, SE EJECUTA EL MÉTODO DE APROBADOS Y REPROBADOS. SINO HAY CLASES, SE OMITE
			AprobadosReprobados(estud);
		}
		else {
			System.out.println("\t¡NO HAY CLASE!");
		}
	}
	
	//MUESTRA LA CANTIDAD DE HOMBRES Y MUJERES APROBADOS, Y EL PORCENTAJE DE APROBADOS (CALIFICACIÓN MAYOR O IGUAL A 7)
	//ESTE MÉTODO SE EJECUTA SOLO CUANDO SÍ HAY CLASES
	public static void AprobadosReprobados(Estudiante[] estud) {
		double aprob=0;
		int hom_aprob=0, muj_aprob=0;
		
		//CUENTA EL NÚMERO DE HOMBRES Y MUJERES APROBADOS
		for(int c=0; c<estud.length; c++) {
			//CUENTA APROBADOS EN GENERAL
			if(estud[c].getCalif()>=7) {
				aprob++;
			}
			//SOLO HOMBRES
			if(estud[c].getCalif()>=7&&estud[c].getSexo()==1) {
				hom_aprob++;
			}
			//SOLO MUJERES
			if(estud[c].getCalif()>=7&&estud[c].getSexo()==2) {
				muj_aprob++;
			}
		}
		
		//SI NO HAY APROBADOS, NO IMPRIME NADA
		if(aprob!=0) {
			System.out.println();
			System.out.println("-LISTA DE APROBADOS-");
		}
		
		//IMPRIME EL NÚMERO Y NOMBRES DE HOMBRES APROBADOS
		if(hom_aprob!=0) {
			System.out.println("HOMBRES APROBADOS: " + hom_aprob);
			for(int d=0; d<estud.length; d++) {
				if(estud[d].getCalif()>7&&estud[d].getSexo()==1) {
					System.out.println(estud[d].getNombre() + " CON " + estud[d].getCalif());
				}
			}
		}
		
		//IMPRIME EL NÚMERO Y NOMBRES DE MUJERES APROBADAS
		if(muj_aprob!=0) {
			System.out.println();
			System.out.println("MUJERES APROBADAS: " + muj_aprob);
			for(int e=0; e<estud.length; e++) {
				if(estud[e].getCalif()>=7&&estud[e].getSexo()==2) {
					System.out.println(estud[e].getNombre() + " CON " + estud[e].getCalif());
				}
			}
		}
		
		//CALCULA EL PORCENTAJE DE APROBADOS
		double porc_aprob=(aprob/estud.length)*100;
		//MUESTRA LOS DATOS
		System.out.println();
		System.out.println("PORCENTAJE DE APROBADOS (GENERAL): " + porc_aprob + "%");
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM