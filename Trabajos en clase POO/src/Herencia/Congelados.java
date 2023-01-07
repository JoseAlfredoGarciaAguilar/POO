package Herencia;

public class Congelados extends EmpresaAgro {
	private String Fecha_Env; //FECHA DE ENVASADO
	private String Pais; //PA�S DE ORIGEN
	private double Temp; //TEMPERATURA DE MANTENIMIENTO RECOMENDADA EN GRADOS C�
	
	public Congelados() {
		//CONSTRUCTOR VAC�O
	}
	
	//SE USA PARA LLENAR LOS PRODUCTOS CONGELADOS
	public Congelados(String Fecha_Cadu, String Lote, String Fecha_Env, String Pais, double Temp){
		super(Fecha_Cadu, Lote);
		this.Fecha_Env = Fecha_Env;
		this.Pais = Pais;
		this.Temp = Temp;
	}

	public String getFecha_Env() {
		return Fecha_Env;
	}

	public void setFecha_Env(String fecha_Env) {
		Fecha_Env = fecha_Env;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public double getTemp() {
		return Temp;
	}

	public void setTemp(double temp) {
		Temp = temp;
	}
}
//JOS� ALFREDO GARC�A AGUILAR
//CLASE 4-5 PM