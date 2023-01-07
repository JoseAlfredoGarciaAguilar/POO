package Herencia;
//PROGRAMA QUE PIDE LOS DATOS DE N PROFESORES Y N ALUMNOS,
//IMPRIME LOS DATOS DE LOS PROFESORES DE FORMA NORMAL,
//IMPRIME UN INCREMENTO EN EL SUELDO DE LOS PROFESORES DEPENDIENDO DE SU TIPO DE TIEMPO DE TRABAJO,
//IMPRIME LOS DATOS DE LOS ALUMNOS DE MENOR A MAYOR DEPENDIENDO DE SU SEMESTRE,
//E IMPRIME EL NOMBRE Y EL PROMEDIO DEL ALUMNO DE MAYOR PROMEDIO EN TODO EL SEMESTRE
public class Escuela {

	public static void main(String[] args) {
		System.out.println("\t♠ESCUELA♠");
		//SE PIDE EL NÚMERO DE PROFESORES Y DE ALUMNOS PARA GUARDARLOS EN LOS ARREGLOS
		System.out.println("-CAPTURA DE PROFESORES Y ALUMNOS-");
		System.out.print("¿CUÁNTOS PROFESORES SON?: ");
		int prof = Leer.datoInt();
		System.out.print("¿CUÁNTOS ALUMNOS SON?: ");
		int alu = Leer.datoInt();
		
		Profesor[] profesor = new Profesor[prof];
		Alumno[] alumno = new Alumno[alu];
		
		//SE IMPRIME UN MENSAJE DE LA CANTIDAD DE PROFESORES Y ALUMNOS A GUARDAR
		if(prof==0 && alu==0) {
			System.out.println("NO SE PEDIRÁ NADA. FIN DEL PROGRAMA");
		}
		if(prof==1 && alu==1) {
			System.out.println("SE PEDIRÁ " + prof + " PROFESOR Y " + alu + " ALUMNO");
		}
		if(prof>1 && alu==1) {
			System.out.println("SE PEDIRÁN " + prof + " PROFESORES Y " + alu + " ALUMNO");
		}
		if(prof==1 && alu>1) {
			System.out.println("SE PEDIRÁ " + prof + " PROFESOR Y " + alu + " ALUMNOS");
		}
		if(prof>1 && alu>1) {
			System.out.println("SE PEDIRÁN " + prof + " PROFESORES Y " + alu + " ALUMNOS");
		}
		if(prof==0 && alu==1) {
			System.out.println("SE PEDIRÁ " + alu + " ALUMNO");
			System.out.println();
		}
		if(prof==0 && alu>1) {
			System.out.println("SE PEDIRÁN " + alu + " ALUMNOS");
			System.out.println();
		}
		if(prof==1 && alu==0) {
			System.out.println("SE PEDIRÁ " + prof + " PROFESOR");
		}
		if(prof>1 && alu==0) {
			System.out.println("SE PEDIRÁN " + prof + " PROFESORES");
		}
		
		CapturaProfesores(profesor);
		CapturaAlumnos(alumno);
		ImprimeProfesores(profesor);
		AumentoSueldo(profesor);
		OrdenarAlumnos(alumno);
		ImprimeAlumnos(alumno);
		MayorPromedio(alumno);
		}
	
	//SE PIDEN LOS DATOS DE LOS PROFESORES
	public static void CapturaProfesores(Profesor[] profesor){
		int Tipo_prof=0, Especialidad=0;
		//SE VALIDA QUE, SI SE INGRESAN 0 PROFESORES, NO SE PIDA NADA
		if(profesor.length!=0) {
			System.out.println();
			System.out.println("-CAPTURA DE DATOS DE LOS PROFESORES-");
			for(int a=0; a<profesor.length; a++){
				System.out.print("NOMBRE DEL PROFESOR " + (a+1) + ": ");
				String Nombre_prof = Leer.dato();
				System.out.print("EDAD DE " + Nombre_prof + ": ");
				int Edad_prof = Leer.datoInt();
				System.out.print("SUELDO MENSUAL DE " + Nombre_prof + ": ");
				double Sueldo_prof = Leer.datoDouble();
				//SE VALIDA QUE SE INGRESE UNA OPCIÓN VÁLIDA PARA EL TIEMPO
				do{
					System.out.print("TIPO DE TIEMPO DE " + Nombre_prof + ":   1=TIEMPO COMPLETO   2=MEDIO TIEMPO: ");
					Tipo_prof = Leer.datoInt();
					if(Tipo_prof !=1 && Tipo_prof !=2){
						System.out.println("ERROR. OPCIÓN INVÁLIDA. INGRESA DE NUEVO");
					}
				}while(Tipo_prof !=1 && Tipo_prof !=2);
				//SE VALIDA QUE SE INGRESE UNA OPCIÓN VÁLIDA PARA LA ESPECIALIDAD
				do{
					System.out.print("ESPECIALIDAD DE " + Nombre_prof + ":   1=LICENCIATURA   2=MAESTRÍA   3=DOCTORADO: ");
					Especialidad = Leer.datoInt();
					if(Especialidad !=1 && Especialidad !=2 && Especialidad !=3){
						System.out.println("ERROR. OPCIÓN INVÁLIDA. INGRESA DE NUEVO");
					}
				}while(Especialidad !=1 && Especialidad !=2 && Especialidad !=3);

				profesor[a] = new Profesor(Nombre_prof, Edad_prof, Sueldo_prof, Tipo_prof, Especialidad);
				System.out.println();
			}
		}
	}
	
	//SE PIDEN LOS DATOS DE LOS ALUMNOS
	public static void CapturaAlumnos(Alumno[] alumno){
		int Carrera_alu=0, Semestre_alu=0;
		double Promedio_alu=0;
		//SE VALIDA QUE, SI SE INGRESAN 0 ALUMNOS, NO SE PIDA NADA
		if(alumno.length!=0) {
			System.out.println("-CAPTURA DE DATOS DE LOS ALUMNOS-");
			for(int b=0; b<alumno.length; b++){
				System.out.print("NOMBRE DEL ALUMNO " + (b+1) + ": ");
				String Nombre_alu = Leer.dato();
				System.out.print("EDAD DE " + Nombre_alu + ": ");
				int Edad_alu = Leer.datoInt();
				//SE VALIDA QUE SE INGRESE UNA OPCIÓN VÁLIDA PARA EL PROMEDIO (ENTRE 0 Y 100)
				do{
					System.out.print("PROMEDIO SEMESTRAL DE " + Nombre_alu + " DEL 0 AL 100: ");
					Promedio_alu = Leer.datoDouble();
					if(Promedio_alu <0 || Promedio_alu >100) {
						System.out.println("ERROR. OPCIÓN INVÁLIDA. INGRESA DE NUEVO");
					}
				}while(Promedio_alu <0 || Promedio_alu >100);
				//SE VALIDA QUE SE INGRESE UNA OPCIÓN VÁLIDA PARA LA CARRERA
				do{
					System.out.print("CARRERA DE " + Nombre_alu + ":   1=SISTEMAS   2=TICS: ");
					Carrera_alu = Leer.datoInt();
					if(Carrera_alu !=1 && Carrera_alu !=2){
						System.out.println("ERROR. OPCIÓN INVÁLIDA. INGRESA DE NUEVO");
					}
				}while(Carrera_alu !=1 && Carrera_alu !=2);
				//SE VALIDA QUE SE INGRESE UNA OPCIÓN VÁLIDA PARA EL SEMESTRE
				do{
					System.out.print("NÚMERO DE SEMESTRE QUE CURSA " + Nombre_alu + " DEL 1 AL 14: ");
					Semestre_alu = Leer.datoInt();
					if(Semestre_alu <0 || Semestre_alu >14){
						System.out.println("ERROR. OPCIÓN INVÁLIDA. INGRESA DE NUEVO");
					}
				}while(Semestre_alu <1 || Semestre_alu >14);
				
				alumno[b] = new Alumno(Nombre_alu, Edad_alu, Promedio_alu, Carrera_alu, Semestre_alu);
				System.out.println();
			}
		}
	}
	
	//SE IMPRIMEN LOS DATOS DE LOS PROFESORES
	public static void ImprimeProfesores(Profesor[] profesor){
		//SE VALIDA QUE, SI SE INGRESAN 0 PROFESORES, NO SE IMPRIMA NADA
		if(profesor.length!=0) {
			System.out.println("-MUESTRA DE DATOS DE LOS PROFESORES-");
			for(int c=0; c<profesor.length; c++){
				//SE UTILIZA EL MÉTODO TOSTRING DE LA CLASE PROFESOR PARA IMPRIMIR LA LISTA DE PROFESORES
				System.out.println(profesor[c].ToString());
			}
		}
		}
	
	//INCREMENTA EL SUELDO DEL PROFESOR. SI TRABAJA A TIEMPO COMPLETO SE INCREMENTARÁ 10%, Y SI TRABAJA A MEDIO TIEMPO SE INCREMENTARÁ 15%
	public static void AumentoSueldo(Profesor[] profesor){
		double nuevo_sueldo=0;
		//SE VALIDA QUE, SI SE INGRESAN 0 PROFESORES, NO SE IMPRIMA NADA
		if(profesor.length!=0) {
			System.out.println();
			System.out.println("-SUELDOS INCREMENTADOS DE LOS PROFESORES DE ACUERDO A SU TIPO DE TIEMPO DE TRABAJO-");
			//SE BUSCA AL PROFESOR EN EL ARREGLO PARA APLICARLE SU RESPECTIVO INCREMENTO
			for(int d=0; d<profesor.length; d++){
				if(profesor[d].getTipo() == 1){
					//SE SUMA EL SUELDO ORIGINAL MÁS EL INCREMENTO
					nuevo_sueldo=profesor[d].getSueldo()+(profesor[d].getSueldo()*0.10);
					System.out.println("EL SUELDO DE " + profesor[d].getNombre() + " SE INCREMENTÓ 10%. SU NUEVO SUELDO INCREMENTADO ES $" + nuevo_sueldo);
					
				}
				if(profesor[d].getTipo() == 2){
					//SE SUMA EL SUELDO ORIGINAL MÁS EL INCREMENTO
					nuevo_sueldo=profesor[d].getSueldo()+(profesor[d].getSueldo()*0.15);
					System.out.println("EL SUELDO DE " + profesor[d].getNombre() + " SE INCREMENTÓ 15%. SU NUEVO SUELDO INCREMENTADO ES $" + nuevo_sueldo);
				}
			}
		}
	}
	
	//SE ORDENAN LOS ALUMNOS DE MENOR A MAYOR POR SU SEMESTRE
	public static void OrdenarAlumnos(Alumno[] alumno){
		Alumno aux=new Alumno();
		//SE VALIDA QUE, SI SE INGRESAN 0 ALUMNOS, NO SE ORDENE NADA
		if(alumno.length!=0) {
			//SE USA EL MÉTODO DE LA BURBUJA PARA ORDENARNOS DE MENOR A MAYOR
			for(int d=0; d<alumno.length; d++){
				for(int e=alumno.length-1; e>=1; e--){
					if(alumno[e].getSemestre() <= alumno[e-1].getSemestre()){
						aux=alumno[e];
						alumno[e]=alumno[e-1];
						alumno[e-1]=aux;
					}
				}
			}
		}
	}
	
	//SE IMPRIMEN LOS DATOS DE LOS ALUMNOS ORDENADOS DE MENOR A MAYOR POR SU SEMESTRE
	public static void ImprimeAlumnos(Alumno[] alumno) {
		//SE VALIDA QUE, SI SE INGRESAN 0 ALUMNOS, NO SE IMPRIMA NADA
		if(alumno.length!=0) {
			System.out.println();
			System.out.println("-MUESTRA DE DATOS DE LOS ALUMNOS, ORDENADOS POR SEMESTRE-");
			for(int f=0; f<alumno.length; f++){
				//SE UTILIZA EL MÉTODO TOSTRING DE LA CLASE ALUMNO PARA IMPRIMIR LA LISTA DE ALUMNOS
				System.out.println(alumno[f].ToString());
			}
		}
	}
	
	//SE IMPRIME EL NOMBRE Y EL PROMEDIO DEL ALUMNO CON MAYOR PROMEDIO
	public static void MayorPromedio(Alumno[] alumno) {
		String Nom_Mayor="";
		double Prom_Mayor=0;
		System.out.println();
		//SE VALIDA QUE, SI SE INGRESAN 0 ALUMNOS, NO SE IMPRIMA NADA
		if(alumno.length!=0) {
			System.out.println("-ALUMNO DE MAYOR PROMEDIO SEMESTRAL-");
			//SE BUSCA EN EL ARREGLO EL MAYOR PROMEDIO
			for(int g=0; g<alumno.length; g++) {
				if(alumno[g].getPromedio() > Prom_Mayor) {
					Prom_Mayor = alumno[g].getPromedio();
					Nom_Mayor = alumno[g].getNombre();
				}
			}
			System.out.println(Nom_Mayor + ", CON " + Prom_Mayor + " DE PROMEDIO SEMESTRAL");
		}
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//PROGRAMACIÓN ORIENTADA A OBJETOS
//CLASE 4-5 PM
//MAESTRO LUIS ESTEBAN LÓPEZ MENDOZA