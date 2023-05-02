package _03Ejercicios;

import java.util.Scanner;

public class _08Partir {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		String texto, primera_parte, segunda_parte;
		int posicion, posicion_espacio;
		
		System.out.println("Introduce un texto: ");
		texto = tec.nextLine();
		
		System.out.print("Introduce una posicion: ");
		posicion = tec.nextInt();
		
		posicion_espacio = texto.indexOf(' ', posicion);
	
		
		if(posicion_espacio == posicion) {
			primera_parte = texto.substring(0, posicion_espacio);
			segunda_parte = texto.substring(posicion_espacio+1, texto.length());
			System.out.format("Primera Parte: %s %nSegunda Parte: %s", primera_parte, segunda_parte);
		}else {
			System.out.println("No se puede partir");
			
		}
		
		

	}

}
