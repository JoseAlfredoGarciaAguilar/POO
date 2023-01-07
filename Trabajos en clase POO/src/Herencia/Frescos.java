package Herencia;

public class Frescos extends EmpresaAgro {
	private String Fecha_Env; //FECHA DE ENVASADO
	private String Pais; //PA�S DE ORIGEN
	
	public Frescos() {
		//CONSTRUCTOR VAC�O
	}
	
	//SE USA PARA LLENAR LOS PRODUCTOS FRESCOS
	public Frescos(String Fecha_Cadu, String Lote, String Fecha_Env, String Pais) {
		super(Fecha_Cadu, Lote);
		this.Fecha_Env = Fecha_Env;
		this.Pais = Pais;
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

	//SE IMPRIMEN LOS PRODUCTOS FRESCOS
	public String ToStringFrescos() {
		String mensaje = "FECHA DE CADUCIDAD: " + getFecha_Cadu() + ".  LOTE: " + getLote() + ".  FECHA DE ENVASADO: " + getFecha_Env() + ".  PA�S DE ORIGEN: " + getPais();
		return mensaje;
	}
}
//JOS� ALFREDO GARC�A AGUILAR
//CLASE 4-5 PM