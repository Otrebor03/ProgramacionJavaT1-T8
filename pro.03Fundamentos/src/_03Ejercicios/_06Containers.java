package _03Ejercicios;
import java.util.Scanner;
public class _06Containers {
	
	final static int MAXCONTENEDORES = 4;
	final static int MAXTONELADAS = 700;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int n_Contenedores = 0, pesoTotal = 0 , peso;
		
		//Bucle
		do {
			System.out.println("Indica peso del contenedor: ");
			peso = tec.nextInt();
			
			n_Contenedores++;
			pesoTotal += peso;
		}while(n_Contenedores < MAXCONTENEDORES && n_Contenedores < MAXTONELADAS);
			
		//Si hemos excedido el peso quitamos el ultimo contenedor
		if(pesoTotal > MAXTONELADAS) {
			n_Contenedores--;
			pesoTotal -= peso;
		}
		System.out.println("Num. Contenedores: " + n_Contenedores);
		System.out.println("Peso Total: " + pesoTotal);

	}

}
