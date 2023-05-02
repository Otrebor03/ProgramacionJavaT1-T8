package _02Ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _06RecorrerListas {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
		
		//Hay 3 formas de recorrer un ArraysList
		
		//1.- Accediendo a los elementos por su posicion:
		for(int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("-------------------");
		//2.- Utilizando un buvle for each
		//Con cada String s de la lista l, ejecutar el cuerpo del bucle
		for(String s: l) {
			System.out.println(s);
		}
		
		System.out.println("----------------------");
		//3.- Utilizando un objeto Iterator
		Iterator<String> it = l.iterator();
		String s = it.next();
		System.out.println(s);

	}

}
