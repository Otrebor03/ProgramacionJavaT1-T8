package _03Ejercicios._Herencia._02Juegos;

public class JuegoEnVenta extends Juego{
	protected double precio;
	protected int copias;
	
	public JuegoEnVenta(String t, String f, int a, double precio, int copias) {
		super(t, f, a);
		this.precio = precio;
		this.copias = copias;
	}
	
	public boolean vender() {
		if(copias > 0) {
			copias--;
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+" - Precio: "+precio+" - Copias: "+copias;
	}
}
