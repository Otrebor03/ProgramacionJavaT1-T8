package _03Ejercicios;

import java.util.Scanner;

public class _04Redondear {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double numero_u, decimales, redondeo, decima;
		
		System.out.print("Di un numero: ");
		numero_u = tec.nextDouble();
		
		decimales = (numero_u - (int)numero_u);
		redondeo = (numero_u - decimales);
		decima = Math.round(decimales*10);
		
		redondeo += decima/10;
		System.out.print("El numero redondeado es: ");
		System.out.println(redondeo);

	}

}
