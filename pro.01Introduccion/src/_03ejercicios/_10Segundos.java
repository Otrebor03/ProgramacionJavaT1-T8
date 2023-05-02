package _03ejercicios;

import java.util.Scanner;

public class _10Segundos {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int segundos, dias, minutos, horas;
		
		System.out.print("Digame una catidad de tiempo en segundos: ");
		segundos = tec.nextInt();
		
		
		dias = segundos / 86400;
		segundos %= 86400;
		
		horas = segundos / 3600;
		segundos %= 3600;
		
		minutos = segundos / 60;
		segundos %= 60;
		
		
		System.out.format("%d segundos son: %n %d dias %n %d horas %n %d minutos %n %d segundos", segundos, dias, horas, minutos, segundos);	

	}

}