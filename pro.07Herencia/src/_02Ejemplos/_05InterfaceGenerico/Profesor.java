package _02Ejemplos._05InterfaceGenerico;

public class Profesor implements Comparable<Profesor>{
	private String dni;
	private String nombre;
	
	public Profesor(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	@Override
	public int compareTo(Profesor o) {
		return this.dni.compareTo(o.dni);
	}
}
