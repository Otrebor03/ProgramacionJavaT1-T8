package _03Ejercicios._Herencia._07Amarres;

import java.util.Objects;

public class Cliente {
	private String dni;
	private String nombre;
	
	public Cliente(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		else if(!(o instanceof Cliente)) return false;
		
		Cliente c = (Cliente) o;
		return Objects.equals(dni, c.dni);
	}
	
	@Override
	public String toString() {
		return "Cliente: "+nombre+" - DNI: "+dni;
	}
}
