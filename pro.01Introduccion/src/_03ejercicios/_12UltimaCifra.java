package _03ejercicios;

import java.util.Scanner;

public class _12UltimaCifra {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int n, ultimaCifra;
		
		System.out.print("Introduzca un valor: ");
		n = tec.nextInt();
		
		ultimaCifra = n%10;
		
		System.out.format("La ultima cifra de %d es %d",n ,ultimaCifra);	

	}

}