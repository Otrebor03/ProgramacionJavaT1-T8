package _03ejercicios._06contrarreloj;

import _02ejemplos._01Tiempo.Tiempo;

public class Corredor implements Comparable<Corredor> {
	private static int siguienteDorsal = 1;
	
	private int dorsal;
	private String nombre;
	private Tiempo salida;
	private Tiempo llegada;

	public Corredor(int dorsal, String nombre, Tiempo salida) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.salida = salida;
	}

	public int getDorsal() {
		return dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public Tiempo getSalida() {
		return salida;
	}

	public Tiempo getLlegada() {
		return llegada;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSalida(Tiempo salida) {
		this.salida = salida;
	}

	public void setLlegada(Tiempo llegada) {
		// if(salida > llegada)
		if (salida.compareTo(llegada) > 0) {
			throw new IllegalArgumentException();
		}
		this.llegada = llegada;
	}
	public int getDuracion() {
		if(llegada == null) {
			throw new UnsupportedOperationException();
		}
		
		return (llegada.getHora() * 3600 
				+ llegada.getMinuto() * 60 
				+ llegada.getSegundo()) 
				- 
				(salida.getHora() * 3600 
				+ salida.getMinuto() * 60 
				+ salida.getSegundo());
	}
	
	@Override
	public String toString() {
		String res = "(" + dorsal + ") -" + nombre + " - Salida: " + salida;
		if(llegada != null) {
			res += " - Llegada: " + llegada + " - Duracion: " + getDuracion();
		}
		return res;
	}

	@Override 
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Corredor)) return false;
		
		Corredor c = (Corredor) o;
		return this.dorsal == c.dorsal;
	}
	
	
	@Override
	public int compareTo(Corredor c) {
		return this.dorsal - c.dorsal;
	}
	
	public static int generarDorsal() {
//		int res = siguienteDorsal;
//		siguienteDorsal ++;
//		return res;
		
		// O lo que es lo mismo
		return siguienteDorsal++;
	}
	
	
	
	
	
	
}
