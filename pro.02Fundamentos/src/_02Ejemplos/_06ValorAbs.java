package _02Ejemplos;

import java.util.Scanner;

public class _06ValorAbs {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce dos numeros que difieran como mucho mucho en 10 unidades: ");
		int num1 = tec.nextInt();
		int num2 = tec.nextInt();
		//Sin abs
				if(num1 > num2) {
					if((num1 - num2) > 10) {
						System.out.println("mal");
					}else {
						System.out.println("bien");
					}
					
				}else if(num2 > num1) {
					if((num2 - num1) > 10) {
						System.out.println("mal");
					}else{
						System.out.println("bien");
					}
					
				}else {
					System.out.println("Bien");
				}
				
				//Con abs
				if(Math.abs(num1-num2) > 10) {
					System.out.println("Mal");
				}else {
					System.out.println("Bien");
				}
	}

}
