package _02Ejemplos;

import java.util.Scanner;

public class _19Sumador {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Cuantos alumnos hay: ");
		int numAlumnos = tec.nextInt();
		
		int contador = 0;
		
		while(contador < numAlumnos) {
			System.out.format("Nota %2d:", contador);
			int nota = tec.nextInt();
			contador += 1;
			
		}
	}

}
