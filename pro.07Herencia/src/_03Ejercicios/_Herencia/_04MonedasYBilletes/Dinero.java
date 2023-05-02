package _03Ejercicios._Herencia._04MonedasYBilletes;

public abstract class Dinero implements Comparable<Dinero>{
	private double valor;
	private int anyo;
	
	public Dinero(double valor, int anyo) {
		this.valor = valor;
		this.anyo = anyo;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Dinero)) return false;
		
		Dinero d = (Dinero) o;
		
		return this.valor == d.valor && this.anyo == d.anyo;
	}
	
	@Override
	public int compareTo(Dinero d) {
		if(this.anyo<d.anyo) return -1;
		else if(this.anyo>d.anyo) return 1;
		else if(this.valor<d.valor) return -1;
		else if(this.valor>d.valor) return 1;
		else return 0;
		
	}
	
	@Override
	public String toString() {
		return "Valor: "+valor+" - Anyo: "+anyo;
	}
}
