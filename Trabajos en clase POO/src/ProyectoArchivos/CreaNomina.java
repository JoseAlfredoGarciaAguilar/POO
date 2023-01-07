package ProyectoArchivos;

import java.io.*;

public class CreaNomina {
	public static void crearFichero(File fichero) throws IOException {
		PrintStream flujoS = System.out; // SALIDA ESTANDAR
		ObjectOutputStream oos = null; // SALIDA DE DATOS HACIA EL FICHERO
		char resp;

		// SE PIDEN LOS DATOS
		try {
			// SE CREA UN FLUJO HACIA EL FICHERO
			oos = new ObjectOutputStream(new FileOutputStream(fichero));
			// SE DECLARAN LAS VARIABLES
			String nombre;
			int edad, pago, horas, total;
			char sexo, tipo;
			do {
				System.out.print("NOMBRE: ");
				nombre = Leer.dato();
				// SE VALIDA QUE SE INGRESE UNA EDAD ENTRE 20 Y 100
				do {
					System.out.print("EDAD DE " + nombre + " (16-100): ");
					edad = Leer.datoInt();
					if (edad >= 16 && edad <= 100) {
						System.out.println(nombre + " TIENE " + edad + " AÑOS");
					}
				} while (edad < 16 || edad > 100);
				// SE VALIDA QUE SE INGRESE UN SEXO H O M
				do {
					System.out.print("SEXO DE " + nombre + "   H=HOMBRE   M=MUJER: ");
					sexo = Leer.carácter();
					if (sexo == 'h' || sexo == 'H') {
						System.out.println(nombre + " ES HOMBRE");
					} else if (sexo == 'm' || sexo == 'M') {
						System.out.println(nombre + " ES MUJER");
					}
				} while (sexo != 'h' && sexo != 'H' && sexo != 'M' && sexo != 'm');
				// SE VALIDA QUE SE INGRESE UN TIPO B O E
				do {
					System.out.print("TIPO DE EMPLEADO DE " + nombre + ":   B=BASE   E=EVENTUAL: ");
					tipo = Leer.carácter();
					if (tipo == 'b' || tipo == 'B') {
						System.out.println(nombre + " ES EMPLEADO BASE");
					} else if (tipo == 'e' || tipo == 'E') {
						System.out.println(nombre + " ES EMPLEADO EVENTUAL");
					}
				} while (tipo != 'b' && tipo != 'B' && tipo != 'E' && tipo != 'e');
				// SE VALIDA QUE SE INGRESE UN PAGO ENTRE 100 Y 5000
				do {
					System.out.print("PAGO POR HORA PARA " + nombre + " (100-5000): ");
					pago = Leer.datoInt();
					System.out.println(nombre + " GANA $" + pago + " POR HORA");
				} while (pago < 100 || pago > 5000);
				// SE VALIDA QUE SE INGRESE HORAS ENTRE 1 Y 200
				do {
					System.out.print("HORAS DE TRABAJO DE " + nombre + " (1-200): ");
					horas = Leer.datoInt();
					System.out.println(nombre + " TRABAJA " + horas + " HORAS");
				} while (horas < 0 || horas > 200);
				// SE CALCULA EL TOTAL A PAGAR
				total = pago * horas;
				System.out.println("PAGO TOTAL PARA " + nombre + ": $" + total);
				System.out.println();
				// SE ALMACENA EL EL FICHERO
				oos.writeObject(new Empleado(nombre, edad, sexo, tipo, pago, horas, total));
				System.out.print("¿DESEAS AGREGAR OTRO REGISTRO?:   S=SÍ   N=NO ");
				resp = Leer.carácter();
				Leer.limpiar();
			} while (resp == 's' || resp == 'S');
		} finally {
			// CERRAR EL FLUJO
			if (oos != null)
				oos.close();
		}
	}

	public static void main(String[] args) {
		PrintStream flujoS = System.out; // SALIDA ESTÁNDAR
		String nombreFichero = null; // NOMBRE DEL FICHERO
		File fichero = null; // OBJETO QUE IDENTIFICA AL FICHERO

		try {
			// CREAR UN OBJETO FILE QUE IDENTIFIQUE AL FICHERO
			System.out.print("NOMBRE DEL FICHERO DE DATOS A CREAR: ");
			nombreFichero = Leer.dato();
			fichero = new File(nombreFichero);
			char resp = 's';
			// VERIFICAR SI EL FICHERO EXISTE
			if (fichero.exists()) {
				flujoS.print("FICHERO YA EXISTENTE. ¿DESEAS SOBREESCRIBIRLO?   S=SÍ   N=NO: ");
				resp = Leer.carácter();
				Leer.limpiar();
			}
			if (resp == 's' || resp == 'S') {
				crearFichero(fichero);
			}
		} catch (IOException e) {
			flujoS.println("Error: " + e.getMessage());
		}
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM