package _03ejercicios._04gestorvuelos;

public class Pasajero {
	private String dni;
	private String nombre;
	
	public Pasajero(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public String toString() {
		return dni + " - " + nombre;
	}
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Pasajero)) return false;
		return this.dni.equals(((Pasajero)o).dni);
	}
}
