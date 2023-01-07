package Polimorfismo;

public class Aula {
	private int ident_num; //IDENTIFICADOR NUMÉRICO ALEATORIO
	private int max_est; //MÁXIMO DE ESTUDIANTES
	private int materia; //1-MATEMÁTICAS   2-PROGRAMACIÓN   3-CONTABILIDAD
	
	public Aula(){
		//CONSTRUCTOR VACÍO
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
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM