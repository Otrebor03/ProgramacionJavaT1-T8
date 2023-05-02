package _03Ejercicios;

import java.util.Scanner;

public class _01Circulo {
	

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double radio, longitud, area, volumen;
		
		System.out.println("Diga un radio: ");
		radio = tec.nextDouble();
		
		longitud = 2*Math.PI * radio;
		area = Math.PI * (Math.pow(radio, 2));
		volumen = (4*Math.PI/3)*(Math.pow(radio, 3));
		
		System.out.format(" La longitud es de: %f %n El area es de: %f %n El volumen es de: %f", longitud, area, volumen);
		
		
		
		
		
		

	}

}
