package POO;

public class CuentaBancaria {
	private int Clave_de_Cuenta;
	private String Nombre_del_Cliente;
	private String Domicilio;
	private double Saldo;
	
	CuentaBancaria(){
		//CONSTRUCTOR VACÍO
	}
	
	CuentaBancaria(int Cl, String Nom, String Dom, double S){
		Clave_de_Cuenta = Cl;
		Nombre_del_Cliente = Nom;
		Domicilio = Dom;
		Saldo = S;
	}

	public int getClave_de_Cuenta() {
		return Clave_de_Cuenta;
	}

	public void setClave_de_Cuenta(int clave_de_Cuenta) {
		Clave_de_Cuenta = clave_de_Cuenta;
	}

	public String getNombre_del_Cliente() {
		return Nombre_del_Cliente;
	}

	public void setNombre_del_Cliente(String nombre_del_Cliente) {
		Nombre_del_Cliente = nombre_del_Cliente;
	}

	public String getDomicilio() {
		return Domicilio;
	}

	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//PROGRAMACIÓN ORIENTADA A OBJETOS
//EXAMEN UNIDAD 2