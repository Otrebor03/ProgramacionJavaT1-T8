package _02Ejemplos;

import java.util.Scanner;

public class _08PasoParametroPorValor {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int edad = tec.nextInt();
		
		int doble = doblar(edad);
		System.out.println("El doble de "+edad+" es "+doble);
		

	}
	
	public static int doblar (int numero) {
		numero *= 2;
		return numero;
	}

}
