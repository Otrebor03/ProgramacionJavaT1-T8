package _03Ejercicios._Herencia._01Aula;

public class Aulas {
	private int codigo;
	private double longitud;
	private double anchura;
	
	
	public Aulas(int codigo, double longitud, double anchura) {
		this.codigo = codigo;
		this.longitud = longitud;
		this.anchura = anchura;
	}
	
	//No hace falta poner los getter y setter
	public int getCodigo() {
		return codigo;
	}
	
	public double getLongitud() {
		return longitud;
	}
	
	public double getAnchura() {
		return anchura;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}
	
	
	
	
	
	public double calcularSuperficie() {
		return longitud*anchura;
	}
	
	public int capacidadPersonas() {
		return (int) (calcularSuperficie()/1.4);
		
	}
	
	@Override
	public String toString() {
		return String.format("%d - %5.2f m2 - %d pers.", codigo, calcularSuperficie(), capacidadPersonas());
		
	}
}
