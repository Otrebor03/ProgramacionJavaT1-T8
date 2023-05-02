package _02Ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _08PropagarExcepcion {

	public static void main(String[] args) {
		try {
			Scanner tec = new Scanner(System.in);
			
			System.out.println("Calculadora simple: ");
			System.out.println("Introduce operador 1: ");
			int op1 = tec.nextInt();
			
			System.out.println("Introduce operador 2: ");
			int op2 = tec.nextInt();
			
			System.out.println("Introduce operacion");
			String operacion = tec.next();
			
			System.out.println("Resultado: " + calcular(op1, op2, operacion));
		}catch(InputMismatchException e) {
			System.out.println("El dato tiene que ser entero");
		}catch(ArithmeticException e) {
			System.out.println("No se pude dividir entre cero");
		}
		

	}
	//Lo adecuado en este metodo es propagar la excepcion en lugar de capturarla, 
	//PROPAGAR una excepcion es no hacer nada con ella para que sea el metodo que 
	//ha llamado a este quien decida que hacer con la excepcion (capturarla o propagarla de nuevo)
	public static int calcular(int op1, int op2, String operacion) {
		int res = 0;
		//try {
			switch(operacion) {
			case "+":
				res =  op1+op2;
				break;
			case "-":
				res = op1-op2;
				break;
			case "*":
				res = op1*op2;
				break;
			case "/":
				
				res = op1 / op2;
				break;	
				
			}
		//}catch(ArithmeticException e) {
		//	System.out.println("No se puede dividir entre cero");
		//}
		
		return res;
	}

}
