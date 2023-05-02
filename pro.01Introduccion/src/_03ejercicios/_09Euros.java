package _03ejercicios;

import java.util.Scanner;

public class _09Euros {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double pesetas, euro = 166.386;
		
		System.out.print("Diga una cantidad de dinero en pesetas: ");
		pesetas = tec.nextDouble();
		
		euro /= pesetas;
		
		System.out.format("%f pesetas son %f euros", pesetas, euro);
	}

}