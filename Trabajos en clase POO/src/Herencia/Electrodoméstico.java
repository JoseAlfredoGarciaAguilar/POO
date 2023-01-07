package Herencia;

public class Electrodom�stico {
	private double precio;
	private String color;
	private char consumo;
	private double peso;
	
	public Electrodom�stico(){
		//CONSTRUCTOR VAC�O
	}
	
	public Electrodom�stico(double pre, double pes){
		pre=precio;
		pes=peso;
	}

	public Electrodom�stico(double pre, String col, char con, double pes) {
		pre=precio;
		col=color;
		con=consumo;
		pes=peso;
	}
	
	public double getPrecio() {
		return precio;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo() {
		return consumo;
	}

	public double getPeso() {
		return peso;
	}

	//COMPRUEBA QUE NO SE REPITA NING�N CONSUMO ENERG�TICO
	public void ComprobarConsumoEnerg�tico(){
		if(consumo!='A' && consumo!='B' && consumo!='C' && consumo!='D' && consumo!='E' && consumo!='F'){
			consumo='F';
		}
	}
	
	public String ComprobarColor(String color){
		if(color!="BLANCO" && color!="NEGRO" && color!="ROJO" && color!="AZUL" && color!="GRIS"){
			color="BLANCO";
		}
		return color;
	}
	
	public int PrecioFinal(){
		if(consumo=='A'){
			precio+=100;
		}
		else if(consumo=='B'){
			precio+=80;
		}
		else if(consumo=='C'){
			precio+=60;
		}
		else if(consumo=='D'){
			precio+=50;
		}
		else if(consumo=='E'){
			precio+=30;
		}
		else if(consumo=='F'){
			precio+=10;
		}
		else if(peso>=0 && peso<=19){
			precio+=10;
		}
		else if(peso>=20 && peso<=49){
			precio+=50;
		}
		else if(peso>=50 && peso<=79){
			precio+=80;
		}
		else if(precio>=80){
			precio+=100;
		} 
		
		return (int) precio;
	}
}
//JOS� ALFREDO GARC�A AGUILAR
//CLASE 4-5 PM