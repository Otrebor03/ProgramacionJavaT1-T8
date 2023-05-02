package _03Ejercicios;

import java.util.Scanner;

public class _05Nombre {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String nombre;
		char primeraLetra, ultimaLetra;
		
		System.out.print("Diga su nombre: ");
		nombre = tec.nextLine().toLowerCase();
		ultimaLetra = nombre.charAt((nombre.length())-1);
		primeraLetra = nombre.charAt(0);
		
		if(primeraLetra == ultimaLetra) {
			System.out.println("La primera y la ultima letra coinciden");
		}else {
			System.out.println("No coinciden la primera y la ultima letra");
		}

	}

}
