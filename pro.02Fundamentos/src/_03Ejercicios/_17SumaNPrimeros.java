package _03Ejercicios;

import java.util.Scanner;

public class _17SumaNPrimeros {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int n, contador = 0, suma = 0;
		
		System.out.println("Di un numero: ");
		n = tec.nextInt();
		
		while(contador != n) {
			contador +=1;
			suma += contador;
			System.out.println(contador);
			
		}
		System.out.format("La suma es %d", suma);
		
		
		

	}

}
