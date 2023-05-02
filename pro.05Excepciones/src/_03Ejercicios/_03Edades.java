package _03Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03Edades {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			System.out.println(calcularMedia());
		}catch(InputMismatchException e) {
			tec.next();
			System.out.println("Error en la edad /n " + calcularMedia());
		}
		
		
	}
	
	public static double calcularMedia() {
		int edad = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("Di la edad de "+ (i+1));
			edad += tec.nextInt();
		}
		
		return edad/5.0;
	}

}
