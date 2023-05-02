package _03ejercicios._04gestorvuelos;

import _02ejemplos._01Tiempo.Tiempo;

public class Vuelo {
	private String identificador;
	private String origen;
	private String destino;
	private Tiempo horaSalida;
	private Tiempo horaLlegada;
	private int capacidad;
	private int numReservas;
	private Pasajero[] pasaje;
	
	public Vuelo (String id, String org, String dst, Tiempo hSal, Tiempo hLleg, int cap) {
		identificador = id;
		origen = org;
		destino = dst;
		horaSalida = hSal;
		horaLlegada = hLleg;
		capacidad = cap;
		
		numReservas = 0;
		pasaje = new Pasajero[capacidad + 1];
		
	}
	
	public boolean hayLibres() {
		if(numReservas < capacidad) {
			return true;
		} else {
			return false;
		}
		//return numReservas < capacidad;
	}
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!( o instanceof Vuelo)) return false;
		return this.identificador.equals(((Vuelo)o).identificador);
	}
	public int reservarAsiento(String nombrePasajero, String nifPasajero) {
		if(!hayLibres()) {
			return 0;
		} else {
			//Creamos el pasajero que insertaremos en el array
			Pasajero p = new Pasajero(nifPasajero, nombrePasajero);
			//Comprobamos que p no esta ya entre el pasaje
			for (int i = 1; i < pasaje.length; i++) {
				if(pasaje[i] != null && pasaje[i].equals(p)) {
					throw new IllegalArgumentException("El pasajero ya tiene una reserva");
				}
			}
			
			//Obtenemos posicicion libre aleatoriamente
			int posicion;
			do {
				posicion = (int) (Math.random() * capacidad) + 1; 
			} while(pasaje[posicion] != null);
			
			//Guardamos al pasajero en pasaje
			pasaje[posicion] = p;
			numReservas++;
			
			//Devolvemos el asiento asignado
			return posicion;
		}
	}
	public int reservarAsiento(String nombrePasajero, String nifPasajero, char preferencia) {
		if(!hayLibres()) {
			return 0;
		} else {
			//Creamos el pasajero que insertaremos en el array
			Pasajero p = new Pasajero(nifPasajero, nombrePasajero);
			//Comprobamos que p no esta ya entre el pasaje

			for (int i = 1; i < pasaje.length; i++) {
				if(pasaje[i] != null && pasaje[i].equals(p)) {
					throw new IllegalArgumentException("El pasajero ya tiene una reserva");
				}
			}
			
			//Obtenemos posicicion libre aleatoriamente
			int posicion = 0;
			if(preferencia == 'V') {
				for (int i = 1; i < pasaje.length && posicion == 0; i += 2) {
					if(pasaje[i] == null) {
						posicion = i;
					}
				}
				//Por si no ha encontrado ventanilla
				for (int i = 2; i < pasaje.length && posicion == 0; i += 2) {
					if(pasaje[i] == null) {
						posicion = i;
					}
				}
			} else {
				for (int i = 2; i < pasaje.length && posicion == 0; i += 2) {
					if(pasaje[i] == null) {
						posicion = i;
					}
				}
				//Por si no ha encontrado pasillo
				for (int i = 1; i < pasaje.length && posicion == 0; i += 2) {
					if(pasaje[i] == null) {
						posicion = i;
					}
				}
			}
			
			
			//Guardamos al pasajero en pasaje
			pasaje[posicion] = p;
			numReservas++;
			
			//Devolvemos el asiento asignado
			return posicion;
		}
	}
	public void cancelarReserva(int numAsiento) {
		if(pasaje[numAsiento] == null) 
			throw new IllegalArgumentException("El asiento no está reservado");
		else {
			pasaje[numAsiento] = null;
			numReservas --;
		}
	}
	public String toString() {
		String resultado = identificador + " - " + origen + " - " + destino 
				+ " - " + horaSalida/*.toString()*/ + " - " + horaLlegada/*.toString()*/ 
				+ "\nPasajeros:\n";
		for (int i = 1; i < pasaje.length; i++) {
			if(pasaje[i] != null) {
				resultado += "\nAsiento " + i + ": " + pasaje[i] /*.toString()*/;
			}
		}
		return resultado;
	}
}
