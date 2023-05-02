package _03ejercicios;

import java.util.Scanner;

public class _11Fuerza {
	
	//Constante de gravitacion universal
	
	final static double G = 6.693E-11;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double  m1, m2, d, f;
		
		System.out.print("Diga la masa 1: ");
		m1 = tec.nextDouble();
		
		System.out.print("Diga la masa 2: ");
		m2 = tec.nextDouble();
		
		System.out.print("Diga la distancia entre las masas: ");
		d = tec.nextDouble();
		
		f = (G*m1*m2)/(Math.pow(d, 2));
		
		System.out.format("La fuerza de atraccion entre las dos masas es de: "+f);		

	}

}