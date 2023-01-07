package Herencia;

public class Televisión extends Electrodoméstico {
	private double resolucion=20;
	private boolean sintonizadorTDT=false;
	
	public Televisión() {
		//CONTRUCTOR VACÍO
	}
	
	public Televisión(double pre, double pes){
		super(pre, pes);
	}
	
	public Televisión(double resol, boolean sinto){
		super(100,"BLANCO",'F',5);
		resol=resolucion;
		sinto=sintonizadorTDT;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean SintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	public double PrecioFinal(double precio) {
		if(resolucion>40) {
			precio=precio+(precio*0.3);
		}
		if(sintonizadorTDT=true) {
			precio=precio+50;
		}
		return precio;
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM