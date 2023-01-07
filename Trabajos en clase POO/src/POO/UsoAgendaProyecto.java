package POO;
//PROGRAMA QUE SIMULA UNA AGENDA TELEFÓNICA. MUESTRA UN MENÚ DE 7 OPCIONES PARA CONTROLAR LA AGENDA
public class UsoAgendaProyecto {

	public static void main(String[] args) {
		boolean boleano = false;	
		System.out.print("¿CUÁNTOS CONTACTOS QUIERES AGREGAR?: ");
		int N = Leer.datoInt();
		AgendaProyecto[] arreglo = new AgendaProyecto[N];
		
		//TOMA UNA ELECCIÓN PARA EJECUTAR UN MÉTODO
		do{
			System.out.println();
			//MUESTRA EL MENÚ DE OPCIONES AL USUARIO
			System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
			System.out.println("♣   AGENDA DE CONTACTOS   ♣");
			System.out.println("♣   1-AÑADIR CONTACTO     ♣");
			System.out.println("♣   2-EXISTE CONTACTO     ♣");
			System.out.println("♣   3-LISTAR LA AGENDA    ♣");
			System.out.println("♣   4-BUSCAR CONTACTO     ♣");
			System.out.println("♣   5-ELIMINAR CONTACTO   ♣");
			System.out.println("♣   6-AGENDA LLENA        ♣");
			System.out.println("♣   7-HUECOS LIBRES       ♣");
			System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
			System.out.print("♣   ELIGE LA OPCIÓN INGRESANDO SU NÚMERO:   ♣: ");
			int eleccion = Leer.datoInt();
			switch(eleccion) {
			case 1:
				AñadirContacto(arreglo, N);
				break;
			case 2:
				ExisteContacto(arreglo);
				break;
			case 3:
				ListarContactos(arreglo);
				break;
			case 4:
				BuscarContacto(arreglo);
				break;
			case 5:
				EliminarContacto(arreglo);
				break;
			case 6:
				AgendaLlena(arreglo);
				break;
			case 7:
				HuecosLibres(arreglo, N);
				break;
			default:
				System.out.println("OPCIÓN INVÁLIDA");
			}
			
			//PREGUNTA SI SE DESEA DESPLEGAR EL MENÚ
			System.out.println();
			System.out.print("¿QUIERES MOSTRAR EL MENÚ?  1=SI   2=NO: ");
			int menu = Leer.datoInt();
			if(menu==1) {
				boleano = true;
			}
			else if(menu==2) {
				System.out.println();
				System.out.println("AGENDA CERRADA");
				break;
			}
			else if(menu<1 || menu>2){
				System.out.println("ERROR. OPCIÓN INVÁLIDA");
			}
		}
		while(boleano == true);
	}
	
	//AÑADE UN CONTACTO A LA AGENDA
	public static void AñadirContacto(AgendaProyecto[] arreglo, int N){
		String mensaje="";
		int contador=0;
		for(int a=0; a<arreglo.length; a++) {
			if(arreglo[a] != null) {
				contador++;
			}
		}
				if(contador==N) {
					System.out.println("AGENDA LLENA");
				}
				else {
					System.out.println();
					System.out.println("AGREGAR UN CONTACTO");
					System.out.print("NOMBRE: ");
					String Nombre = Leer.dato();
					System.out.print("TELÉFONO: ");
					int Telefono = Leer.datoInt();
					
					for(int b=0; b<arreglo.length; b++) {
						if(arreglo[b] != null) {
							if(Nombre.equalsIgnoreCase(arreglo[b].getNombre())) {
								mensaje = "ERROR. CONTACTO EXISTENTE";
							}		
							else { 
								mensaje = "CONTACTO AGREGADO EXITOSAMENTE";
								arreglo[b] = new AgendaProyecto(Nombre, Telefono);
								}
							}
					}
					}
					System.out.println(mensaje);
				}
	
	//DICE SI EL CONTACTO AGREGADO YA EXISTE O NO
	public static void ExisteContacto(AgendaProyecto[] arreglo){
		System.out.println();
		System.out.print("ESCRIBE EL NOMBRE DEL CONTACTO A BUSCAR: ");
		String Nombre = Leer.dato();
		for(int b=0; b<arreglo.length; b++){
			//VALIDA QUE NO SE REPITA NINGÚN NOMBRE O TELÉFONO
			if(arreglo[b] != null){
				if(Nombre.equalsIgnoreCase(arreglo[b].getNombre())) {
					System.out.println("ERROR. " + arreglo[b].getNombre() + " YA EXISTE EN LA AGENDA");
				}
			}
		}
	}
	
	//LISTA TODA LA AGENDA
	public static void ListarContactos(AgendaProyecto[] arreglo) {
		System.out.println();
		System.out.println("CONTACTOS AGREGADOS");
		//LISTA TODOS LOS CONTACTOS DE LA AGENDA
		for(int c=0; c<arreglo.length; c++) {
			if(arreglo[c] != null) {
				System.out.println(arreglo[c].getNombre() + "   " + arreglo[c].getTelefono());
			}
		}
	}
	
	//AL BUSCAR UN CONTACTO POR NOMBRE, IMPRIME SU TELÉFONO
	public static void BuscarContacto(AgendaProyecto[] arreglo) {
		boolean boleano=false;
		System.out.print("ESCRIBE EL NOMBRE DEL CONTACTO A BUSCAR: ");
		String Nombre = Leer.dato();
		
		for(int d=0; d<arreglo.length; d++) {
			if(arreglo[d] != null) {
				if(Nombre.equalsIgnoreCase(arreglo[d].getNombre())) {
					System.out.println(arreglo[d].ToString());
					boleano=true;
				}
			}
		}
		}
	
	//AL ESCRIBIR AL NOMBRE DE UN CONTACTO, LO ELIMINA DE LA AGENDA
	public static void EliminarContacto(AgendaProyecto[] arreglo) {
		String mensaje="";
		System.out.println();
		System.out.println("ESCRIBE EL NOMBRE DEL CONTACTO A ELIMINAR: ");
		String Nombre = Leer.dato();
		//BUSCA EL NOMBRE INGRESADO EN TODOS LOS CONTACTOS PARA ELIMINARLO
		for(int e=0; e<arreglo.length; e++) {
			if(arreglo[e] != null) {
				if(Nombre.equalsIgnoreCase(arreglo[e].getNombre())) {
					arreglo[e] = null;
					mensaje = Nombre + " HA SIDO ELIMINADO";
				}
				else {
					mensaje = "ERROR. " + Nombre + " NO EXISTE EN LA LISTA DE CONTACTOS";
				}
			}	
		}
	}
	
	//INDICA SI LA AGENDA ESTÁ LLENA
	public static void AgendaLlena(AgendaProyecto[] arreglo) {
		int contador=0;
		for(int a=0; a<arreglo.length; a++) {
			if(arreglo[a] != null) {
				contador++;
			}
		}
				if(contador==arreglo.length) {
					System.out.println("AGENDA LLENA");
				}
	}
	
	//INDICA CUÁNTOS CONTACTOS MÁS SE PUEDEN AGREGAR
	public static void HuecosLibres(AgendaProyecto[] arreglo, int N) {
		int contador=0, huecos;
		for(int a=0; a<arreglo.length; a++) {
			if(arreglo[a] != null) {
				contador++;
			}
		}
		
		huecos = N - contador;
		System.out.println("SE PUEDEN METER " + huecos + " CONTACTOS MÁS");
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM
//MAESTRO LUIS ESTEBAN LÓPEZ MENDOZA