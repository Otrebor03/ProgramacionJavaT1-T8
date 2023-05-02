package _02Ejemplos;
import java.util.*;
public class _01MayoresQueLaMedia {

	public static void main(String[] args) {
		//El usuario introduce 3 notas y mostramos cuales estan por encima de la media
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Nota 1: ");
		int nota1 = tec.nextInt();
		
		System.out.println("Nota 2: ");
		int nota2 = tec.nextInt();
		
		System.out.println("Nota 3: ");
		int nota3 = tec.nextInt();
		
		double media = (nota1+nota2+nota3)/3.0;
		System.out.println("Media: "+media);
		
		if(nota1>media) {
			System.out.println(nota1+" esta por encima de la media");
		}
		if(nota2>media) {
			System.out.println(nota2+" esta por encima de la media");
		}
		if(nota3>media) {
			System.out.println(nota3+" esta por encima de la media");
		}
		

	}

}
