package POO;

public class Punto {
	private int x=0;
	private int y=0;
	public static int totalPuntos=0;
	Punto(){
		//Constructor Vac�o inicializa el objeto al momento de crearlo
	}
	Punto(int x1, int y1){  //Constructor con Par�metros
		x=x1;
		y=y1;
		totalPuntos++;
		}
	public void setx(int x1){
		x=x1;
		}
	public int LeeYe(){
		return y;
		}
	public String toString(){
		return "("+x+","+y+")";
	}
	public int LeeX(){
		return x;
	}
}
//JOS� ALFREDO GARC�A AGUILAR