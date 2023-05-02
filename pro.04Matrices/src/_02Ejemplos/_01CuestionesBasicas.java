package _02Ejemplos;

import java.util.Arrays;

public class _01CuestionesBasicas {

	public static void main(String[] args) {
		int [][] m = new int [2][3];
		
		//Si se imprime una matriz aparece el tipoy la direccion 
		System.out.println(m);
		
		//Acceder a los componentes del array
		m[0][0] = 10;
		m[0][1] = 12;
		m[1][0] = 3;
		
		//Si imprimimos la matriz con Arrays,toString() nos mustra un array de arrays
		System.out.println(Arrays.toString(m));
		
		//Si quiero mostrar los elementos de la matriz
		System.out.println(Arrays.toString(m[0]));
		System.out.println(Arrays.toString(m[1]));
	
		//---------------------------------------
		//Inicializacionde matrices
		String[][] nombre = {
				{"ana", "lea", "rosa"},
				{"luis", "vicente", "dani"}
		};
		
		System.out.println(Arrays.toString(nombre[0]));
		System.out.println(Arrays.toString(nombre[1]));
		
		
		

	}

}
