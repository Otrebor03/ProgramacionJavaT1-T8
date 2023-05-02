package _03Ejercicios;

public class _19Sombras {

	public static void main(String[] args) {
		int[][] parcela = {
				{1,2,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,1,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0}
		};
		int cont = 0;
		for (int i = 0; i < parcela.length; i++) {
			for (int j = 0; j < parcela[i].length; j++) {
				//Comprobamos si la parcela [i][j] esta libre y tiene sombra
				if(parcela[i][j] == 0) {
					if(i > 0 && j > 0 && parcela[i-1][j-1] == 1) cont ++;
					else if(i > 0 && parcela[i-1][j] == 1) cont ++;
					else if(i > 0 && j < parcela[i].length - 1 && parcela[i-1][j+1] == 1) cont ++;
					else if(j > 0 && parcela[i][j-1] == 1) cont ++;
					else if(j < parcela[i].length - 1 && parcela[i][j+1] == 1) cont ++;
					else if(i < parcela.length - 1 && j > 0 && parcela[i+1][j-1] == 1) cont ++;
					else if(i < parcela.length - 1 && parcela[i+1][j] == 1) cont ++;
					else if(i < parcela.length - 1 && j < parcela[i].length - 1 && parcela[i+1][j+1] == 1) cont ++;
				}
			}
		}
	
		System.out.println("Libres con sombra: " + cont);
	}

}
