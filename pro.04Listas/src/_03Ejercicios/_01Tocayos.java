package _03Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _01Tocayos {

	public static void main(String[] args) {
		String[] grupo1 = {"luis", "ana", "juan", "manuel"};
		String[] grupo2 = {"pere", "jose", "ana", "pablo", "juan"};
		
		//Creo una lista con los elementos de grupo2
		ArrayList<String> lista = new ArrayList<>(Arrays.asList(grupo2));
		
		//Recorro el grupo1
		for(int i = 0; i < grupo1.length; i++) {
			if(lista.contains(grupo1[i])) {
				System.out.println(grupo1[i] + " tiene un tocayo");
			}
		}
		

	}

}
