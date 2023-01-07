package Polimorfismo;
import javax.swing.JOptionPane;
import POO.Leer;
import javax.swing.JOptionPane;
//SE PIDEN LOS DATOS DE UN CUADRADO Y UN CÍRCULO, Y SE IMPRIME SU NOMBRE, SU ÁREA Y SU PERÍMETRO
public class UsoClaseAbstracta {

	public static void main(String[] args) {
		int sn=0;
		Circulo Cir = new Circulo();
		DCir Circulo = new DCir(50);
		int radio=0;
		String in = System.getProperty("line.separator");
		
		radio = Integer.parseInt(JOptionPane.showInputDialog("INGRESA LA LONGITUD DEL RADIO PARA EL CÍRCULO: "));
		
		Cir = new Circulo("CIRCULO",2,5,radio);
		
		System.out.println();
		System.out.println("-ESTOS SON LOS DATOS DE LAS FIGURAS-");
		
		System.out.println();
		System.out.println("NOMBRE: CÍRCULO. COLOR: VERDE. GROSOR DEL BORDE: 1");
		System.out.println("SU ÁREA ES: " + Cir.CalcularArea() + " Y SU PERÍMETRO ES " + Cir.CalcularPerimetro());
		System.out.println("ASÍ SE DIBUJAR EL CÍRCULO");
		Circulo.Dibujar();
	}
}