package _03Ejercicios;

import java.util.Scanner;

public class _25LetraNif {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int numero;
		String dni;
		System.out.println("Indica el numero de tu DNI: ");
		numero = tec.nextInt();
		
		System.out.println(calcularLetraNif(numero));
		
		System.out.println("Introduce un DNI: ");
		dni = tec.next();
		System.out.println(validarNif(dni));
		
		

	}
	
	public static char calcularLetraNif(int numero) {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra;
		
		numero = numero%23;
		
		letra = letras.charAt(numero);
		
		return letra;
		
		
		
	}

	public static String validarNif(String dni) {
		char letra = dni.charAt(8);
		int numero = Integer.parseInt(dni.substring(0,8));
		String validacion;
		
		if(letra == calcularLetraNif(numero)) {
			validacion = "Correcto";
		}else {
			validacion = "Incorrecto";
		}

		return validacion;
		
	}

}
