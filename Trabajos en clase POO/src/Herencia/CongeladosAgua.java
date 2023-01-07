package Herencia;

public class CongeladosAgua extends Congelados {
	public double Sal; //SALINIDAD DEL AGUA CON QUE SE HIZO LA CONGELACIÓN EN GRAMOS DE SAL POR LITROS DE AGUA
	
	public CongeladosAgua(){
		//CONSTRUCTOR VACÍO
	}
	
	//SE USA PARA LLENAR SOLO LOS PRODUCTOS CONGELADOS POR AGUA
	public CongeladosAgua(String Fecha_Cadu, String Lote, String Fecha_Env, String Pais, double Temp, double Sal){
		super(Fecha_Cadu, Lote, Fecha_Env, Pais, Temp);
		this.Sal = Sal;
	}

	public double getSal() {
		return Sal;
	}

	public void setSal(double sal) {
		Sal = sal;
	}
	
	//SE IMPRIMEN SOLO LOS PRODUCTOS CONGELADOS POR AGUA
	public String ToStringCongeAgua() {
		String mensaje = "FECHA DE CADUCIDAD: " + getFecha_Cadu() + ".  LOTE: " + getLote() + ".  FECHA DE ENVASADO: " + getFecha_Env() + 
				".  PAÍS DE ORIGEN: " + getPais() + ".  TEMPERATURA RECOMENDADA: " + getTemp() + " GRADOS C°\nSALINIDAD (GRAMOS DE SAL POR LITRO DE AGUA): " + getSal() + " G/LT";
		return mensaje;
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM