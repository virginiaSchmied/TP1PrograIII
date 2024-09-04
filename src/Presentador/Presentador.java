package Presentador;
import java.util.ArrayList;
import InterfazVisual.Espacio;
import Modelo.Modelo;

public class Presentador {
	
	private static Modelo modelo = new Modelo();
	
	public ArrayList<Espacio> solicitarTablero(int dimension, int tamanio) {
		return modelo.crearTablero(dimension, tamanio);
	}
}
