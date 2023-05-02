package _03ejercicios;

import java.util.Scanner;

public class _19Fechas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int ano1, ano2, mes1, mes2, dia1, dia2;
		
		System.out.print("Fecha 1: DD/MM/AA");
		dia1 = tec.nextInt();
		mes1 = tec.nextInt();
		ano1 = tec.nextInt();
		
		System.out.print("Fecha 2: DD/MM/AA ");
		dia2 = tec.nextInt();
		mes2 = tec.nextInt();
		ano2 = tec.nextInt();		
		
		if(ano1 < ano2) {
			System.out.format("La fecha mas pequeña es: %d/%d/%d", dia1, mes1, ano1);
		}
		
		else if(ano2 < ano1) {
			System.out.format("La fecha mas pequeña es: %d/%d/%d", dia2, mes2, ano2);
		}
		
		else {
			if(mes1 < mes2) {
				System.out.format("La fecha mas pequeña es: %d/%d/%d", dia1, mes1, ano1);
			}
			
			else if(mes2 < mes1) {
				System.out.format("La fecha mas pequeña es: %d/%d/%d", dia2, mes2, ano2);
			}
			
			else {
				if(dia1 < dia2) {
					System.out.format("La fecha mas pequeña es: %d/%d/%d", dia1, mes1, ano1);
				}
				
				else if(dia2 < dia1) {
					System.out.format("La fecha mas pequeña es: %d/%d/%d", dia2, mes2, ano2);
				}
				else {
					System.out.println("ERROR");
				}
			}
			
		}
		

	}

}
