package _02Ejemplos;

import java.util.Scanner;

public class _17BucleSinContador {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Frase: ");
		String frase = tec.nextLine();
		
		int posBlanco = frase.indexOf(' ');
		while(posBlanco != -1) {
			System.out.println(frase.substring(0, posBlanco));
			frase = frase.substring(posBlanco+1);
			posBlanco = frase.indexOf(' ');
			
		}
		System.out.println(frase);
		

	}

}
