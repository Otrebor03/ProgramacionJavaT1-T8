package _02Ejemplos;

import java.util.Scanner;

public class _14OrdenarStrings {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Palabra 1:");
		String  pal1 = tec.next();
		
		System.out.println("Palabra 2:");
		String pal2 = tec.next();
		
		//Las mostramos ordenadas
		if(pal1.compareTo(pal2) < 0) {
			System.out.println(pal1);
			System.out.println(pal2);
		}else if(pal1.compareTo(pal2) > 0) {
			System.out.println(pal2);
			System.out.println(pal1);
		}else {
			System.out.println("Iguales");
		}
	
	
	
	}

}
