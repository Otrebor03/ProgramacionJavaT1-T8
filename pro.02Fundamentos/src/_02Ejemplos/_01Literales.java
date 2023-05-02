package _02Ejemplos;

import java.util.Scanner;

public class _01Literales {

	public static void main(String[] args) {
		int a = 15;
		int b = 015;
		int c = 0x15;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int d = 2000000000; // Es un literal entero
		
		long e = 2000000000; // Es un literal entero aunque lo estoy guardadno en una variable tipo long
		
		//long f = 3000000000;   No cabe en un int
		long f = 3000000000L; //Poniendo una L indicamos que es long
		
		long g = 1L;
		// int h = 1L; Da error por que no se puede guardar en una variable de 4 bytes
		
		double k = 1.5;//Es un literal de 8 bytes
		float l = 1.5F;//Si pones la f indicamos que es un literal de 4 bytes
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce la estatura: ");
		float estatura = tec.nextFloat();
	}

}
