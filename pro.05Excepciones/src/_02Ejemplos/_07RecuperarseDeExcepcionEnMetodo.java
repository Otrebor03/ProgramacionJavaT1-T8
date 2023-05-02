package _02Ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _07RecuperarseDeExcepcionEnMetodo {

	static Scanner tec = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Peso: ");
		double peso = miNextDouble();
		
		System.out.println("Estatura: ");
		double estatura = miNextDouble();
		
		System.out.println("IMC: " + (peso/(estatura*estatura)));
		

	}
	public static double miNextDouble() {
		boolean ok = false;
		double num = 0;
		while(!ok) {
			try {
				num = tec.nextDouble();
				ok = true;
			}catch (InputMismatchException e) {
				System.out.println("Debe introducir un numero real");
				tec.nextLine();
			}
		}
		
		return num;
	}

}
