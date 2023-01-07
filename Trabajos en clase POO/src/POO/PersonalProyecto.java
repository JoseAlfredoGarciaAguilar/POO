package POO;

public class PersonalProyecto {
	private String Nombre="";
	private int Edad=0;
	private String DNI;
	private char Sexo='H';
	private double Peso=0;
	private double Altura=0;
	
	PersonalProyecto(){
		//CONSTRUCTOR VACÍO (CONSTRUCTOR POR DEFECTO)
	}
	
	PersonalProyecto(String N, int E, char S){
		Nombre=N;
		Edad=E;
		Sexo=S;
	}
	
	PersonalProyecto(String N, int E, double P, char S, double A){
		Nombre=N;
		Edad=E;
		Peso=P;
		Sexo=S;
		Altura=A;
	}
	
	//CALCULA EL IMC DE LA PERSONA
	public int calcularIMC() {
		double imc = Peso / (Altura*Altura);
		int almacenar = 0;
		if(imc < 20) {
			almacenar=-1;
		}
		if(imc >= 20 && imc <= 25) {
			almacenar=0;
		}
		if(imc > 25) {
			almacenar=1;
		}
		return almacenar;
	}
	
	//DICE SI ES O NO ES MAYOR DE EDAD
	public boolean esMayorDeEdad() {
		boolean respuesta=false;
		if(Edad >= 18){
			respuesta=true;
		}
		return respuesta;
	}
	
	//COMPRUEBA QUE EL SEXO INTRODUCIDO ES CORRECTO
	public String comprobarSexo(){
		String respuesta="";
		if(Sexo=='H' || Sexo=='h'){
			respuesta="HOMBRE";
		}
		if(Sexo=='M' || Sexo=='m') {
			respuesta="MUJER";
		}
		else {
			respuesta="HOMBRE";
		}
		return respuesta;
	}
	
	//GENERA EL DNI
	public String generaDNI() {
		String[] DN = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		int R=(int)(Math.random()*1000);
		int Residuo = R/23;
		String DNI = R + DN[Residuo];
		return DNI;
	}
	
	//DEVUELVE TODA LA INFORMACIÓN DEL OBJETO
	public String toString(){
		return "    NOMBRE: " + Nombre + "    EDAD: " + Edad + " AÑOS.    SEXO: " + Sexo + ".    PESO: " + Peso + " KILOS.    ALTURA: " + Altura + " METROS";
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public void setSexo(char sexo) {
		Sexo = sexo;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM
//PROGRAMACIÓN ORIENTADA A OBJETOS
//MAESTRO: LUIS ESTEBAN LÓPEZ MENDOZA