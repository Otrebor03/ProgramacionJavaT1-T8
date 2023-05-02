package _02Ejemplos;

public class _02Recorrido {

	public static void main(String[] args) {
		int [][]m = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15}
		};
		
		//Mostrar los elementos de la matriz fila por fila
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j<m[i].length; j++) {

				System.out.print(m[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
		
		System.out.println("____________________________________________________");
		//Mostrar todos los elementos de la matriz columna por columna
		for(int j = 0; j < m[0].length; j++) {
			for(int i = 0; i<m.length; i++) {
				System.out.print(m[i][j] +" ");
			}
			System.out.println();
		}
	
		
		
		
		
	}

}
