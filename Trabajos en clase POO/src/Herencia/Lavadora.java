package Herencia;

public class Lavadora extends Electrodoméstico {
	private double carga;
	
	public Lavadora(){
		//CONSTRUCTOR VACÍO
	}
	
	public Lavadora(double pre, double pes){
		super(pre,"BLANCO", 'F', 5);
	}
	
	public Lavadora(double car){
		super(100,"BLANCO",'F',25);
		car=carga;
	}
	
	public double getCarga() {
		return carga;
	}

	public double PrecioFinal(double precio){
		if(carga>30){
			precio+=50;
		}
		return precio;
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM