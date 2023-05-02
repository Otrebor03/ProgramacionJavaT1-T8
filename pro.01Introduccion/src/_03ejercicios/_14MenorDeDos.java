package _03ejercicios;

import java.util.Scanner;

public class _14MenorDeDos {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int n1 , n2;
		
		System.out.print("Di un numero: ");
		n1 = tec.nextInt();
		
		System.out.print("Di otro numero: ");
		n2 = tec.nextInt();
		
		if(n1 > n2) {
			System.out.format("%f es menor que %f", n2, n1);
		}else {
			System.out.format("%f es menor que %f", n1, n2);
		}

	}

}
