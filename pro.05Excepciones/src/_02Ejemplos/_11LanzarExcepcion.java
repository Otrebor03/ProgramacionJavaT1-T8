package _02Ejemplos;

import java.util.Scanner;

public class _11LanzarExcepcion {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		System.out.println("Mes: ");
		int mes = tec.nextInt();
		System.out.println("Anyo: ");
		int anyo = tec.nextInt();
		
		System.out.println("Dias: "+diasDelMes(mes, anyo));

	}
	
	public static int diasDelMes(int mes, int anyo) {
		int dias = 0;
		if(mes == 2) {
			if(esBisiesto(anyo)) {
				dias = 29;
			}else {
				dias = 28;
			}
		}else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			dias = 31;
		}else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			dias = 30;
		}else {
			throw new IllegalArgumentException("Mes Incorrecto: "+mes);
		}
		
		return dias;
	}
	
	public static boolean esBisiesto(int anyo) {
		return anyo % 400 == 0 || anyo % 4 == 0 && anyo % 100 != 0; 
	}

}
