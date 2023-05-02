package _03Ejercicios;
import java.util.Scanner;
public class _02Bisiesto {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int ano;
		
		System.out.println("Di un ano: ");
		ano = tec.nextInt();
		
		if(esBisiesto(ano) == true) {
			System.out.println("Es bisiesto");
		}else {
			System.out.println("No es bisiesto");
		}
	}
	
	public static boolean esBisiesto(int ano) {
		boolean bisiesto;

		//return ano%400 == 0 || ano%4 == 0 && ano%100 != 0;
		
		if(ano%4 == 0 && (ano%4 == 0 || ano%100 != 0)) {
			return bisiesto = true;
		}else {
			return bisiesto = false;
			
		}
		
		
		/*
		
		if(ano%400 == 0) {
			return bisiesto = true;
		}else if(ano%100 == 0) {
			return bisiesto = false;
		}else if(ano%4 == 0) {
			return bisiesto = true;
		}else {
			return bisiesto = false;
		}
		*/
		
		
	}

}
