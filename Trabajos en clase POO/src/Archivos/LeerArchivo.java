package Archivos;
import java.io.*;
public class LeerArchivo 
{
	public static void mostrarFichero(String nombreFichero, Profesor [] VP)  throws IOException
  {
    //PrintStream flujoS = System.out; // salida estándar
    ObjectInputStream ois = null;// entrada de datos desde el fichero
    File fichero = null;       // objeto que identifica el fichero
    
    try
    {
      // Crear un objeto File que identifique al fichero
      fichero = new File(nombreFichero);

      // Verificar si el fichero existe
      if (fichero.exists())
      {
        // Si existe, abrir un flujo desde el mismo (Output Input Stream)
        ois = new ObjectInputStream(new FileInputStream(fichero));
        
        // Declarar los datos a leer desde el fichero
        	Profesor Profe;
        	String nombre, sexo;
        	int edad, sueldo, tipo, espe, C=0;
       
        do
        {
          // Leer un objeto CPersona desde el fichero. Cuando se
          // alcance el final del fichero Java lanzará una
          // excepción del tipo EOFException.
          Profe = (Profesor)ois.readObject();
          VP[C]=Profe;
          C++;
          String TIPO=null, ESPEC=null;
          nombre = Profe.getNombre();
          edad=Profe.getEdad();
          sexo=Profe.getSexo();
          sueldo=Profe.getSueldo();
          tipo=Profe.getTipo(); 
          if(tipo==1) {	TIPO="COMPLETO"; }
          if(tipo==2) {	TIPO="MEDIO "; }
          if(tipo==3) {	TIPO="PARCIAL"; }
          espe=Profe.getEspecialidad();
          if(espe==1) {	ESPEC="LICENCIATURA"; }
          if(espe==2) {	ESPEC="MAESTRIA"; }
          if(espe==3) {	ESPEC="DOCTORADO"; }
          
          
          // Mostrar los datos nombre, dirección y teléfono
          System.out.println(nombre+"\t"+edad+"\t"+sexo+"\t"+sueldo+"\t"+TIPO+"\t"+ESPEC);
          
          System.out.println();
        }
        while (true);
      }
      else
    	  System.out.println("El fichero no existe");
    }
    catch(EOFException e)
    {
    	System.out.println("Fin del listado");
    }
    catch(ClassNotFoundException e)
    {
    	System.out.println("Error: " + e.getMessage());
    }
    finally
    {
      // Cerrar el flujo
      if (ois != null) ois.close();
    }
  }
  public static void ImprimeTcDoc(Profesor [] VP)
  {
	  
  }
  public static void main(String[] args)
  {
    String nombreFichero = null;     // nombre del fichero
    File fichero = null; // objeto que identifica el fichero  	 	
    	
      try
      {
      // Enviar a una variable String el nombre del fichero
    	  System.out.print("Nombre del fichero de datos a leer: ");
    	  nombreFichero = Leer.dato();
      		Profesor [] VP=new Profesor[20];
      		mostrarFichero(nombreFichero, VP);
      		ImprimeTcDoc(VP);
      }
      catch(IOException e)
      {
        System.out.println("Error: " + e.getMessage());
      }
    
  }
}
