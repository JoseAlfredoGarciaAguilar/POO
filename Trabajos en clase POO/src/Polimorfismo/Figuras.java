package Polimorfismo;

public abstract class Figuras {
	private String Nombre;
	private int GrosorBorde;
	private int Color;
	
	public Figuras(){
		//CONSTRUCTOR VAC�O
	}
	
	public Figuras(String N, int C, int G){
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
	
	public int getColor() {
		return Color;
	}

	public void setColor(int color) {
		Color = color;
	}

	public abstract void Dibujar();
	
	public abstract int CalcularArea();
	
	public abstract int CalcularPerimetro();
}