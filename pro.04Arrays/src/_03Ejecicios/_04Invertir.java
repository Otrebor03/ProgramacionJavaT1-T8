package _03Ejecicios;

import java.util.Arrays;

public class _04Invertir {

	public static void main(String[] args) {
		int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println(Arrays.toString(invertirArray(original)));

	}
	
	public static int[] invertirArray(int v[]){
		int[] aux = new int[v.length];
		int contador = 0;
		
		for(int i = v.length-1; i >= 0; i--) {
			
			aux[contador] = v[i];
			contador++;
		}
		
		return aux;
	}
	

	

}
