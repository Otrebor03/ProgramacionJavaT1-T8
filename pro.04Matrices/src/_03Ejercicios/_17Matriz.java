package _03Ejercicios;

public class _17Matriz {

	public static void main(String[] args) {
		int[][] matriz = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } };

		mostrarDiagonal(matriz);
		System.out.println("_____________________________");
		System.out.println(filaDelMayor(matriz));
		System.out.println("_____________________________");
		intercambiarFilas(matriz, 0, 2);

	}

	public static void mostrarDiagonal(int m[][]) {
		
		for(int i = 0; i < m.length; i++) {
			System.out.println(m[i][i ]);
		}
		
		
		
		/*Opcion valida pero no recomendada
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (i == j) {
					System.out.println(m[i][j]);
				}
			}
		}*/
	}

	public static int filaDelMayor(int m[][]) {
		int mayor, fila = 0, aux = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				mayor = m[i][j];
				fila = i;
				if (mayor < aux) {
					mayor = aux;
					fila = i;
				}

			}
		}

		return fila + 1;
	}

	public static void intercambiarFilas(int[][] n, int f1, int f2) {
		/*Forma rapida
		 * for(int j = 0; j<m[0].length; j++){
			  int aux = m[f1][j];
			  m[f1][j] = m[f2][j];
			  m[f2][j] = aux;
		 * }
		 * */

		int[] aux = n[f1];
		int[] aux1 = n[f2];

		for (int i = 0; i < n.length; i++) {

			for (int j = 0; j < n[i].length; j++) {
				if (i == f1) {
					j = n.length;
					for (int k = 0; k < aux1.length; k++) {
						System.out.println(n[f2][k]);
					}
				} else if (i == f2) {
					j = n.length;
					for (int k = 0; k < aux.length; k++) {
						System.out.println(n[f1][k]);
					}
				} else {
					System.out.println(n[i][j]);
				}
			}
		}

	}
}
