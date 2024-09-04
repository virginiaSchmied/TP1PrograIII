package InterfazVisual;

public class Espacio {
	private int x, y;
	private Pieza pieza;
	
//	Piezas comunes
	public Espacio(int x, int y, Pieza pieza) {
		this.x = x;
		this.y = y;
		this.pieza = pieza;
	}
	
//	Pieza vacia
	public Espacio(int x, int y) {
		this.x = x;
		this.y = y;
		this.pieza = null;
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


	public Pieza getPieza() {
		return pieza;
	}


	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

}
