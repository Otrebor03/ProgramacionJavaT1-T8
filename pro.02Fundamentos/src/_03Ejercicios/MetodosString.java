package _03Ejercicios;

public class MetodosString {

	public static void main(String[] args) {
		String palabra_minus = "palabra", palabra_mayus = "PALABRA", palabra = "palabra", frase = "          Me han quitado los espacio                 "; 
		
		
		//Convierte una palabra en todo mayusculas
		System.out.println(palabra_minus.toUpperCase());
		
		//Convierte una palabra toda en minusculas
		System.out.println(palabra_mayus.toLowerCase());
		
		//Devuelve el caracter de la posicion indicada
		System.out.println(palabra.charAt(0));
		
		//Te devuelve la posicion del caracter buscado
		System.out.println(palabra.indexOf('l'));
		//Busca desde la posicion indicada
		System.out.println(palabra.indexOf('a', 2));
		
		//Lo mismo pero mirando desde la deracha
		System.out.println(palabra.lastIndexOf('a'));
		
		//Devuelve los caracteres que esten entre los valores indicados
		System.out.println(palabra.substring(3, 5));
		//Devuelve apatir de la posicion indicada
		System.out.println(palabra.substring(2));
		
		//Elimina los espacios de principio y fin
		System.out.println(frase.trim());
		
		//Cuenta cuanto mide la palabra
		System.out.println(palabra.length());

	}

}
