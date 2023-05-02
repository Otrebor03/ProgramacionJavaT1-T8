package _03ejercicios;

import java.util.Scanner;

public class _05Minutos {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int seg, min;
		
		System.out.print("Diga una cantidad de segundos: ");
		seg = tec.nextInt();
		
		min = seg/60;
		seg %= 60;
		
		System.out.println(seg+ "segundos son: " + min + "minutos y " + seg + " segundos");

	}

}
