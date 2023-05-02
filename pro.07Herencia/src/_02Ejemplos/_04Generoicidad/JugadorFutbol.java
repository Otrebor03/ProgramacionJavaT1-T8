package _02Ejemplos._04Generoicidad;

public class JugadorFutbol {
	private String nombre;
	private int dorsal;
	private int goles;
	
	public JugadorFutbol(String nombre, int dorsal, int goles) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.goles = goles;
	}
	
	@Override
	public String toString() {
		return nombre+" - "+dorsal+" - "+goles;
	}
}
