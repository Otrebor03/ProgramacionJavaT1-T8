package _03Ejercicios;

import java.util.Scanner;

public class _21SumaSerie {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double n, division, contador = 0, suma = 0;
		
		System.out.println("Diga un numero: ");
		n = tec.nextInt();
		
		while(n != contador) {
			contador += 1;
			division = 1/contador;
			suma += division;
			System.out.println(division);
			
			
		}
		System.out.println(suma);
	}

}
