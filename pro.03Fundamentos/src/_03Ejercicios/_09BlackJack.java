package _03Ejercicios;

import java.util.Scanner;

public class _09BlackJack {
	
	final static int BLACKJACK = 21;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int puntuacion = 0;
		boolean aux = true;
		char pregunta;
		
		do {
			System.out.format("Puntuacion: %d %n¿Quieres Cartas? ", puntuacion);
			pregunta = tec.next().charAt(0);
			switch(pregunta) {
			case 'S':
			case 's':
				puntuacion += cartas();
				break;
				
			case 'N':
			case 'n':
				System.out.format("Has finalizado la partida %nTu puntuacion es: %d", puntuacion);
				aux = false;
				break;
			}
			
			if(puntuacion >= BLACKJACK) {
				aux = false;
				System.out.format("Has igualado o superado 21 %nTu puntuacion es: %d", puntuacion);
			}
			
			
		}while(aux);
		
	}
	
	
	
	
	
	public static int cartas() {
		return (int) (1+Math.random()*10);
	}

}
