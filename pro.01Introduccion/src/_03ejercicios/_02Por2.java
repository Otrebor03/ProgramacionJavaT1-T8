package _03ejercicios;

import java.util.Scanner;

public class _02Por2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int n;
		
		System.out.print("Escribe un numero: ");
		n = tec.nextInt();
		
		//Solucion al vuelo
		System.out.println("El doble de "+n+" es "+(n*2));
		
		//Solucion usando una variable
		int doble = n*2;
		System.out.println("El doble de "+n+" es "+doble);
		
	}

}
