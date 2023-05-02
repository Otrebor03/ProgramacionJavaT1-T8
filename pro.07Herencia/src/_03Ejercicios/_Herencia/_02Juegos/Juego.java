package _03Ejercicios._Herencia._02Juegos;

public class Juego implements Comparable<Juego>{
	protected String titulo;
	protected String fabricante;
	protected int anyo;
	

	public Juego(String t, String f, int a) {
		this.titulo = t;
		this.fabricante = f;
		this.anyo = a;
	}

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	@Override
	public String toString() {
		return "Titulo: "+titulo+" - Fabricante: "+fabricante+" - Fecha salida: "+anyo;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(! (o instanceof Juego)) return false;
		
		Juego j = (Juego) o;
		if(this.titulo.equals(j.titulo) && this.fabricante.equals(j.fabricante) && this.anyo == j.anyo) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Juego o) {
		if(this.titulo.compareTo(o.titulo) < 0) return -1;
		else if(this.titulo.compareTo(o.titulo) > 0) return 1;
		else if(this.fabricante.compareTo(o.fabricante) < 0) return -1;
		else if(this.fabricante.compareTo(o.fabricante) > 0) return 1;
		else if(this.anyo>o.anyo)return 1;
		else if(this.anyo<o.anyo) return -1;
		else return 0;
	}


}
