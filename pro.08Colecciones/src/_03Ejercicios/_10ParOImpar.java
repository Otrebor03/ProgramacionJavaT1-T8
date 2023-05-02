package _03Ejercicios;

import java.util.ArrayList;
import java.util.Random;

public class _10ParOImpar {

	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> l = new ArrayList<>();
		for(int i = 1; i< 10; i++) {
			l.add(r.nextInt(200));
		}
		System.out.println(l);
		
		//Mostrar por pantalla los elementos pares usando el metodo forEach() de la clase ArrayList
		
			
				
	l.forEach((n) -> {if(n%2==0) {
		System.out.println(n);});
	}
		
	}

}
