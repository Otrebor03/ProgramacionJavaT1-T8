package _03Ejecicios;

import java.util.Arrays;

public class _06Rotaciones {

	public static void main(String[] args) {
		int[] v = { 1, 2, 3, 4 };

		System.out.println("Inicial: " + Arrays.toString(v));

		for (int i = 0; i <= v.length - 1; i++) {

			rotarDerecha(v);
			System.out.println("Rotacion " + (i + 1) + ": " + Arrays.toString(v));

		}
		
		for (int i = 0; i <= v.length - 1; i++) {

			rotarIzquierda(v);
			System.out.println("Rotacion " + (i + 1) + ": " + Arrays.toString(v));

		}
		
		
	}

	public static void rotarDerecha(int v[]) {

		int ultima = v[v.length - 1];
		for (int i = (v.length - 1); i >= 0; i--) {
			if (i == 0) {
				v[i] = v[v.length - 1];
			} else {
				v[i] = v[i - 1];
			}
		}
		v[0] = ultima;
	}

	public static void rotarIzquierda(int v[]) {
		int ultima = v[0];

		for (int i = 0; i < v.length; i++) {
			if (i == (v.length - 1)) {
				v[v.length - 1] = ultima;
			} else {
				v[i] = v[i + 1];
			}

		}
	}
}
