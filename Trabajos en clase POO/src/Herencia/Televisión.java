package Herencia;

public class Televisi�n extends Electrodom�stico {
	private double resolucion=20;
	private boolean sintonizadorTDT=false;
	
	public Televisi�n() {
		//CONTRUCTOR VAC�O
	}
	
	public Televisi�n(double pre, double pes){
		super(pre, pes);
	}
	
	public Televisi�n(double resol, boolean sinto){
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
//JOS� ALFREDO GARC�A AGUILAR
//CLASE 4-5 PM