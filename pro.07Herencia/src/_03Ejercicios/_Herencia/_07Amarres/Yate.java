package _03Ejercicios._Herencia._07Amarres;

public class Yate extends Barco {
	private int potencia;
	private int nCamarotes;
	
	public Yate(String m, double e, int a, int p, int n) {
		super(m, e, a);
		this.potencia = p;
		this.nCamarotes = n;
	}
	
	@Override
	public double gatcalculoAlquiler() {
		return potencia*nCamarotes;
	}
}
