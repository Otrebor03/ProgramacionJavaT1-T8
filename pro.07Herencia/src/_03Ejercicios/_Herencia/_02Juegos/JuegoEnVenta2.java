package _03Ejercicios._Herencia._02Juegos;

public class JuegoEnVenta2 extends JuegoAlquilerVenta{
	protected double precio;
	protected int copias;
	
	public JuegoEnVenta2(String t, String f, int a, double precio, int copias) {
		super(t, f, a, precio, copias);
		this.precio = precio;
		this.copias = copias;
	}


}
