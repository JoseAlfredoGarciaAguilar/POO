package ProyectoArchivos2;

import java.io.*;

//LEE UN ARCHIVO CON 33,000 LIBROS, SE HACE UNA CONSULTA DE LIBROS E IMPRIME TODOS LOS ENCONTRADOS
public class ConsultaTitulos {

	public static void main(String[] args) {
		System.out.println("-¡32,043 LIBROS!-");
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String linea = null;

		try {
			// SE CARGA EL ARCHIVO DE LA RUTA
			archivo = new File("archivo\\titulos.csv");
			// SE CARGA EL OBJETO FILEREADER
			fr = new FileReader(archivo);
			// SE CREA UN BUFFER DE LECTURA
			br = new BufferedReader(fr);

			// SE CREA EL VECTOR CON APROXIMADAMENTE 33,000 LIBROS
			String[] vector = new String[33000];
			// SE CREA EL VECTOR DE TÍTULOS
			String[] tit = null;

			int total = 0;
			// SE LEE HASTA QUE SE ACABE EL ARCHIVO
			while ((linea = br.readLine()) != null) {
				// SE USA PARA SEPARAR LOS DATOS
				tit = linea.split(";");
				vector[total] = tit[0];

				// SE IMPRIMEN LOS DATOS DEL LIBRO
				System.out.println("NOMBRE: " + tit[0] + ".   PRECIO: $" + tit[3]);
				// SE ACUMULA LA CANTIDAD DE LIBROS
				total++;
			}
			
			// SE MUESTRA EL TOTAL DE LIBROS
			System.out.println("TOTAL: " + total);
			System.out.println();
			
			// SE INVOCA AL MÉTODO CONSULTA
			Consulta(vector);
			// SE CAPTURAN LAS POSIBLES EXCEPCIONES
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	// SE BUSCA UNA LISTA DE LIBROS Y SE IMPRIMEN LOS QUE CONTENGAN ESA PALABRA
	public static void Consulta(String[] vector) {
		char r;
		System.out.println("-CONSULTA DE TÍTULOS-");
		
		try {
			// SE PIDE LA PALABRA CLAVE
			System.out.print("PALABRA CLAVE A IMPRIMIR (ESCRIBIR CON MAYÚSCULAS): ");
			String pal = Leer.dato();
			boolean x;
			String aux = "";
			// SE BUSCA LA PALABRA ESCRITA DENTRO DE TODO EL VECTOR
			for (int a = 0; a < vector.length; a++) {
				x = false;
				aux = vector[a];
				x = aux.startsWith(pal);
				if (x) {
					System.out.println(vector[a]);
				}
			}
		} catch (Exception e) {
			System.out.println();
			// SE VALIDA QUE SE INGRESE UNA RESPUESTA SÍ O NO
			do {
				// SE PREGUNTA SI SE QUIERE OTRA CONSULTA
				System.out.print("¿QUIERES HACER OTRA CONSULTA?   S=SÍ   N=NO: ");
				r = Leer.datocar();
				// AL DECIR QUE SÍ, SE PREGUNTA DE NUEVO
				if (r == 's' || r == 'S') {
					Consulta(vector);
				}
				// AL DECIR QUE NO, SE CIERRA TODO
				else if (r == 'n' || r == 'N') {
					System.out.println("FIN. NO MÁS CONSULTAS");
				}
				// SI SE INGRESA UNA RESPUESTA INVÁLIDA, MUESTRA UN MENSAJE
				else if (r != 's' && r != 'S' && r != 'n' && r != 'N') {
					System.out.println("OPCIÓN INVÁLIDA...");
				}
			} while (r != 's' && r != 'S' && r != 'n' && r != 'N');
		}
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM