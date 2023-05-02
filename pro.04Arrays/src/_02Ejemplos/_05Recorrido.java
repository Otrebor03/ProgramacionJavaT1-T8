package _02Ejemplos;

public class _05Recorrido {

	public static void main(String[] args) {
		int[] notas = { 6, 8, 1, 3, 5 };

//mostrar por pantalla todas las notas
		for (int i = 0; i < notas.length; i++) {
			System.out.println("nota: " + (i + 1) + ": " + notas[i]);
		}

//calcular l anota media
		int suma = 0;
		for (int i = 0; i < notas.length; i++) {
			suma += notas[i];
		}
		double media = (double) suma / notas.length;
		System.out.println("media: " + media);

//contar y mostrar el numero de aprobados
		int aprobados = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 5) {
				aprobados++;
			}

		}
		System.out.println("aprobados: " + aprobados);

//mostrar por pantalla la mitad de las notas
		for (int i = 0; i < notas.length / 2; i++) {
			System.out.println("nota " + (i + 1) + ": " + notas[i]);

		}

//mostrar las notas de la ultima a la primera:recorrido descendente

		for (int i = notas.length - 1; i >= 0; i--) {
			System.out.println("nota: " + (i + 1) + ": " + notas[i]);
		}

	}

}