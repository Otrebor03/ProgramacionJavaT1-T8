package _03Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _01Comparar {
final static int SIZE = 1000000


;
	public static void main(String[] args) {
		List<Integer> lista = new LinkedList<>();
		for(int i = 0; i < SIZE; i++) {
			lista.add(i);
		}
		int cont;
		long t1, t2;
		
		
		//con for
		t1 = System.currentTimeMillis();
		cont = 0;
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i)%2==0) {
				cont++;
			}
		}
		t2 = System.currentTimeMillis();
		System.out.println("Tiempo For: " +(t2-t1));
		
		//con for-each
		cont = 0;
		t1 = System.currentTimeMillis();
		for(Integer x: lista) {
			if(x%2 == 0) {
				cont++;
			}
		}
		t2 = System.currentTimeMillis();
		System.out.println("Tiempo For-each: " +(t2-t1));
		
		//con Iterator
		cont = 0;
		t1 = System.currentTimeMillis();
		Iterator<Integer> it = lista.iterator();
		while(it.hasNext()) {
			if(it.next() %2 == 0) {
				cont++;
			}
		}
		t2 = System.currentTimeMillis();
		System.out.println("Tiempo Iterator: " +(t2-t1));
		

	}

}
