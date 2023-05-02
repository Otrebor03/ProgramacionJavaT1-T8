package _03ejercicios;

import java.util.Scanner;

public class _04IndiceMasa {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double kg, altura, IMC;
		
		System.out.print("Diga su peso en Kg: ");
		kg = tec.nextDouble();
		
		System.out.print("Diga su altura en centimetros: ");
		altura = tec.nextDouble();
		
		IMC = (kg/Math.pow(altura, 2));
		
		System.out.print("Tu indice de masa corporal es de: "+IMC);
		
	}

}
