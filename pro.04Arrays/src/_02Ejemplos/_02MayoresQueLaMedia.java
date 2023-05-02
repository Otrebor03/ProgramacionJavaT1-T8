package _02Ejemplos;

import java.util.Scanner;

public class _02MayoresQueLaMedia {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int cont=0, suma = 0;
		while(cont < 3) {
			System.out.println("Nota: "+(cont+1)+": ");
			int nota = tec.nextInt();
			
			suma+=nota;
			cont++;
		}
		
		double media = suma/3.0;
		System.out.println("Media: "+media);

		//Mostrar que notas estan por encima de la media NO SE PUEDE porque no he guardado las notas
		
	}

}
