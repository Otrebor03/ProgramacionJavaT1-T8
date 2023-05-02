package _03Ejercicios._Herencia._07Amarres;

public class Deportivo extends Barco{
	private int potencia;
	
	public Deportivo(String m, double e, int a, int p) {
		super(m, e, a);
		this.potencia = p;
	}
	
	@Override
	public double gatcalculoAlquiler() {
		return super.gatcalculoAlquiler()+potencia;
	}
}
