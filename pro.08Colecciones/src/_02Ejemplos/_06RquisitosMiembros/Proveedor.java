package _02Ejemplos._06RquisitosMiembros;

public class Proveedor implements Comparable<Proveedor>{
	private String dni;
	private String nombre;
	
	public Proveedor(String dni, String nombre) {
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
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Proveedor)) return false;
		return this.dni.equals(((Proveedor)o).dni);
	}
	
	@Override
	public int hashCode() {
		return this.dni.hashCode();
	}
	
	@Override
	public int compareTo(Proveedor c) {
		return this.dni.compareTo(c.dni);
	}
}
