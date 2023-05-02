package _03ejercicios._02reservaslibreria;

public class Reserva implements Comparable<Reserva>{
	private String nif;
	private String nombre;
	private String telefono;
	private int codigo;
	private int ejemplares;

	public Reserva(String nif, String nombre, String telefono, int codigo, int ejemplares) {
		this.nif = nif;
		this.nombre = nombre;
		this.telefono = telefono;
		this.codigo = codigo;
		this.ejemplares = ejemplares;
	}

	public Reserva(String nif, String nombre, String telefono, int codigo) {
//		this.nif = nif;
//		this.nombre = nombre;
//		this.telefono = telefono;
//		this.codigo = codigo;
//		this.ejemplares = 1;

		// Puedo llamar a un constructor desde otro usando this(.......)
		// Tiene que ser la primera instruccion
		this(nif, nombre, telefono, codigo, 1); // Llama al constructor de 5 parámetros
	}

	public String getNif() {
		return nif;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	@Override
	public String toString() {
		return "Cliente: " + nif + " " + nombre + " " + telefono + " Libro: " + codigo
				+ " Ejemplares: " + ejemplares ;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(! (o instanceof Reserva)) return false;
		
		Reserva r = (Reserva) o;
		if(this.nif.equals(r.nif) && this.codigo == r.codigo) {
			return true;
		} else {
			return false;
		}
		// return this.nif.equals(r.nif) && this.codigo == r.codigo ;
	}

	@Override
	public int compareTo(Reserva r) {
		if(this.codigo < r.codigo) return -1;
		else if(this.codigo > r.codigo) return 1;
		else if(this.nif.compareTo(r.nif) < 0) return -1;
		else if(this.nif.compareTo(r.nif) > 0) return 1;
		else return 0;
	}

	//Se puede conseguir lo mismo de otra forma
	public int compareTo2(Reserva r) {
		if(this.codigo != r.codigo) return this.codigo - r.codigo;
		else return this.nif.compareTo(r.nif);
	}

}





