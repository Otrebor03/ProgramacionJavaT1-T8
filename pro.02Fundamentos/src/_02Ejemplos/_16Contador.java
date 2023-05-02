package _02Ejemplos;

import java.util.Scanner;

public class _16Contador {

	
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Cuantas veces quieres que te salude: ");
		int veces = tec.nextInt();
		int contador = 0;
		
		while(contador < veces) {
			System.out.println("Hola");
			contador += 1;
		}
	}

}
