package _02Ejemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class _05LeerNumerosDistintos {

	public static void main(String[] args) {
		// Programa que lea 5 numeros enteros distintos entre si, si el usuario
		// introduce un numero ya introducido previamente no se tiene en cuenta
		
		//CON ARRAY
		Scanner tec = new Scanner(System.in);

		int[] numeros = new int[5];
		int cont = 0;
		while (cont < 5) {
			System.out.println("Introduce un numero " + (cont + 1) + ": ");
			int n = tec.nextInt();
			// Comprobar si es dupliado
			boolean dup = false;
			for (int i = 0; i < cont && !dup; i++) {
				if (numeros[i] == n) {
					dup = true;
				}
			}

			// Si no es un duplicado lo almacenamos en el array y lo contamos
			if (!dup) {
				numeros[cont] = n;
				cont++;
			}

		}
		
		
		
		//CON ARRAYLIST
		ArrayList<Integer> lista = new ArrayList<>();
		while(lista.size() < 5) {
			System.out.println("Introduce un numero: ");
			int n = tec.nextInt();
			if(!lista.contains(n)) {
				lista.add(n);
			}
		}

	}

}
