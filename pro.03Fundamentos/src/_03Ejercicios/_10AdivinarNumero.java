package _03Ejercicios;

import java.util.Scanner;

public class _10AdivinarNumero {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int numero = numero(), n;
		
		System.out.format("Numero a adivinar: %d %n", numero);
		
		do {
			System.out.println("Adivina el numero: ");
			n = tec.nextInt();
			
			pista(numero, n);
			
		}while(numero != n);
	
	
	}
	
	public static int numero() {
		return (int) (1+Math.random()*101);
	}
		

	public static void pista(int numero, int n) {
		if(n < numero) {
			System.out.println("Te has quedado corto");
		}else if(n > numero) {
			System.out.println("Te has pasado");
		}else {
			System.out.println("Has acertado");
		}
	}
}
