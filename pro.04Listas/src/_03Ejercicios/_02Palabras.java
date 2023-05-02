package _03Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class _02Palabras {

	public static void main(String[] args) {
		// Programa en el que el usuario introduce una frase y le decimos cuantas palabras distintas 
		// y cuales son:
		// Voy a la tienda de la esquina a comprar la loteria de navidad 
		// 9 palabras distintas
		//voy a la tienda de la esquina comprar loteria navidad
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Frase: ");
		
		String frase = tec.nextLine();
		String[] palabras = frase.split(" ");
		
		ArrayList<String> l = new ArrayList<>();
		
		for(int i = 0; i < palabras.length; i++) {
			if(!l.contains(palabras[i])) {
				l.add(palabras[i]);
			}
		}
		
		
		//Imprimimos la palabra
		System.out.println("Numero de palabras: "+l.size());
		for(String p: l) {
			System.out.println(p);
		}	
		
	}

}
