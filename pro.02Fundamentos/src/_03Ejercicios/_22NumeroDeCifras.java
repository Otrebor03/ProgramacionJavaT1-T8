package _03Ejercicios;

import java.util.Scanner;

public class _22NumeroDeCifras {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int n, cifras = 0;
		
		System.out.println("Introduzca un numero: ");;
		n = tec.nextInt();
		
		while(n != 0) {
			n /= 10;
			cifras += 1;

		}
		
		System.out.format("El numero tiene %d cifras", cifras);

		
	}

}
