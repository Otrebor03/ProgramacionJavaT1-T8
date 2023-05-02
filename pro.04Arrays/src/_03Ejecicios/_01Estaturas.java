package _03Ejecicios;

import java.util.Scanner;

public class _01Estaturas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double[] estatura = new double[10];
		
		for(int i = 0; i <= 9; i++) {
			System.out.format("Introduce la estatura de la persona %d: ", (i+1));
			estatura[i] = tec.nextDouble();
		}
		
		for(int i = 0; i <= 9; i++) {
			System.out.format("Persona %d: %f m%n", (i+1), estatura[i]);
		}

	}

}
