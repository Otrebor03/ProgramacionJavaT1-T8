package _02Ejemplos;

import java.util.Scanner;

public class _01TipoBoolean {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		
		boolean esMayor = edad >= 18;
		System.out.println("Mayor de edad: " + esMayor);
		
		if(esMayor) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad");
		}
		
	}

}
