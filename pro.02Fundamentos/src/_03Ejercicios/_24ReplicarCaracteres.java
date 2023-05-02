package _03Ejercicios;

import java.util.Scanner;

public class _24ReplicarCaracteres {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int veces;
	
		char letra;
		
		System.out.println("Di un caracter: ");
		letra = tec.next().charAt(0);
		
		System.out.println("Di un nuumero de veces: ");
		veces = tec.nextInt();
		
		System.out.println(replicar(letra, veces));
		

	}
	
	public static String replicar (char letra, int veces) {
		String letras = "";
		int contador = 0;
		
		while(contador != veces) {
			
			contador += 1;
			letras += letra;
		}
		
		return letras;
		
		
	}
	

}
