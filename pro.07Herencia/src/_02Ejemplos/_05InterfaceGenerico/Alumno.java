package _02Ejemplos._05InterfaceGenerico;

public class Alumno implements Comparable{
	private String dni;
	private String nombre;
	
	public Alumno(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Object o) {
		return this.dni.compareTo(((Alumno)o).dni);
	}
}
