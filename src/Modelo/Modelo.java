package Modelo;
import java.util.ArrayList;
import InterfazVisual.Espacio;
import InterfazVisual.Pieza;

public class Modelo {
	
	public Modelo() {
		
	}
	
	public ArrayList<Espacio> crearTablero(int dimension, int tamanio){
		ArrayList<Espacio> tablero = new ArrayList<Espacio>();
		Integer contador = 1;
		int tamanioPieza = tamanio / dimension;
		for (int i=0; i < dimension; i++) {
			for (int j=0; j < dimension; j++) {
				if (i != dimension -1 && j != dimension -1) {
					if (contador == (dimension * dimension)-1) {
						tablero.add(new Espacio(i,j, new Pieza(i, j, contador.toString(), tamanioPieza, true)));
					}
					else {
						tablero.add(new Espacio(i,j, new Pieza(i, j, contador.toString(), tamanioPieza, false )));
					}
					contador++;
				}
			}
		}
		return tablero;
	}
}
