package _02Ejemplos._04Generoicidad;

import java.util.ArrayList;

public class EquipoFutbol {
	private String nombre;
	private ArrayList<JugadorFutbol> plantilla;
	
	public EquipoFutbol(String nombre) {
		this.nombre = nombre;
		this.plantilla = new ArrayList<>();
	}
	
	public void fichar(JugadorFutbol j) {
		if(plantilla.contains(j)) {
			throw new IllegalArgumentException("Jugador ya existe");
		}else {
			this.plantilla.add(j);
		}
	}
	
	public String toString() {
		String res = nombre;
		for(JugadorFutbol j:plantilla) {
			res+="\n"+j;
		}
		return res;
	}
}
