package Polimorfismo;

public class Aula {
	private int ident_num; //IDENTIFICADOR NUM�RICO ALEATORIO
	private int max_est; //M�XIMO DE ESTUDIANTES
	private int materia; //1-MATEM�TICAS   2-PROGRAMACI�N   3-CONTABILIDAD
	
	public Aula(){
		//CONSTRUCTOR VAC�O
	}
	
	public Aula(int ident_num, int max_est, int materia){
		this.ident_num = ident_num;
		this.max_est = max_est;
		this.materia = materia;
	}

	public int getIdent_num() {
		return ident_num;
	}

	public void setIdent_num(int ident_num) {
		this.ident_num = ident_num;
	}

	public int getMax_est() {
		return max_est;
	}

	public void setMax_est(int max_est) {
		this.max_est = max_est;
	}

	public int getMateria() {
		return materia;
	}

	public void setMateria(int materia) {
		this.materia = materia;
	}
}
//JOS� ALFREDO GARC�A AGUILAR
//CLASE 4-5 PM