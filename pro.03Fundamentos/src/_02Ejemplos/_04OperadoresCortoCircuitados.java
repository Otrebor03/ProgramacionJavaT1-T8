package _02Ejemplos;
import java.util.Scanner;
public class _04OperadoresCortoCircuitados {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Palabra: ");
		String palabra = tec.next();
		
		//Queremos comprobar si la palabra contiene una a en su posicion 5
		//Si la plabra es demasiado corta no da error
		if(palabra.length() > 5 && palabra.charAt(5) == 'a') {
			System.out.println("Tiene una a en la posicion 5");
		}else {
			System.out.println("No tiene una a en la posicion 5");
		}
		
		//si la palabra es dmesaido corta da error
		if(palabra.length() > 5 & palabra.charAt(5) == 'a') {
			System.out.println("Tiene una a en la posicion 5");
		}else {
			System.out.println("No tiene una a en la posicion 5");
		}
		
		
		
		
	}

}
