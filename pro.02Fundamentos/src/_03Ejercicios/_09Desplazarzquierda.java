package _03Ejercicios;

import java.util.Scanner;

public class _09Desplazarzquierda {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		String palabra, nueva_palabra;
		char caracter;
		int longitud;
		
		System.out.print("Introduce una palabra: ");
		palabra = tec.next();
		
		caracter = palabra.charAt(0); 
		
		longitud = palabra.length();
		
		nueva_palabra = (palabra.substring(1, longitud)) + caracter;
		
		System.out.format("Texto Desplazado: %s", nueva_palabra);
		
		

	}

}
