package _02Ejemplos;

public class _06MaximoDeUnArray {

	public static void main(String[] args) {
		int[] notas = { 1, 8, 7, 4, 2, 9, 5, 1, 4 };

		int notaMaxima = notas[0];// suponemos que la nota mas alta es la primera

		for (int i = 1; i < notas.length; i++) {
			if (notas[i] > notaMaxima) {
				notaMaxima = notas[i];
			}
		}
		System.out.println("la nota máxima es: " + notaMaxima);

//de otra forma
		notaMaxima = -1;// valor anormalmente bajo
		for (int i = 1; i < notas.length; i++) {
			if (notas[i] > notaMaxima) {
				notaMaxima = notas[i];
			}
		}

	}

}