package _03ejercicios;

import java.util.Scanner;

public class _08Pesetas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double euro, peseta = 166.386;
		
		System.out.print("Diga una cantidad de dinero en euros: ");
		euro = tec.nextDouble();
		
		peseta *= euro;
		
		System.out.format("%f euros son %f pesetas", euro, peseta);
	}

}