package Polimorfismo;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class DCir extends JPanel {
	private int radio;
	
	public DCir(){
		
	}
	
	public DCir(int radio){
		this.radio=radio;
	}
	
	public void Dibujo(){
		repaint();
	}
	
	public void PaintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		g.drawOval(500, 150, radio*2, radio*2);
	}
	
	public void Dibujar(){
		JFrame frame = new JFrame("CIRCULO");
		frame.setVisible(true);
		frame.setSize(400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DCir Dibujo = new DCir((int)radio);
		frame.add(Dibujo);
	}
}