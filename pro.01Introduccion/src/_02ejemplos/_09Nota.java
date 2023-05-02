package _02ejemplos;

import java.util.Scanner;

public class _09Nota {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int nota;
		
		System.out.print("Nota: ");
		nota = tec.nextInt();
		
		if(nota > 9) {
			System.out.print("No esta mal");
		}
		else if(nota > 7) {
			System.out.print("Bastante bien");
		}
		else if(nota > 5) {
			System.out.print("Genial");
		}
	}

}
