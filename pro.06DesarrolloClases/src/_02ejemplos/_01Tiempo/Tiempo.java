package _02ejemplos._01Tiempo;

/**
 * La clase Tiempo permite representar un instante
 * de tiempo detallando la hora, el minuto y el segundo
 * @author jgarcia
 *
 */
public class Tiempo implements Comparable<Tiempo>{
	//Atributos (o variables de instancia)
	private int hora;
	private int minuto;
	private int segundo;
	
	//Constructor: Es el método al que se llama para crear los objetos
	// de la clase junto con el operador new
	//Sirve para dar a los objetos un estado inicial. Para inicializar
	//sus atributos
	public Tiempo(int hora, int minuto, int segundo) {
//		this.hora = hora;
//		this.minuto = minuto;
//		this.segundo = segundo;
		this.setHora(hora); //this es opcional
		setMinuto(minuto);
		setSegundo(segundo);
	}
	
	//Metodos consultores: Getter
	public int getHora() {
		return this.hora; //this es opcional
	}
	public int getMinuto() {
		return this.minuto; //this es opcional
	}
	public int getSegundo() {
		return this.segundo; //this es opcional
	}
	//Metodos modificadores: Setter
	public void setHora(int hora) {
		if(hora < 0 || hora > 23) throw new IllegalArgumentException("Valor incorrecto: " + hora);
		this.hora = hora;
	}
	public void setMinuto(int minuto) {
		if(minuto < 0 || minuto > 59)
			throw new IllegalArgumentException("Valor incorrecto: " + minuto);
		this.minuto = minuto;
	}
	public void setSegundo(int segundo) {
		if(segundo < 0 || segundo > 59)
			throw new IllegalArgumentException("Valor incorrecto: " + segundo);
		this.segundo = segundo;
	}
	
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hora,minuto,segundo);
		//return hora + ":" + minuto + ":" + segundo;
	}
	
	

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if(!(o instanceof Tiempo)) return false;
		
		Tiempo t = (Tiempo) o;
		if(this.hora == t.hora && this.minuto == t.minuto && this.segundo == t.segundo) {
			return true;
		} else {
			return false;
		}
		//o bien
		//return this.hora == t.hora && this.minuto == t.minuto && this.segundo == t.segundo;
	}
	/*
	 * Compara los Tiempos this y t y devuelve un INT:
	 * - negativo si this es menor que t
	 * - positivo si this es mayor que t
	 * - cero si this y t son iguales
	 */
	public int compareTo(Tiempo t) {
		if(this.hora < t.hora) return -1;
		else if(this.hora > t.hora) return 1;
		else if(this.minuto < t.minuto) return -1;
		else if(this.minuto > t.minuto) return 1;
		else if(this.segundo < t.segundo) return -1;
		else if(this.segundo > t.segundo) return 1;
		else return 0;
	}
	//de otra forma
	public int compareTo2(Tiempo t) {
		if(this.hora != t.hora) return this.hora - t.hora;
		else if(this.minuto != t.minuto) return this.minuto - t.minuto;
		else return this.segundo - t.segundo;
	}

}
