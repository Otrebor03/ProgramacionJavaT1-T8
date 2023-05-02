package _03Ejercicios._Herencia._07Amarres;

public class Amarre {
	private int posicion;
	private Cliente cliente;
	private int dias;
	private Barco barco;
	
	public Amarre(int posicion, Cliente cliente, int dias, Barco barco) {
		this.posicion = posicion;
		this.cliente = cliente;
		this.dias = dias;
		this.barco = barco;
	}
	
	public double calcularPrecioAlquiler() {
		return dias*barco.gatcalculoAlquiler();
	}
}
