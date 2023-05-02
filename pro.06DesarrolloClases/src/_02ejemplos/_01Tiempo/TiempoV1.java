package _02ejemplos._01Tiempo;

/**
 * La clase Tiempo permite representar un instante
 * de tiempo detallando la hora, el minuto y el segundo
 * @author jgarcia
 *
 */
public class TiempoV1 {
	//Atributos (o variables de instancia)
	int hora;
	int minuto;
	int segundo;
	
	//Constructor: Es el método al que se llama para crear los objetos
	// de la clase junto con el operador new
	//Sirve para dar a los objetos un estado inicial. Para inicializar
	//sus atributos
	public TiempoV1(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	/*
	 * Crea un objeto tiempo a partir de un String con formato hh:mm:ss
	 */
	public TiempoV1(String s) {
		hora = Integer.parseInt(s.substring(0,s.indexOf(':')));
		minuto = Integer.parseInt(s.substring(s.indexOf(':')+1, s.lastIndexOf(':')));
		segundo = Integer.parseInt(s.substring(s.lastIndexOf(':')+1));
	}
	/**
	 * Crea un objeto Tiempo indicando la cantidad de segundos transcurridos 
	 * desde las 00:00:00
	 */
	public TiempoV1(int s) {
		hora = s / 3600;
		minuto = s % 3600 / 60;
		segundo = s % 60;
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hora,minuto,segundo);
		//return hora + ":" + minuto + ":" + segundo;
	}

}
