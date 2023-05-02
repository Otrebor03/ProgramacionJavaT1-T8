package _03Ejercicios;

public class _03Dados {

	public static void main(String[] args) {

		int dado1 = (int)((Math.random()*6)+1), dado2 = (int)((Math.random()*6)+1), puntuacion = dado1 + dado2;
		
		System.out.format(" Dado 1: %d %n Dado 2: %d %n Puntacion Total: %d", dado1, dado2, puntuacion);

	}

}
