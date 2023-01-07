package Herencia;

public class CongeladosAire extends Congelados {
	//PORCENTAJES DE COMPOSICIÓN DEL AIRE CON QUE FUE CONGELADO
	private double Nitro; //NITRÓGENO EN PORCENTAJE
	private double Oxig; //OXÍGENO EN PORCENTAJE
	private double Diox; //DIÓXIDO DE CARBONO EN PORCENTAJE
	private double Vap; //VAPOR DE AGUA EN PORCENTAJE
	
	public CongeladosAire(){
		//CONSTRUCTOR VACÍO
	}
	
	//SE USA PARA LLENAR SOLO LOS PRODUCTOS CONGELADOS POR AIRE
	public CongeladosAire(String Fecha_Cadu, String Lote, String Fecha_Env, String Pais, double Temp, double Nitro, double Oxig, double Diox, double Vap){
		super(Fecha_Cadu, Lote, Fecha_Env, Pais, Temp);
		this.Nitro = Nitro;
		this.Oxig = Oxig;
		this.Diox = Diox;
		this.Vap = Vap;
	}
	
	public double getNitro() {
		return Nitro;
	}

	public void setNitro(double nitro) {
		Nitro = nitro;
	}

	public double getOxig() {
		return Oxig;
	}

	public void setOxig(double oxig) {
		Oxig = oxig;
	}

	public double getDiox() {
		return Diox;
	}

	public void setDiox(double diox) {
		Diox = diox;
	}

	public double getVap() {
		return Vap;
	}

	public void setVap(double vap) {
		Vap = vap;
	}

	//SE IMPRIMEN SOLO LOS PRODUCTOS CONGELADOS POR AIRE
	public String ToStringCongeAire() {
		String mensaje = "FECHA DE CADUCIDAD: " + getFecha_Cadu() + ".  LOTE: " + getLote() + ".  FECHA DE ENVASADO " + getFecha_Env() + 
				".  PAÍS DE ORIGEN: " + getPais() + ".  TEMPERATURA RECOMENDADA: " + getTemp() + " GRADOS C°\nCOMPOSICIÓN DEL AIRE CON QUE FUE CONGELADO: NITRÓGENO: " + getNitro() + "%.  OXÍGENO: " + getOxig() + "%.  DIÓXIDO DE CARBONO: " + getDiox() + "%.  VAPOR DE AGUA: " + getVap() + "%";
		return mensaje;
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM