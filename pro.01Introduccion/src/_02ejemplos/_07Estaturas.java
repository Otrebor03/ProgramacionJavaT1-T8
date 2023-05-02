package _02ejemplos;

import java.util.Scanner;

public class _07Estaturas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double estatura;

		System.out.println("Diga su altura: ");
		estatura = tec.nextDouble();

		if (estatura > 2)

			System.out.print("Muy alto");

		else if (estatura > 17)

			System.out.print("Alto");

		else if (estatura > 16)

			System.out.print("Estatura media");

		else

			System.out.print("Bajo");
	}
}
