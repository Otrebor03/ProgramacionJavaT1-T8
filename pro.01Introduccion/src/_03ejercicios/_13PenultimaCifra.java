package _03ejercicios;

import java.util.Scanner;

public class _13PenultimaCifra {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int numero, penultimaCifra;
		
		System.out.print("Di un numero para indicar su penultima cifra: ");
		numero = tec.nextInt();
		
		penultimaCifra = (numero%100)/10;
		
		System.out.format("La penultima cifra de %d es %d",numero, penultimaCifra);

	}

}