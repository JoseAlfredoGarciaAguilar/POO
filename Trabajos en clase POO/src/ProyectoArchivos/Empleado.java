package ProyectoArchivos;

import java.io.Serializable;

public class Empleado extends Persona implements Serializable {
	private char tipo; // TIPO DE EMPLEADO B=BASE E=EVENTUAL
	private int pago; // PAGO POR HORA
	private int horas; // HORAS DE TRABAJO
	private int total; // TOTAL A PAGAR

	public Empleado() {
		// CONSTRUCTOR VACÍO
	}

	public Empleado(String nombre, int edad, char sexo, char tipo, int pago, int horas, int total) {
		super(nombre, edad, sexo);
		this.tipo = tipo;
		this.pago = pago;
		this.horas = horas;
		this.total = total;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getPago() {
		return pago;
	}

	public void setPago(int pago) {
		this.pago = pago;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM