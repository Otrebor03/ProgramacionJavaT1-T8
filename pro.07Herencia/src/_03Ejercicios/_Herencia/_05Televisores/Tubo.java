package _03Ejercicios._Herencia._05Televisores;

public class Tubo extends Televisor{
	private String lineas;

	public Tubo(String marca, String modelo, double precio, double pulgadas, String lineas) {
		super(marca, modelo, precio, pulgadas);
		this.lineas = lineas;
	}

	@Override
	public String calculoResolucion() {
		return lineas+" lineas";
	}
	
//	@Override
//	public String toString() {
//		return super.toString()+" - Resolucion: "+calculoResolucion();
//	}

}
