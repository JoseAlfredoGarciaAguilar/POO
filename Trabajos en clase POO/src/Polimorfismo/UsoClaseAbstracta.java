package Polimorfismo;
import javax.swing.JOptionPane;
import POO.Leer;
import javax.swing.JOptionPane;
//SE PIDEN LOS DATOS DE UN CUADRADO Y UN C�RCULO, Y SE IMPRIME SU NOMBRE, SU �REA Y SU PER�METRO
public class UsoClaseAbstracta {

	public static void main(String[] args) {
		int sn=0;
		Circulo Cir = new Circulo();
		DCir Circulo = new DCir(50);
		int radio=0;
		String in = System.getProperty("line.separator");
		
		radio = Integer.parseInt(JOptionPane.showInputDialog("INGRESA LA LONGITUD DEL RADIO PARA EL C�RCULO: "));
		
		Cir = new Circulo("CIRCULO",2,5,radio);
		
		System.out.println();
		System.out.println("-ESTOS SON LOS DATOS DE LAS FIGURAS-");
		
		System.out.println();
		System.out.println("NOMBRE: C�RCULO. COLOR: VERDE. GROSOR DEL BORDE: 1");
		System.out.println("SU �REA ES: " + Cir.CalcularArea() + " Y SU PER�METRO ES " + Cir.CalcularPerimetro());
		System.out.println("AS� SE DIBUJAR EL C�RCULO");
		Circulo.Dibujar();
	}
}