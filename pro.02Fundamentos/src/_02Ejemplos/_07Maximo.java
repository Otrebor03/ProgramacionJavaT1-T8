package _02Ejemplos;

import java.util.Scanner;

public class _07Maximo {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Importe: ");
		double importe = tec.nextDouble();
		
		if(importe > 40) {
			double descuento = Math.min(importe*8/100.0, 12);
//			double descuento = importe * 8 / 100.0;
//			if(descuento > 12) {
//				descuento = 12;
//			}
			System.out.println("Desceunto: "+ descuento);
		}
	
	
	
	}

}
