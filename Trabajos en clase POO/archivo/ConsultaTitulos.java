package Archivos.archivo;
import java.io.*;
import java.util.*;
/*
 * Lee un archivo de TEXTO separado por comas que se encuentra dentro
 * del proyecto en la carpeta archivo con el nombre TITUSS.cvs
 * Contiene 4 DATOS:  Titulo del LIBRO, AUTOR, PRECIO DE COMPRA y PRECIO DE VENTA.
 */

public class ConsultaTitulos 
{
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) 
    {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String linea = null;
        try 
        {
            //Cargamos el archivo de la ruta relativa
            archivo = new File("archivo\\TITULOS.csv");
            //Cargamos el objeto FileReader
            fr = new FileReader(archivo);
            //Creamos un buffer de lectura
            br = new BufferedReader(fr);

            String[] datos = new String[33000];
            String [] Tit=null;
          
            int tot = 0;
            //Leemos hasta que se termine el archivo
            while ((linea = br.readLine()) != null) 
            {
            	//Utilizamos el separador para los datos
                Tit = linea.split(";");
                datos[tot]=Tit[0];
                //Presentamos los datos
            	
                System.out.println("NOMBRE DEL LIBRO: " + Tit[0] +"\t"+ " PRECIO -> " + Tit[3] );
                tot++;
                
            }
            System.out.println("TOTAL: "+tot);
            System.out.println();
            System.out.println("CONSULTA DE TITULOS");
            int RT=Leer.datoInt();
            

            //Capturamos las posibles excepciones
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
    
    public static void imprimir_nombre_libro(String[] datos)
    {
        try
        {
            
        	
        } catch (Exception e) 
        {
           
        	System.out.println("UNA TECLA PARA TERMINAR");
        }
     
    }
}
