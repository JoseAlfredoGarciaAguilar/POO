package Herencia;

public class Inventario extends Articulos {
	private int cant_vend; //CANTIDAD VENDIDA
	private int cant_compr; //CANTIDAD COMPRADA
	
	public Inventario() {
		//CONSTRUCTOR VACÍO
	}
	
	public Inventario(int clave_art, String descr, int exis, double prec_uni, int cant_compr, int cant_vend) {
		super(clave_art, descr, exis, prec_uni);
		this.cant_vend = cant_vend;
		this.cant_compr = cant_compr;
	}
	
	public int getCant_vend() {
		return cant_vend;
	}

	public void setCant_vend(int cant_vend) {
		this.cant_vend = cant_vend;
	}

	public int getCant_compr() {
		return cant_compr;
	}

	public void setCant_compr(int cant_compr) {
		this.cant_compr = cant_compr;
	}
	}