package _03Ejercicios._Herencia._07Amarres;

public class Velero extends Barco{
	
	private int nMastiles;
	
	public Velero(String m, double e, int a, int mastiles) {
		super(m, e, a);
		this.nMastiles = mastiles;
	}

	@Override
	public double gatcalculoAlquiler() {
		return super.gatcalculoAlquiler()+nMastiles;
	}
	
	

}
