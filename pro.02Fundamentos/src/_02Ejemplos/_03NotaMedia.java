package _02Ejemplos;

import java.util.Scanner;

public class _03NotaMedia {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Cuantos alumnos hay: ");
		int numAlumnos = tec.nextInt();
		
		System.out.println("Cuanto suman sus notas: ");
		int sumaNotas = tec.nextInt();
		
		double media = (double)sumaNotas/numAlumnos;
		System.out.println("Media: "+media);

	}

}
