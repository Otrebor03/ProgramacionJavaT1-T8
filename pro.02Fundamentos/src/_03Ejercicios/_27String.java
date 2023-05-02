package _03Ejercicios;

import java.util.Scanner;

public class _27String {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String texto;
		char letra;
		int repetir;
		
		System.out.println("Diga un texto: ");
		texto = tec.nextLine();
		
		System.out.println("Diga que letra quiere buscar: ");
		letra = tec.next().charAt(0);
		
		System.out.format("La letra indicada se repite %d veces",veces(texto, letra));
		
		System.out.println();
		
		System.out.println("Cuantas veces quieres repetir el texto: ");
		repetir = tec.nextInt();
		
		repetir(texto, repetir);
		
	}

	
	
	
	public static int veces(String texto, char letra) {
		
		int contadorLetra = 0, contador = 0;
		
		
		while(contador != texto.length()) {

			if(texto.charAt(contador) == letra) {
				contador += 1;
				contadorLetra += 1;
			}else {
				contador += 1;
			}

		}
		
		return contadorLetra;
	}
	
	
	
	
	public static void repetir(String texto, int veces) {
		int contador = 0;
		while(contador != veces) {
			contador += 1;
			System.out.println(texto);
		}
		
		
	}
}
