package _02ejemplos;

import java.util.Scanner;

public class _05OperadoresAritmeticos {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.print("Diga un numero: ");
		n1 = tec.nextInt();
		
		System.out.print("Diga otro numero: ");
		n2 = tec.nextInt();
		
		
		 
		System.out.println(n1 +" + "+n2+ " = "+ (n1+n2));
		
		System.out.println(n1 +" - "+n2+ " = "+ (n1-n2));
		
		System.out.println(n1 +" * "+n2+ " = "+ (n1*n2));
		
		System.out.println(n1 +" / "+n2+ " = "+ (n1/n2));
		
		System.out.println(n1 +" / "+n2+ " = "+ (n1/n2));
		
		System.out.println(n1 +" % "+n2+ " = "+ (n1%n2));
		
		//Division Real
		double divReal = n1 / n2;
		System.out.println("Division real: " + divReal);
		
		System.out.println("Division real: " + (5 / 2.0));
		
	}

}
