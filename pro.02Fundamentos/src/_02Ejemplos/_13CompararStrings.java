package _02Ejemplos;

import java.util.Scanner;

public class _13CompararStrings {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre: ");
		String nombre = tec.nextLine();
		
		if(nombre == "javi") {
			System.out.println("Te llamas como el profe");
		}else {
			System.out.println("No te llamas como el profe");
		}
		
		
		if(nombre.equals("javi")) {
			System.out.println("Te llamas como el profe");
		}else {
			System.out.println("No te llamas como el profe");
		}
		
		if(nombre.equalsIgnoreCase("javi")) {
			System.out.println("Te llamas como el profe");
		}else {
			System.out.println("No te llamas como el profe");
		}
		
		//Comparacion de String(desigualdad)
		System.out.println("ana".compareTo("pepe"));
		System.out.println("pepe".compareTo("luis"));
		System.out.println("jose".compareTo("jose"));
	}

}
