package ProyectoArchivos;

import java.io.*;

public class LeeNomina {

	// MUESTRA TODOS LOS DATOS EN FORMA DE LISTA
	public static void MostrarFichero(String nombreFichero, Empleado[] emple) throws IOException {
		ObjectInputStream ois = null; // ENTRADA DE DATOS DESDE EL FICHERO
		File fichero = null; // OBJETO QUE IDENTIFICA EL FICHERO

		try {
			System.out.println();
			System.out.println("-MOSTRAR TODOS LOS DATOS-");
			// CREAR UN OBJETO FILE QUE IDENTIFIQUE AL FICHERO
			fichero = new File(nombreFichero);
			// VERIFICAR QUE EL FICHERO EXISTA
			if (fichero.exists()) {
				// SI EXISTE, ABRIR UN FLUJO DESDE ÉL (OUTPUT INPUT STREAM)
				ois = new ObjectInputStream(new FileInputStream(fichero));
				// DECLARAR LAS VARIABLES
				Empleado emp;
				String nombre;
				int edad, pago, horas, total, x = 0;
				char sexo, tipo;

				do {
					try {
						// LEER LOS DATOS DESDE EL FICHERO
						emp = (Empleado) ois.readObject();
						emple[x] = emp;
						x++;
						String salida_sexo = null, salida_tipo = null;
						nombre = emp.getNombre();
						edad = emp.getEdad();
						sexo = emp.getSexo();
						tipo = emp.getTipo();
						pago = emp.getPago();
						horas = emp.getHoras();
						total = emp.getTotal();

						if (sexo == 'h' || sexo == 'H') {
							salida_sexo = "HOMBRE";
						} else {
							salida_sexo = "MUJER";
						}

						if (tipo == 'b' || tipo == 'B') {
							salida_tipo = "BASE";
						} else {
							salida_tipo = "EVENTUAL";
						}
						// MOSTRAR TODOS LOS DATOS
						System.out.println("NOMBRE: " + nombre + ".   EDAD: " + edad + " AÑOS.   SEXO: " + salida_sexo
								+ ".   TIPO DE TRABAJO: " + salida_tipo + ".   PAGO POR HORA: $" + pago
								+ ".   HORAS DE TRABAJO: " + horas + ".   TOTAL A PAGAR: $" + total);
					} catch (ArrayIndexOutOfBoundsException e) {
					}
				} while (true);
			} else {
				System.out.println("FICHERO INEXISTENTE");
			}
		} catch (EOFException e) {
			System.out.println("FIN DEL LISTADO");
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
		} finally {
			// CERRAR EL FLUJO
			if (ois != null) {
				ois.close();
			}
		}
	}

	// MUESTRA LA LISTA DE EMPLEADOS QUE TRABAJARON HORAS EXTRAS, CON SUS HORAS Y UN
	// PAGO EXTRA
	public static void HorasExtra(Empleado[] emple) {
		int pago_extra = 0;
		System.out.println();
		System.out.println("-EMPLEADOS QUE TRABAJARON HORAS EXTRAS (MÁS DE 40)-");
		try {
			// SE BUSCAN LOS EMPLEADOS CON MÁS DE 40 HORAS
			for (int a = 0; a < emple.length; a++) {
				if (emple[a].getHoras() > 40) {
					// SE CALCULA UN PAGO EXTRA PARA LOS EMPLEADOS CON HORAS EXTRA
					// PAGO EXTRA = HORAS EXTRAS * (PAGO*2)
					pago_extra = emple[a].getHoras() * (emple[a].getPago() * 2);
					System.out.println("NOMBRE: " + emple[a].getNombre() + ".   HORAS: " + emple[a].getHoras()
							+ ".   PAGO EXTRA: $" + pago_extra);
				}
			}
		} catch (NullPointerException e) {
			System.out.println("HABÍA UN ERROR");
		} finally {
			System.out.println("FIN DEL LISTADO");
		}
	}

	// MUESTRA POR SEPARADO LOS HOMBRES Y LAS MUJERES, CON SUS HORAS
	public static void Relacion(Empleado[] emple) {
		System.out.println();
		System.out.println("-RELACIÓN DE EMPLEADOS-");
		// SE BUSCAN LOS HOMBRES
		try {
			System.out.println("HOMBRES");
			for (int c = 0; c < emple.length; c++) {
				if (emple[c].getSexo() == 'h' || emple[c].getSexo() == 'H') {
					// SE IMPRIMEN LOS HOMBRES
					System.out.println("NOMBRE: " + emple[c].getNombre() + ".   HORAS: " + emple[c].getHoras());
				}
			}
		} catch (NullPointerException e) {
			System.out.println("HABÍA UN ERROR");
		} finally {
			System.out.println("FIN DEL LISTADO");
		}

		// SE BUSCAN LAS MUJERES
		try {
			System.out.println();
			System.out.println("MUJERES");
			for (int d = 0; d < emple.length; d++) {
				if (emple[d].getSexo() == 'm' || emple[d].getSexo() == 'M') {
					// SE IMPRIMEN LAS MUJERES
					System.out.println("NOMBRE: " + emple[d].getNombre() + ".   HORAS: " + emple[d].getHoras());
				}
			}
		} catch (NullPointerException e) {
			System.out.println("HABÍA UN ERROR");
		} finally {
			System.out.println("FIN DEL LISTADO");
		}
	}

	public static void main(String[] args) {
		String nombreFichero = null; // NOMBRE DEL FICHERO
		File fichero = null; // OBJETO QUE IDENTIFICA EL FICHERO

		try {
			// ENVIAR UNA VARIABLE STRING EN EL NOMBRE DEL FICHERO
			System.out.print("NOMBRE DEL FICHERO A LEER: ");
			nombreFichero = Leer.dato();
			Empleado[] emple = new Empleado[20];
			MostrarFichero(nombreFichero, emple);
			HorasExtra(emple);
			Relacion(emple);
		} catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM