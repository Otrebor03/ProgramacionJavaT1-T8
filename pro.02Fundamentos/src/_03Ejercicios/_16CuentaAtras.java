package _03Ejercicios;

import java.util.Scanner;

public class _16CuentaAtras {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int n, contador = -1;
		
		System.out.println("Di un numero: ");
		n = tec.nextInt();
		
		
		while(n != contador) {
			System.out.println(n);
			n -= 1;
		}

	}

}
