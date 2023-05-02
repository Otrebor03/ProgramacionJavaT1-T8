package _03Ejercicios;

import java.util.Scanner;

public class _02Pitagoras {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double c1, c2, h;
		
		System.out.print("Di el valor del primer cateto: ");
		c1 = tec.nextDouble();
		System.out.print("Di el valor del segundo cateto: ");
		c2 = tec.nextDouble();
		
		h = Math.sqrt(Math.pow(c2, 2) + Math.pow(c1, 2)); 
		
		System.out.format("El valor de la hipotenusa es de: %f", h);
		

	}

}
