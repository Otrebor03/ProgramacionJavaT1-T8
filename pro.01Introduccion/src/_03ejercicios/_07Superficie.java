package _03ejercicios;

import java.util.Scanner;

public class _07Superficie {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double longitud, anchura, superficie;
		
		System.out.print("Digame la longitud de la habitacion: ");
		longitud = tec.nextDouble();
		
		System.out.print("Digame la anchura de la habitacion: ");
		anchura = tec.nextDouble();
		
		superficie = (longitud * anchura);
		
		System.out.format("La habitacion tiene una superficie de %f metros cuadrados", superficie);

	}

}