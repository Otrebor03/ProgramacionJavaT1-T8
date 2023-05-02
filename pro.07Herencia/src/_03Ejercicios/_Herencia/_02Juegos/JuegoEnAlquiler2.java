package _03Ejercicios._Herencia._02Juegos;

public class JuegoEnAlquiler2 extends JuegoAlquilerVenta{
	

	protected int dias;
	
	public JuegoEnAlquiler2(String t, String f, int a, double p, int c, int d) {
		super(t, f, a, p, d);
		this.dias = d;
		
	}


	public void devolver2() {
		copias++;
	}

	@Override
	public String toString() {
		return super.toString()+" - Dias: "+dias;
	}
}
