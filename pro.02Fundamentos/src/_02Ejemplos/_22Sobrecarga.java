package _02Ejemplos;

import java.util.Scanner;

public class _22Sobrecarga {
	
	//Los metodos pueden estar sobrecargaddos dos metodos que se llaman igual se dice que estan sobrecargados, para que pueda haber sobrecarga los metodos se tienen que diferenciar en el numero o tipo de sus parametros
	
	public static void main(String[] args) {
		linea(10);
		linea(30);
		linea(10, 'f');

	}

	
	/**
	 * Muestra por pantalla una linea formada por el caracter
	 * @param longitud la longitud que queremos que tenga la linea
	 */
	public static void linea(int longitud) {
		int cont = 0;
		while(cont < longitud) {
			System.out.print("*");
			cont += 1;
		}
		
		System.out.println();
	}

	
	/**
	 * 
	 * @param longitud 
	 * @param caractercaracter con el que queremos que funcione la linea
	 */
	public static void linea(int longitud, char caracter) {
		int cont = 0;
		while(cont < longitud) {
			System.out.print(caracter);
			cont += 1;
		}
		System.out.println();
	}




}
