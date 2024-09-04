package InterfazVisual;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Pieza extends JButton implements ActionListener{

	private int x, y;
	private final int xCorrecta, yCorrecta;
	private boolean vacia;
	
	public Pieza (int xCorrecta, int yCorrecta, String num, int tamanio, boolean vacio) {
		this.xCorrecta = xCorrecta;
		this.yCorrecta = yCorrecta;
		this.x = xCorrecta;
		this.y = yCorrecta;
		this.setText(num);
		this.setPreferredSize(new Dimension(tamanio, tamanio));
		
		if (!vacia) {
			this.setBackground(Color.pink);
		}
		else {
			this.setBackground(Color.black);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getxCorrecta() {
		return xCorrecta;
	}
	public int getyCorrecta() {
		return yCorrecta;
	}
	

}
