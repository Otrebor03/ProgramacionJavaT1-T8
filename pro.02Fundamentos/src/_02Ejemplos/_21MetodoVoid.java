package _02Ejemplos;

import java.util.Scanner;

public class _21MetodoVoid {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		rotulo("HOLA");

	}
	//Cuando un metodo no devuelve un resultado en la cabecera indica con void en el tipo devuelto, en los metodos void no es necesario poner return
	public static void rotulo(String mensaje) {
		int longitud = mensaje.length();
		linea(longitud+4);
		System.out.println("* "+ mensaje +" *");
		linea(longitud+4);
	}
	
	public static void linea(int longitud) {
		int cont = 0;
		while (cont < longitud) {
			System.out.print("*");
			cont += 1;
		}
		System.out.println();
	}

}
