package _03ejercicios;

import java.util.Scanner;

public class _03Media {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int edad1, edad2, edad3;
		double media;
		
		
		System.out.print("Dime la edad de la persona 1: ");
		edad1 = tec.nextInt();
		
		System.out.print("Dime la edad de la persona 2: ");
		edad2 = tec.nextInt();
		
		System.out.print("Dime la edad de la persona 3: ");
		edad3 = tec.nextInt();
		
		media = ((double)(edad1+edad2+edad3)/3);  //media = ((edad1+edad2+edad3)/3.0);
		
		System.out.println("La media de "+(edad1)+", "+(edad2)+" y "+(edad3)+" edades es de: "+media);
		System.out.format("La media de %d, %d y %d es %f", edad1, edad2, edad3, media);
	}

}




