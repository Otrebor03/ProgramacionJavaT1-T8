package _03Ejercicios._Herencia._02Juegos;

public class JuegoEnAlquiler extends Juego{
	
	protected double precio;
	protected int copias;
	protected int dias;
	
	public JuegoEnAlquiler(String t, String f, int a, double p, int c, int d) {
		super(t, f, a);
		this.precio = p;
		this.copias = c;
		this.dias = d;
		
	}

	public boolean alquilar() {
		
		if(copias > 0) {
			copias--;
			return true;
		}else {
			return false;
		}
		
	}

	public void devolver() {
		copias++;
	}

	public String toString() {
		return super.toString()+" - Precio: "+precio+" - Copias: "+copias+" - Dias: "+dias;
	}
}
