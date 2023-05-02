package _03ejercicios;

import java.util.Scanner;

public class _17LetraNIF {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int nif, contador;
		
		System.out.print("Dime tu NIF: ");
		nif = tec.nextInt();
		
		if(nif > 99999999) {
			System.out.print("NIF falso");
		}else if(nif < 0) {
			System.out.println("NIF falso");
		}else if(nif > 0){
			contador = nif%23;
			if(contador == 0) {
				System.out.println("La letra es T");
			}else if(contador == 1) {
				System.out.println("La letra es R");
			}else if(contador == 2) {
				System.out.println("La letra es W");
			}else if(contador == 3) {
				System.out.println("La letra es A");
			}else if(contador == 4) {
				System.out.println("La letra es G");
			}else if(contador == 5) {
				System.out.println("La letra es M");
			}else if(contador == 6) {
				System.out.println("La letra es Y");
			}else if(contador == 7) {
				System.out.println("La letra es F");
			}else if(contador == 8) {
				System.out.println("La letra es P");
			}else if(contador == 9) {
				System.out.println("La letra es D");
			}else if(contador == 10) {
				System.out.println("La letra es X");
			}else if(contador == 11) {
				System.out.println("La letra es B");
			}else if(contador == 12) {
				System.out.println("La letra es N");
			}else if(contador == 13) {
				System.out.println("La letra es J");
			}else if(contador == 14) {
				System.out.println("La letra es Z");
			}else if(contador == 15) {
				System.out.println("La letra es S");
			}else if(contador == 16) {
				System.out.println("La letra es Q");
			}else if(contador == 17) {
				System.out.println("La letra es V");
			}else if(contador == 18) {
				System.out.println("La letra es H");
			}else if(contador == 19) {
				System.out.println("La letra es L");
			}else if(contador == 20) {
				System.out.println("La letra es C");
			}else if(contador == 21) {
				System.out.println("La letra es K");
			}else if(contador == 22) {
				System.out.println("La letra es E");
			}
		
		
		}

	}

}
