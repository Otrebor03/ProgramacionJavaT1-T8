package _03Ejercicios;

import java.util.Scanner;

public class _05LeerEntero {

	public static void main(String[] args) {

		leeEnteroPositivo();

	}
	
	public static int leeEnteroPositivo ( ) {
		Scanner tec = new Scanner(System.in);
		int n;
		
		do{
			System.out.println("Introduce un numero: ");
			n = tec.nextInt();
		}while(n <= 0);
		
		return n;
		
		
		
	}

}
