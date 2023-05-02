package _03ejercicios;

import java.util.Scanner;

public class _18Hora12 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int horas, minutos, conversor;
		
		System.out.print("Dime una hora: ");
		horas = tec.nextInt();
		
		System.out.print("Dime los minutos: ");
		minutos = tec.nextInt();
		
		conversor = horas - 12;

		if(horas >= 0) {
			if(horas <= 24) {
				if (horas == 0) {
					System.out.format("Las %d:%d son las %d:%d AM", horas, minutos, 12, minutos);
				}else if(horas > 0) {
					if(horas < 12) {
						System.out.format("Las %d:%d son las %d:%d AM", horas, minutos, horas, minutos);				
					}
					else if(horas == 12) {
						System.out.format("Las %d:%d son las %d:%d PM", horas, minutos, 12, minutos);
					}
					else {
						System.out.format("Las %d:%d son las %d:%d PM", horas, minutos, conversor, minutos);
					}
				}
			}
		}
	}	
}


