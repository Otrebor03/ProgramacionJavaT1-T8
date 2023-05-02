package _02Ejemplos;

import java.util.Scanner;

public class _18ContadorDescendente {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Cuantas veces quieres que te salude: ");
		int veces = tec.nextInt();
		
		while(veces > 0) {
			System.out.println("Hola");
			veces -= 1;
		}
	}

}
