package _02Ejemplos;

import java.util.Arrays;

public class _09PasoParametrosPorReferencia {

	public static void main(String[] args) {
		int[] edades = {20, 30, 41, 53};
		
		System.out.println(Arrays.toString(edades));
		incrementar(edades);
		System.out.println(Arrays.toString(edades));

	}
	
	
	public static void incrementar(int[] numeros) {
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = numeros[i]+1;
		}
	}

}
