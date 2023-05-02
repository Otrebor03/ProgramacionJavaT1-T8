package _03Ejercicios;

import java.util.Scanner;

public class _11LongitudEntero {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		long numero;
		String n;
		int longitud;
		
		System.out.println("Introduce un enteero largo: ");
		numero = tec.nextLong();
		
		longitud = (String.valueOf(numero)).length();
		
		System.out.println("Longitud: " + longitud);

	}

}
