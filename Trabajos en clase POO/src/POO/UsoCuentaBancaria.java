package POO;

public class UsoCuentaBancaria {

	public static void main(String[] args) {
		int Clave=0;
		String Nombre="", Domicilio="";
		double Saldo=0;
		System.out.print("¿CUÁNTOS CLIENTES VAS A LEER?: ");
		int N = Leer.datoInt();
		CuentaBancaria[] arreglo = new CuentaBancaria[N];
		
		//SE CAPTURAN LOS DATOS
		for(int a=0; a<arreglo.length; a++) {
			System.out.println();
			System.out.print("CLAVE DE CUENTA " + (a+1) + ": ");
			Clave = Leer.datoInt();
			System.out.print("NOMBRE " + (a+1) + ": ");
			Nombre = Leer.dato();
			System.out.print("DOMICILIO DE " + Nombre + ": ");
			Domicilio = Leer.dato();
			System.out.print("SALDO DE " + Nombre +  ": ");
			Saldo = Leer.datoDouble();
			
			arreglo[a] = new CuentaBancaria(Clave, Nombre, Domicilio, Saldo);
		}
		
		AltaDeCuentas(arreglo, Clave);
		ConsultaDeDatos(arreglo);
		Retirar(arreglo);
	}
	
	//VALIDA QUE NO SE REPITA NINGUNA CLAVE DE CUENTA
		public static void AltaDeCuentas(CuentaBancaria[] arreglo, int Clave) {
			for(int a=0; a<arreglo.length; a++) {
				if(arreglo[a].getClave_de_Cuenta() == Clave) {
					System.out.println();
					System.out.println("ERROR. ESA CLAVE YA EXISTE");
					break;
				}
			}
		}
	
	//AL INGRESAR LA CLAVE DE LA CUENTA, IMPRIME LOS DATOS DEL CLIENTE
	public static void ConsultaDeDatos(CuentaBancaria[] arreglo) {
		System.out.println();
		System.out.print("INGRESA LA CLAVE DE LA CUENTA DEL CLIENTE A MOSTRAR: ");
		int cla = Leer.datoInt();
		for(int d=0; d<arreglo.length; d++) {
			if(arreglo[d].getClave_de_Cuenta() == cla) {
				System.out.println("NÚMERO DE CUENTA: " + arreglo[d].getClave_de_Cuenta());
				System.out.println("NOMBRE: " + arreglo[d].getNombre_del_Cliente());
				System.out.println("DOMICILIO: " + arreglo[d].getDomicilio());
				System.out.println("SALDO: " + arreglo[d].getSaldo() + " PESOS");
			}
		}
	}
	
	//SE PIDE LA CLAVE DE CUENTA Y DINERO A RETIRAR. IMPRIME EL SALDO SOBRANTE
	public static void Retirar(CuentaBancaria[] arreglo) {
		System.out.println();
		System.out.print("INGRESA LA CLAVE DE LA CUENTA DEL CLIENTE PARA RETIRAR: ");
		int cla = Leer.datoInt();
		System.out.print("INGRESA EL IMPORTE A RETIRAR: ");
		double imp = Leer.datoDouble();
		double cambio=0;
		
		for(int e=0; e<arreglo.length; e++) {
			if(arreglo[e].getClave_de_Cuenta() == cla && arreglo[e].getSaldo() >= imp) {
					cambio=arreglo[e].getSaldo() - imp;
					System.out.println("RETIRASTE " + imp + " PESOS");
					System.out.println("EL NUEVO SALDO ES " + cambio + " PESOS");
			}
			if(arreglo[e].getClave_de_Cuenta() == cla && arreglo[e].getSaldo() < imp) {
				System.out.println("NO TE ALCANZA EL DINERO. NO ES POSIBLE RETIRAR");
				break;
			}
		}
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//PROGRAMACIÓN ORIENTADA A OBJETOS
//EXAMEN UNIDAD 2