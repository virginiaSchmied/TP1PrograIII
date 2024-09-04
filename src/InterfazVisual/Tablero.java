package InterfazVisual;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Presentador.Presentador;

public class Tablero extends JPanel {
	private Espacio[][] campo;
	private ArrayList<Espacio> tableroCompleto;
	private int dimension, x, y, anchoPieza, altoPieza;
	private Presentador presentador;
	private int tamanio;

	public Tablero(int dimension, int tamanio) {
		this.dimension = dimension;
		this.x = 0;
		this.y = 0;
		this.campo = new Espacio[dimension][dimension];
		this.tamanio = tamanio;
		this.setBackground(Color.black);
		this.presentador = new Presentador();
		
		//Configuracion para acomodar las piezas dentro de la pantalla
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		this.tableroCompleto = presentador.solicitarTablero(dimension, tamanio);
	}
	
	private void Remover(){
		this.removeAll();
		Actualizar();
	}
	
	private void Actualizar() {
		for (int i=0; i < dimension; i++) {
			for (int j=0; j < dimension; j++) {
				if (campo[i][j].getPieza() == null) {
					JLabel vacia = new JLabel();
					vacia.setPreferredSize(new Dimension(tamanio/dimension, tamanio/dimension));
					this.add(vacia);
				}
				else {
					
				}
			}
		}
	}
}

