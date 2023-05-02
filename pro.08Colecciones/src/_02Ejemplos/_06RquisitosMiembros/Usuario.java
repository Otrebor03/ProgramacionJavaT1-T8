package _02Ejemplos._06RquisitosMiembros;

import java.util.Objects;

public class Usuario {
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return this.dni.equals(other.dni);
	}

	private String dni;
	private String nombre;
	
	public Usuario(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return dni+ " - "+ nombre;
	}
	
}
