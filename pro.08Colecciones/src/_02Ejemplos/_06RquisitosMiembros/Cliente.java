package _02Ejemplos._06RquisitosMiembros;

public class Cliente implements Comparable<Cliente>{
	private String dni;
	private String nombre;
	
	public Cliente(String dni, String nombre) {
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
		if(!(o instanceof Cliente)) return false;
		return this.dni.equals(((Cliente)o).dni);
	}
	
	@Override
	public int compareTo(Cliente o) {
		return this.dni.compareTo(o.dni);
	}


	
}
