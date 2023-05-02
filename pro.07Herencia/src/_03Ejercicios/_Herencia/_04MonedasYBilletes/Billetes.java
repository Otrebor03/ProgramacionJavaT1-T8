package _03Ejercicios._Herencia._04MonedasYBilletes;

public class Billetes extends Dinero{
	
	private double altura;
	private double anchura;

	public Billetes(double valor, int anyo, double altura, double anchura) {
		super(valor, anyo);
		this.altura = altura;
		this.anchura = anchura;
	}
	
	@Override
	public String toString() {
		return "Billete - "+super.toString();
	}

}
