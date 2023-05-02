package _03Ejercicios._Herencia._05Televisores;

public class Lcd extends Televisor{
	
	private String pxHorizontal;
	private String pxVertical;
	
	public Lcd(String marca, String modelo, double precio, double pulgadas, String pxHorizontal, String pxVertical) {
		super(marca, modelo, precio, pulgadas);
		this.pxHorizontal = pxHorizontal;
		this.pxVertical = pxVertical;
	}

	@Override
	public String calculoResolucion() {
		return pxHorizontal+"x"+pxVertical+" pixels";
	}
	
	
	
}
