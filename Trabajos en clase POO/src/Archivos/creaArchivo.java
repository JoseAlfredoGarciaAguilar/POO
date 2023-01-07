package Archivos;
import java.io.*;
// Se utiliza tambi�n la clase LEER modificada en este Paquete

public class creaArchivo 
{
	public static void crearFichero(File fichero) throws IOException{
	    PrintStream flujoS = System.out; // salida est�ndar
	    ObjectOutputStream oos = null;// salida de datos hacia el fichero
	    char resp;
	    try{
	      // Crear un flujo hacia el fichero que permita escribir
	      // objetos y datos de tipos primitivos.
	      oos = new ObjectOutputStream(new FileOutputStream(fichero));
	      // Declarar los datos a escribir en el fichero
	      String nombre, sexo;
	      int edad, sueldo, tipo, especialidad;
	      // Leer datos de la entrada est�ndar y escribirlos
	      // en el fichero
	      do{
	        System.out.print("Nombre: "); nombre=Leer.dato();
	        System.out.print("Edad: "); edad=Leer.datoInt();
	        System.out.print("Sexo (M/F): "); sexo=Leer.dato();
	        System.out.print("Sueldo: "); sueldo=Leer.datoInt();
	        System.out.print("Tipo de nombramiento (1=completo, 2= medio � 3=parcial): ");
	        tipo=Leer.datoInt();
	        System.out.print("Especialidad (1=licenciatura, 2=maestria � 3=doctorado): ");
	        especialidad=Leer.datoInt();
	        // Crear un objeto CPersona y almacenarlo en el fichero
	        oos.writeObject(new Profesor(nombre, edad, sexo, sueldo, tipo, especialidad));
	        System.out.print("Desea escribir otro registro? (s/n) ");
	        resp = Leer.car�cter();
	        Leer.limpiar();
	      }
	      while (resp == 's' || resp=='S');
	    }
	    finally{
	      // Cerrar el flujo
	      if (oos != null) oos.close();
	    }
	  }


	  public static void main(String[] args)
	  {
	    PrintStream flujoS = System.out; // salida est�ndar
	    String nombreFichero = null;     // nombre del fichero
	    File fichero = null; // objeto que identifica el fichero
	    
	    try
	    {
	      // Crear un objeto File que identifique al fichero
	    	System.out.print("Nombre del fichero de datos a escribir: ");
	      nombreFichero = Leer.dato();
	      fichero = new File(nombreFichero);
	      
	      // Verificar si el fichero existe
	      char resp = 's';
	      if (fichero.exists())
	      {
	        flujoS.print("El fichero YA existe, desea sobreescribirlo? (s/n) ");
	        resp = Leer.car�cter();
	        Leer.limpiar();
	      }
	      if (resp == 's')
	      {
	        crearFichero(fichero);
	      }
	    }
	    catch(IOException e)
	    {
	      flujoS.println("Error: " + e.getMessage());
	    }
	  }

}
