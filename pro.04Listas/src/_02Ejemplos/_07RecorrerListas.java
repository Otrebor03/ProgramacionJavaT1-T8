package _02Ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _07RecorrerListas {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<> (Arrays.asList(1, 2, 3, 4, 5 ));
		int suma = 0;
		
		//Recorrer la lista para mostrar cuanto suman suman en total los pares
		
		
		//Con for 
		for(int i = 0; i < numeros.size(); i++) {
			if(numeros.get(i)%2 == 0) {
				suma += numeros.get(i);
			}
		}
		System.out.println(suma);
		System.out.println("-----------------------");
		
		
		// Con For each
		suma = 0;
		for(Integer i:numeros) {
			if(i%2 == 0) {
				suma += i;
				
			}
		}
		System.out.println(suma);
		System.out.println("----------------------");
		
		suma = 0;
		
		
		//Con iterator
		Iterator<Integer> it = numeros.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			if(n%2 == 0) {
				suma += n;
			}
		}
		 
		 System.out.println(suma);
		 
	}

}
