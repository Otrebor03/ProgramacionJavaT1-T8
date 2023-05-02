package _02Ejemplos;

import java.util.Scanner;

public class _03MayoresQueLaMedia {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int cont=0, suma = 0;
		
		int[] nota = new int[3];
		
		while(cont < 3) {
			System.out.println("Nota: "+(cont+1)+": ");
			nota[cont] = tec.nextInt();
			
			suma+=nota[cont];
			cont++;
		}
		
		double media = suma/3.0;
		System.out.println("Media: "+media);

		for(int i = 0; i < nota.length; i++) {
			if(nota[i] > media) {
				System.out.println(nota[i] + " es mayor que la media");
			}
		}
		
	}

}
