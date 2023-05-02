package _02Ejemplos;

import java.util.Scanner;

public class _04TipoChar {

	public static void main(String[] args) {
		char inicialNombre = 'R';
		
		System.out.println("La inicial de mi nombre es "+inicialNombre);
		
		inicialNombre = 'C';
		
		//Se puede convertir de numero a caracter y de cracter a numero 
		
		char letra = 'A';
		System.out.println("Letra: "+letra);

		int letra2 = 'A';
		System.out.println("Letra2: "+letra2);
		
		System.out.println("El codigo de la B es "+(int)'B' );
		System.out.println("El char de codigo 100 es "+(char)100);
		
		
		//Se puede usar aritmetica  con caracteres
		
		int letra3 = 'a'+1;
		System.out.println("Letra 3: "+letra3);
		
		//Se pueden comparar caracteres con > < >= <=
		System.out.println('a' < 'b');
		System.out.println('A'<'a');
		
		
		//Pasar una letra cualquiera a mayuscula
		char lMin = 'f';
		System.out.println("La " + lMin + " en Mayusculas es " + (char)(lMin + ('A' - 'a')));
		
		//Caracteres especiales
		System.out.println("Ho\nla");
		System.out.println("El dijo \"Hola\" ");
		System.out.println("El salto de linea se hace con \\n");
		
		
	}

}
