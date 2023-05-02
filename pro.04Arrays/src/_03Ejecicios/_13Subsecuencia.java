package _03Ejecicios;

public class _13Subsecuencia {

	public static void main(String[] args) {
		int[] n = {23, 8, 12, 6, 7, 8, 9, 10, 11, 12, 13};
		System.out.println("La secuencia comienza en la posicion "+secuencia(n));

	}
	
	
	public static int secuencia(int n[]) {
		int contador = 0, pos = -1;
		
		for(int i = 0; i <= n.length-1; i++) {
			if(i == n.length-1) {
				pos = i-contador;
			}else if(n[i]+1 != n[i+1]) {
				if(contador >= 2) {
					pos = i-contador;
					i = n.length-1;
				}else {
					contador = 0;
				}
				
			}else {
				contador++;
			}
			
			
			

		}
		
		return pos;
		
	}

}
