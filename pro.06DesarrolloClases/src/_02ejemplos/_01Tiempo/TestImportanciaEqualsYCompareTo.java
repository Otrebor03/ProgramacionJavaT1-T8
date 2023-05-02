package _02ejemplos._01Tiempo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestImportanciaEqualsYCompareTo {
	public static void main(String[] args) {
		//Vamos a rellenar una lista de objetos Tiempo con
		//los datos que indique el usuario
		ArrayList<Tiempo> lista = new ArrayList<>();
		Scanner tec = new Scanner(System.in);
		String otro;
		do {
			System.out.println("Indica hora minuto segundo: ");
			int h = tec.nextInt();
			int m = tec.nextInt();
			int s = tec.nextInt();

			//Creamos un Tiempo
			Tiempo t = new Tiempo(h,m,s);
			//Lo añadimos a la lista si no es un duplicado
			//Si equals no esta o no está bien hecho, no detectara 
			//bien los duplicados
			if(!lista.contains(t)) {
				lista.add(t);
			}
			
			System.out.println("Añadir otro (s/n): ");
			otro = tec.next();
		} while (otro.equalsIgnoreCase("s"));

		//La ordenacion que se haga dependerá del metodo compareTo de
		// la clase Tiempo
		Collections.sort(lista);
		
		System.out.println(lista);
	}
}
