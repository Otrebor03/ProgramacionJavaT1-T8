package _03Ejercicios._Herencia._07Amarres;

public class Barco {
	private String matricula;
	private double eslora;
	private int anyo;
	
	
	public Barco(String m, double e, int a) {
		this.matricula = m;
		this.eslora = e;
		this.anyo = a;
	}
	
	public double gatcalculoAlquiler() {
		return 2*eslora;
	}
	
	public String toString() {
		return "Matricula: "+matricula+" - Eslora: "+eslora+" - Anyo: "+anyo;
	}
	
	
}
