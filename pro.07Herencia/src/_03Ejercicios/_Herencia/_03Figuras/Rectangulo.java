package _03Ejercicios._Herencia._03Figuras;

public class Rectangulo extends Figura{
	private int alto;
	private int ancho;
	
	public Rectangulo(int x, int y, String color, int alto, int ancho) {
		super(x, y, color);
		this.alto = alto;
		this.ancho = ancho;
	}

	@Override
	public double area() {
		return alto*ancho;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Rectangulo)) return false;
		
		Rectangulo r = (Rectangulo) o;
		return super.equals(r) && this.alto == r.alto && this.ancho == r.ancho; 
	}
	
	
}
