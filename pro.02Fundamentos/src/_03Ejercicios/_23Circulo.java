package _03Ejercicios;

import java.util.Scanner;

public class _23Circulo {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double radio, longitud, area, volumen;
		
		System.out.println("Di el radio: ");
		radio = tec.nextDouble();
		
		longitud = longitudCircunferencia(radio);								
		area = areaCirculo(radio);
		volumen = volumenEsfera(radio);
		
		System.out.format("Longitud: %-03f %nArea: %f %nVolumen: %f", longitud, area, volumen);
		
	}
	
	public static double longitudCircunferencia(double radio) {
		double longitud = 2*Math.PI*radio;
		return longitud;
	}

	public static double areaCirculo(double radio) {
		double area = Math.PI*Math.pow(radio, 2);
		return area;
	}

	public static double volumenEsfera(double radio) {
		double volumen = ((4/3)*Math.PI*Math.pow(radio, 3));
		return volumen;
	}

}