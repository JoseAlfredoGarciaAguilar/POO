package Herencia;

public class Refrigerados extends EmpresaAgro {
	private String Codigo; //CÓDIGO DEL ORGANISMO DE SUPERVISIÓN ALIMENTARIA
	private String Fecha_Env; //FECHA DE ENVASADO
	private double Temp; //TEMPERATURA DE MANTENIMIENTO RECOMENDADA
	
	public Refrigerados() {
		//CONSTRUCTOR VACÍO
	}
	
	//SE USA PARA LLENAR LOS PRODUCTOS REFRIGERADOS
	public Refrigerados(String Fecha_Cadu, String Lote, String Codigo, String Fecha_Env, double Temp) {
		super(Fecha_Cadu, Lote);
		this.Codigo = Codigo;
		this.Fecha_Env = Fecha_Env;
		this.Temp = Temp;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getFecha_Env() {
		return Fecha_Env;
	}

	public void setFecha_Env(String fecha_Env) {
		Fecha_Env = fecha_Env;
	}

	public double getTemp() {
		return Temp;
	}

	public void setTemp(double temp) {
		Temp = temp;
	}
	
	//SE IMPRIMEN LOS PRODUCTOS REFRIGERADOS
	public String ToStringRefrigerados() {
		String mensaje = "FECHA DE CADUCIDAD: " + getFecha_Cadu() + ".  LOTE: " + getLote() + ".  CÓDIGO DE ORGANISMO: " + getCodigo() + ".  FECHA DE ENVASADO: " + getFecha_Env() +
				".  TEMPERATURA RECOMENDADA: " + getTemp() + " GRADOS C°";
		return mensaje;
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM