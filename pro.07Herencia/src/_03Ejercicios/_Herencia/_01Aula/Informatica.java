package _03Ejercicios._Herencia._01Aula;

public class Informatica extends Aulas{
	
	private int numOrdenadores;
	
	public Informatica (int codigo, double longitud, double anchura, int numOrdenadores) {
		super(codigo, longitud, anchura);
		this.numOrdenadores = numOrdenadores;
	}
	
	//En el caso de que nos dijeran que todas las aulas de informatica tienen 0x20 metros el constructor seria el siguiente
//	public Informatica(int codigo, int numOrdenadores) {
//		super(codigo, 10, 20);
//		this.numOrdenadores = numOrdenadores;
//	}
	
	//No hace falta poner los getter y setter
	public int getNumOrdenadores() {
		return numOrdenadores;
	}
	
	public void setNumOrdenadores(int numOrdenadores) {
		this.numOrdenadores = numOrdenadores;
	}
	
	
	
	public int capacidadPersonas() {
		return numOrdenadores*2;
		
	}
	
	@Override
	public String toString() {
		return super.toString()+" - Numero de ordenadores: "+numOrdenadores;
	}

}
