package _02Ejemplos._04Generoicidad;

import java.util.ArrayList;

public class EquipoBasket <T> {
	private String nombre;
	private ArrayList<T> plantilla;
	
	public EquipoBasket(String nombre) {
		this.nombre = nombre;
		this.plantilla = new ArrayList<>();
	}
	
	public void fichar(T j) {
		if(plantilla.contains(j)) {
			throw new IllegalArgumentException("Jugador ya existe");
		}else {
			this.plantilla.add(j);
		}
	}
	
	public String toString() {
		String res = nombre;
		for(T j:plantilla) {
			res+="\n"+j;
		}
		return res;
	}
}
