package _03Ejercicios._Herencia._04MonedasYBilletes;

public class Moneda extends Dinero{
	
	private double diametro;
	private double peso;

	public Moneda(double valor, int anyo, double diametro, double peso) {
		super(valor, anyo);
		this.diametro = diametro;
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Moneda - "+super.toString();
	}
	
	

}
