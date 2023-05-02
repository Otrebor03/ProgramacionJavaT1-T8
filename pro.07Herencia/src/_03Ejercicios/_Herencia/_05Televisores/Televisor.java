package _03Ejercicios._Herencia._05Televisores;

public abstract class Televisor implements Comparable<Televisor>{
	private String marca;
	private String modelo;
	private double precio;
	private double pulgadas;
	
	public Televisor(String marca, String modelo, double precio, double pulgadas) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.pulgadas = pulgadas;
	}
	
	@Override 
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Televisor)) return false;
		
		Televisor t = (Televisor) o;
		return this.marca == t.marca && this.modelo == t.modelo;
		
	}

	@Override
	public int compareTo(Televisor t) {
		if(this.marca.compareTo(t.marca)<0) return -1;
		else if(this.marca.compareTo(t.marca)>0) return 1;
		else if(this.modelo.compareTo(t.modelo)<0) return -1;
		else if(this.modelo.compareTo(t.modelo)>0) return 1;
		else return 0;
	}

	public abstract String calculoResolucion();
	
	public String toString() {
		return "Marca: "+marca+" - Modelo: "+modelo+" - Precio: "+precio+" - Pulgadas: "+pulgadas+" - Resolucion: "+calculoResolucion();
	}
}
