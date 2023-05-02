package _02Ejemplos;

import java.util.Scanner;

public class _12Poltergeist {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		
		//Si hay un nextLine() despues de cualquier otro nextxxx() hay que quitar del buffer de teclado el salto de linea que queda "huerfano"
		System.out.println("Edad: ");
		int edad = tec.nextInt();tec.nextLine();
		
		System.out.println("Color favorito: ");
		String color = tec.nextLine();
		
		System.out.println("Estatura: ");
		double estatura = tec.nextDouble();
		
		System.out.println(edad);
		System.out.println(color);
		System.out.println(estatura);
		
	}

}
