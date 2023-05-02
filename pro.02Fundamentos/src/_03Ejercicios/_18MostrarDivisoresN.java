package _03Ejercicios;

import java.util.Scanner;

public class _18MostrarDivisoresN {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int n, division, contador = 0;
		
		System.out.println("Di un numero: ");
		n = tec.nextInt();
		
		while(n != contador) {
			contador += 1;
			division = n%contador;
			if(division == 0) {
				System.out.println(contador);
			}
		}
		

	}

}
