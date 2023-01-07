package Herencia;

public class EmpresaAgro {
	private String Fecha_Cadu; //FECHA DE CADUCIDAD
	private String Lote; //NÚMERO DE LOTE
	
	public EmpresaAgro() {
		//CONSTRUCTOR VACÍO
	}
	
	//SE USA PARA LLENAR TODOS LOS PRODUCTOS
	public EmpresaAgro(String Fecha_Cadu, String Lote) {
		super();
		this.Fecha_Cadu = Fecha_Cadu;
		this.Lote = Lote;
	}

	public String getFecha_Cadu() {
		return Fecha_Cadu;
	}

	public void setFecha_Cadu(String fecha_Cadu) {
		Fecha_Cadu = fecha_Cadu;
	}

	public String getLote() {
		return Lote;
	}

	public void setLote(String lote) {
		Lote = lote;
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM