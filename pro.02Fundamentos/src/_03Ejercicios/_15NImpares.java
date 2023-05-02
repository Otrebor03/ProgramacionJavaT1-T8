package _03Ejercicios;

import java.util.Scanner;

public class _15NImpares {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int contador = 0, numero, cont_num = 0;

		System.out.println("Di el numero de numeros impares que quieres: ");
		numero = tec.nextInt();

		while (cont_num != numero) {
			contador += 1;
			if(contador%2 != 0) {
				System.out.println(contador);
				cont_num += 1;
			}

		}

	}

}
