package Herencia;

public class CongeladosNitrogeno extends Congelados {
	public String Metodo; //M�TODO DE CONGELACI�N EMPLEADO
	public double Tiempo; //TIEMPO DE EXPOSICI�N AL NITR�GENO EN SEGUNDOS
	
	public CongeladosNitrogeno(){
		//CONSTRUCTOR VAC�O
	}
	
	//SE USA PARA LLENAR SOLO LOS PRODUCTOS CONGELADOS POR NITR�GENO
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

	//SE IMPRIMEN SOLO LOS PRODUCTOS CONGELDOS POR NITR�GENO
	public String ToStringCongeNitrogeno() {
		String mensaje = "FECHA DE CADUCIDAD: " + getFecha_Cadu() + ".  LOTE: " + getLote() + ".  FECHA DE ENVASADO: " + getFecha_Env() + 
				".  PA�S DE ORIGEN: " + getPais() + ".  TEMPERATURA RECOMENDADA: " + getTemp() + " GRADOS C�\nM�TODO DE CONGELACI�N EMPLEADO: " + getMetodo() + ". \nTIEMPO DE EXPOSICI�N AL NITR�GENO: " + getTiempo() + " SEGUNDOS";
		return mensaje;
	}
}
//JOS� ALFREDO GARC�A AGUILAR
//CLASE 4-5 PM