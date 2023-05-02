package _03Ejercicios._Herencia._03Figuras;

public abstract class Figura {
	private int x;
	private int y;
	private String color;
	
	public Figura(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public abstract double area();
	
	@Override
	public String toString() {
		return "Color: "+color+" - Poiscion: ("+x+","+y+") - Area: "+area();
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Figura)) return false;
		
		Figura f = (Figura) o;
		
		return this.x == f.x && this.y==f.y && this.color.equals(f.color);
	}
}
