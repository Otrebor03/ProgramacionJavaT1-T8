package _02ejemplos;

import java.util.Scanner;

public class _03EntradaTeclado {	
	public static void main(String args[]) {
		
		//Tres variables para almacenar la informacion del usuario
		
		String nombre;
		int edad;
		double altura;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		nombre = tec.next();
		
		System.out.print("Edad: ");
		edad = tec.nextInt();
		
		System.out.print("Estatura: ");
		altura = tec.nextDouble();
		
		
		System.out.println("Hola " + nombre);
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("Eres menor de edad");
		}
	}

}
