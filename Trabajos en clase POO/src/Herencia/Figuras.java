package Herencia;

public class Figuras {
	private String Nombre;
	private int GrosorBorde;
	private String Color;
	
	public Figuras(){
		//CONSTRUCTOR VAC�O
	}
	
	public Figuras(String N, int G, String C){
		//CONTRUCTOR CON PAR�METROS
		Nombre=N;
		GrosorBorde=G;
		Color=C;
	}
	//INTERFACES

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getGrosorBorde() {
		return GrosorBorde;
	}

	public void setGrosorBorde(int grosorBorde) {
		GrosorBorde = grosorBorde;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
}