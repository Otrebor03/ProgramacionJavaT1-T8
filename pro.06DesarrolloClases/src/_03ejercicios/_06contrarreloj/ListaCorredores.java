package _03ejercicios._06contrarreloj;

import java.util.ArrayList;

public class ListaCorredores {
	private ArrayList<Corredor> lista;
	
	public ListaCorredores(){
		lista = new ArrayList<>();
	}
	
	public void anyadir(Corredor c) throws IllegalArgumentException {
		if(lista.contains(c)) {
			throw new IllegalArgumentException("Corredor duplicado");
		}
		lista.add(c);
	}
	
	
	
	
}