package _02Ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _08RecorrerEliminando {

	public static void main(String[] args) {
		ArrayList<Integer> numeros;
		
		//Eliminar los numeros pares
		
		//Con for
		numeros = new ArrayList<> (Arrays.asList(1,2,3,4,6,7,8));
		for(int i = 0; i < numeros.size(); i++) {
			if(numeros.get(i)%2 == 0) {
				
				numeros.remove(i);
				i--;
			}
		}
		System.out.println(numeros);
	
		
		//Con for each        NO RECOMENDABLE
		numeros = new ArrayList<>(Arrays.asList(1,2,3,4,6,7,8));
		int pos = 0;
		for(Integer n: numeros) {
			if(n%2 == 0) {
				numeros.remove(pos);
			}else {
				pos++;
			}
		}
		
		System.out.println(numeros);
		
		
		//Con iterator
		numeros = new ArrayList<>(Arrays.asList(1,2,3,4,6,7,8));
		Iterator<Integer> it = numeros.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			if(n%2 == 0) {
				it.remove();
			}
		}
		
		System.out.println(numeros);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
