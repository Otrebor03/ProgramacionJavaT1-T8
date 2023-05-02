package _02ejemplos;

import java.util.Scanner;

public class _10Aprobado {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		float teoria, practica;
		
		System.out.print("Dime la nota de la teoria: ");
		teoria = tec.nextFloat();
		
		System.out.print("Dime la nota de la practica: ");
		practica = tec.nextFloat();

		if(teoria >= 5) {
			if(practica > 4) {
				System.out.println("Apto");
			}else {
				System.out.println("No apto");
			}
		}else {
			if(practica > 9) {
				System.out.println("Apto");
			}else {
				System.out.println("No apto");
			}
		}
		

	}

}
