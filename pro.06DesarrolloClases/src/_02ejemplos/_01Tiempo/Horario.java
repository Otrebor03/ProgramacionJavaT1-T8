package _02ejemplos._01Tiempo;

import java.util.ArrayList;
import java.util.Collections;

public class Horario {
	private String descripcion;
	private ArrayList<Tiempo> franjas;
	
	//Constructor:
	/**
	 * Se crea un horario con la descripcion indicada y sin franjas
	 * horarias
	 * @param descripcion
	 */
	public Horario(String descripcion) {
		this.descripcion = descripcion;
		//Creamos el ArrayList<Tiempo> pero lo dejamos vacío
		this.franjas  = new ArrayList<>();
	}
	//Getter y Setter de la descripcion. 
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	//El atributo franjas NO va a tener getter ni setter
	
	/**
	 * Añade una franja al horario de forma que las franjas
	 * queden ordenadas cronológicamente.
	 * No habrá franjas duplicadas
	 * @param t
	 */
	public void anyadirFranja(Tiempo t) {
		if(!franjas.contains(t)) {
			franjas.add(t);
			Collections.sort(franjas);
		}
	}
	
	public void anyadirFranja(int hora, int minuto) {
		Tiempo t = new Tiempo(hora,minuto,0);
		if(!franjas.contains(t)) {
			franjas.add(t);
			Collections.sort(franjas);
		}
	}
	
	@Override 
	public String toString() {
		String res = "Horario " + descripcion;
		for(int i = 0; i < franjas.size() ; i++) {
			res += "\n   " + franjas.get(i);
		}
		return res;
	}

}
