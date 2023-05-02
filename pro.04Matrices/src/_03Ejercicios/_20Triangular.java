package _03Ejercicios;

public class _20Triangular {
	public static void main(String[] args) {
		int[][] m = {
				{1,0,2,0},
				{0,2,0,0},
				{1,0,3,0},
				{0,0,0,4}
				
		};
		System.out.println(triangular(m));
	}
	public static boolean triangular(int[][] m) {
		boolean tInferior = true;
		boolean tSuperior = true;
		for (int i = 0; i < m.length && (tInferior || tSuperior); i++) {
			for (int j = 0; j < m[i].length && (tInferior || tSuperior); j++) {
				if(m[i][j] != 0) {
					if(i < j) {
						tInferior = false;
					} else if(j < i) {
						tSuperior = false;
					}
				}
			}
		}
		return tInferior || tSuperior;
//		if(tInferior == true || tSuperior == true) return true;
//		else return false;
	}

}
