package _02Ejemplos;

import java.util.ArrayList;

public class _01CreacionArrayList {

	public static void main(String[] args) {
		// Declaracion y creacion
		ArrayList<String> dias;  //Declaraacion de un arrayList de string
		dias = new ArrayList<>();  //Creacion del ArraysList
		
		//Declaracion y creacion en un solo paso
		ArrayList<String> meses = new ArrayList<>();
		
		//No se pueden crear ArraysList's de tipos primitivos (byte, short, int, long, double, float, char, boolean)
		
		
		//Por cada tipo primitivo existe un aclase envoltorio (wrapper)
		// byte -> Byte
		// short -> Short
		// int -> Integer
		// lorg -> Long
		// double -> Double
		// char -> Character
		//boolean -> Boolean
		
		ArrayList<Integer> edades = new ArrayList<>();
	}

}
