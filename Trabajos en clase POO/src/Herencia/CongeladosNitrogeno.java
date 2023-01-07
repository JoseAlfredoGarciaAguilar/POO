package Herencia;

public class CongeladosNitrogeno extends Congelados {
	public String Metodo; //MÉTODO DE CONGELACIÓN EMPLEADO
	public double Tiempo; //TIEMPO DE EXPOSICIÓN AL NITRÓGENO EN SEGUNDOS
	
	public CongeladosNitrogeno(){
		//CONSTRUCTOR VACÍO
	}
	
	//SE USA PARA LLENAR SOLO LOS PRODUCTOS CONGELADOS POR NITRÓGENO
	public CongeladosNitrogeno(String Fecha_Cadu, String Lote, String Fecha_Env, String Pais, double Temp, String Metodo, double Tiempo){
		super(Fecha_Cadu, Lote, Fecha_Env, Pais, Temp);
		this.Metodo = Metodo;
		this.Tiempo = Tiempo;
	}
	
	public String getMetodo() {
		return Metodo;
	}

	public void setMetodo(String metodo) {
		Metodo = metodo;
	}

	public double getTiempo() {
		return Tiempo;
	}

	public void setTiempo(double tiempo) {
		Tiempo = tiempo;
	}

	//SE IMPRIMEN SOLO LOS PRODUCTOS CONGELDOS POR NITRÓGENO
	public String ToStringCongeNitrogeno() {
		String mensaje = "FECHA DE CADUCIDAD: " + getFecha_Cadu() + ".  LOTE: " + getLote() + ".  FECHA DE ENVASADO: " + getFecha_Env() + 
				".  PAÍS DE ORIGEN: " + getPais() + ".  TEMPERATURA RECOMENDADA: " + getTemp() + " GRADOS C°\nMÉTODO DE CONGELACIÓN EMPLEADO: " + getMetodo() + ". \nTIEMPO DE EXPOSICIÓN AL NITRÓGENO: " + getTiempo() + " SEGUNDOS";
		return mensaje;
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM