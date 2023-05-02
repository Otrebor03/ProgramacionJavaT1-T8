package _03Ejercicios;
import java.util.Scanner;

public class _07Notas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int nota, contador = 0, aprobados = 0, media = 0;
		
		do {
			System.out.println("Di la nota: ");
			nota = tec.nextInt();
			
			contador++;
			
			if(nota > 4) {
				aprobados++;
			}
			
			media += nota;
			
		}while(nota > 0);
		
		media /= (contador-1);

		
		System.out.format("Numero de notas Introducidas: %d %nNumero de Aprobados: %d %nNota Media: %d", contador, aprobados, media);
	}

}
