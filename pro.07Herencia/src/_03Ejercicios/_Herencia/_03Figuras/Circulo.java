package _03Ejercicios._Herencia._03Figuras;

public class Circulo extends Figura{
	private int r;
	
	public Circulo(int x, int y, String color, int r) {
		super(x, y, color);
		this.r = r;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(r, 2);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Circulo)) return false;
		
		Circulo c = (Circulo) o;
		return super.equals(c) && this.r==c.r; 
	}
}
