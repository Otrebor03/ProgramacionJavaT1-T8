package _02Ejemplos;

import java.util.Scanner;

public class _15Multiplo {

	public static void main(String[] args) {
		int multiplo = 5;
		
		while(multiplo < 1000) {
			System.out.format("%4d es multiplo de 5%n", multiplo);
			multiplo = multiplo+5;
		}

	}

}
