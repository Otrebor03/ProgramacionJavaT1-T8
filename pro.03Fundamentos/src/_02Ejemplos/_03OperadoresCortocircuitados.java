package _02Ejemplos;

import java.util.Scanner;

public class _03OperadoresCortocircuitados {
	static Scanner tec = new Scanner(System.in); 

	public static void main(String[] args) {
		//Solo pide la nota de practicas si se aprueba la teoria
		if(pedirNotaTeoria() >= 5 && pedirNotaPracticas() >= 5) {
			System.out.println("apto");
		}else {
			System.out.println("no apto");
		}
		
		//Siempre pide las dos notas: teoria y practica
		if(pedirNotaTeoria() >= 5 & pedirNotaPracticas() >= 5) {
			System.out.println("apto");
		}else {
			System.out.println("no apto");
		}

	}
	
	public static int pedirNotaTeoria() {
		System.out.println("Nota teoria: ");
		int nota = tec.nextInt();
		return nota;
	}
	
	public static int pedirNotaPracticas() {
		System.out.println("Nota Practica: ");
		int nota = tec.nextInt();
		
		return nota;
	}

}
