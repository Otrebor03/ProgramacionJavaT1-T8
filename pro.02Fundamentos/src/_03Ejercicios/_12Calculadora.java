package _03Ejercicios;

import java.util.Scanner;

public class _12Calculadora {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		double n1, n2, resultado;
		String operacion;
		
		System.out.println("Primer numero: ");
		n1 = tec.nextInt();
		
		System.out.println("Segundo numero: ");
		n2 =  tec.nextInt();
		
		System.out.println("Operacion: ");
		operacion = tec.next();
		
		if(operacion.equals("+") == true) {
			resultado = n1 + n2;
			System.out.format("%f + %f = %f", n1, n2, resultado);
		}else if(operacion.equals("-") == true) {
			resultado = n1 - n2;
			System.out.format("%f - %f = %f", n1, n2, resultado);
		}else if(operacion.equals("/") == true) {
			if(n1 > n2) {
				resultado = n1 / n2;
				System.out.format("%f / %f = %f", n1, n2, resultado);
			}else {
				resultado = n2 / n1;
				System.out.format("%f / %f = %d", n2, n1, resultado);
			}
		}else if(operacion.equals("*") == true) {
			resultado = n1 * n2;
			System.out.format("%f * %f = %f", n1, n2, resultado);
		}else {
			System.out.println("Algo no ha salido bien");
		}
		
		
	}

}
