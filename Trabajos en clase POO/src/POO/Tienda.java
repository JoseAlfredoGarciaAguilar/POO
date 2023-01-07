package POO;

public class Tienda {
	private int TotalDulces;
	private int TotalAbarrotes;
	private int TotalBebidas;
	private int TotalLacteos;
	
	Tienda(){
		//CONSTRUCTOR VACÍO
	}
	
	Tienda(int Dul, int Aba, int Beb, int Lac){
		TotalDulces=Dul;
		TotalAbarrotes=Aba;
		TotalBebidas=Beb;
		TotalLacteos=Lac;
	}

	public int getTotalDulces() {
		return TotalDulces;
	}

	public void setTotalDulces(int totalDulces) {
		TotalDulces = totalDulces;
	}

	public int getTotalAbarrotes() {
		return TotalAbarrotes;
	}

	public void setTotalAbarrotes(int totalAbarrotes) {
		TotalAbarrotes = totalAbarrotes;
	}

	public int getTotalBebidas() {
		return TotalBebidas;
	}

	public void setTotalBebidas(int totalBebidas) {
		TotalBebidas = totalBebidas;
	}

	public int getTotalLacteos() {
		return TotalLacteos;
	}

	public void setTotalLacteos(int totalLacteos) {
		TotalLacteos = totalLacteos;
	}
}