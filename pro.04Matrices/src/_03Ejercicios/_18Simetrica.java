package _03Ejercicios;

public class _18Simetrica {

	public static void main(String[] args) {
		int[][] m = { { 1, 5, 3 }, { 5, 4, 7 }, { 3, 7, 5 } };

		System.out.println(esSimetrica(m));

	}

	public static boolean esSimetrica(int m[][]) {
		/*
		 * Version Mala int filas = m.length; boolean simetrica = false;
		 * 
		 * //Comprobar el tamanyo de la matriz if(m.length != m[0].length) { simetrica =
		 * false; }else { for(int i = 0; i<m.length; i++) { for(int j = 0; j <
		 * m[0].length; j++) { if(m[i][j]!= m[j][i]) { simetrica = false; } } } }
		 */

		int filas = m.length;
		boolean simetrica = false;

		// Comprobar el tamanyo de la matriz
		if (m.length != m[0].length) {
			simetrica = false;
		} else {
			for (int i = 1; i < m.length && simetrica; i++) {
				for (int j = 0; j < i && simetrica; j++) {
					if (m[i][j] != m[j][i]) {
						simetrica = false;
					}
				}
			}

			

		}
		
		return simetrica;
	}
}
