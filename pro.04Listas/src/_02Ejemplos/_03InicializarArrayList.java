package _02Ejemplos;

import java.util.Arrays;
import java.util.ArrayList;


public class _03InicializarArrayList {

	public static void main(String[] args) {
		//Los arrays se podian definir enumerando sus elementos
		int[] numeros = {1, 10, 12, 14};
		
		
		//Crear una lista vacia y anyadir elementos
		ArrayList<Integer> pares1 = new ArrayList<>();
		pares1.add(2);
		pares1.add(4);
		pares1.add(6);
		System.out.println("Pares 1: "+pares1);
		
		//Crear una lista que tome los elemntos que hay en otra
		ArrayList<Integer> pares2 = new ArrayList<> (pares1);
		System.out.println("pares 2: "+pares2);
		
		//Si quiero crear un array list con un contenido determinado: 
		ArrayList<Integer> impares = new ArrayList<>(Arrays.asList(1,3,5));
		
		//Crear un ArrayList a partir del contenido de un array
		Integer[] primos = {1,2,3,4,5,6,7,8,9,};
		ArrayList <Integer> listaPrimos = new ArrayList<Integer>(Arrays.asList(primos));
	}

}
