package _03Ejercicios;

import java.util.Scanner;

public class _14ImparesHastaN {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int numero, contador = 0;
		
		System.out.println("Di un numero: ");
		numero = tec.nextInt();
		
		while(contador != numero) {
			contador += 1;
			if(contador%2 != 0) {
				System.out.println(contador);
			}			
		}

	}

}
