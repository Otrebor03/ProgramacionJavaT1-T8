package _03ejercicios;

import java.util.Scanner;

public class _06Horas {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int horas, segundos;
		
		System.out.print("Diga una cantidad de tiempo en segundos: ");
		segundos = tec.nextInt();	
		
		horas = segundos/3600;
		segundos %=3600;

		System.out.println("Tiene "+horas+" horas y "+segundos+" segundos");
		
	}

}