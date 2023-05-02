package _03Ejercicios._Herencia._01Aula;

public class Musica extends Aulas{
	private boolean piano;
	
	public Musica(int codigo, double longitud, double anchura, boolean piano) {
		super(codigo, longitud, anchura);
		this.piano = piano;
		
	}
	
	
	//No hace falta poner los getter y setter
	//A los getter que sean boolean se les pone is no get
	public boolean isPiano() {
		return piano;
	}
	
	public void setPiano(boolean piano) {
		this.piano = piano;
	}
	
	public int capacidadPersonas() {
		int c = super.capacidadPersonas();
		if(piano) {
			c = c-2;
		}
		
		return c;
	}
	
	@Override
	public String toString() {
//		if(piano) {
//			return super.toString()+" - Con Piano";
//			
//		}else {
//			return super.toString()+" - Sin Piano";
//		}
		//						Condicion boolean? "En caso verdadero"  : "En caso falso"
		return super.toString()+(piano? " - Con Piano" : " - Sin Pinao");
		
	}
	
}
