package _02Ejemplos._04Generoicidad;

import java.util.ArrayList;

public class EquipoGenerico {
	private String nombre;
	private ArrayList<Object> plantilla;
	
	public EquipoGenerico(String nombre) {
		this.nombre = nombre;
		this.plantilla = new ArrayList<>();
	}
	
	public void fichar(Object j) {
		if(plantilla.contains(j)) {
			throw new IllegalArgumentException("Jugador ya existe");
		}else {
			this.plantilla.add(j);
		}
	}
	
	public String toString() {
		String res = nombre;
		for(Object j:plantilla) {
			res+="\n"+j;
		}
		return res;
	}
}
