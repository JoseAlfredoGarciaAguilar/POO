package Herencia;

public class Articulos {
	private int clave_art; //CLAVE DEL ARTÍCULO
	private String descr; //DESCRIPCIÓN
	private int exis; //CUANTOS HAY EN EL INVENTARIO
	private double prec_uni; //PRECIO UNITARIO
	
	public Articulos() {
		//CONSTRUCTOR VACÍO
	}
	
	public Articulos(int clave_art, String descr, int exis, double prec_uni) {
		super();
		this.clave_art = clave_art;
		this.descr = descr;
		this.exis = exis;
		this.prec_uni = prec_uni;
	}

	public int getClave_art() {
		return clave_art;
	}

	public void setClave_art(int clave_art) {
		this.clave_art = clave_art;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public int getExis() {
		return exis;
	}

	public void setExis(int exis) {
		this.exis = exis;
	}

	public double getPrec_uni() {
		return prec_uni;
	}

	public void setPrec_uni(double prec_uni) {
		this.prec_uni = prec_uni;
	}
}