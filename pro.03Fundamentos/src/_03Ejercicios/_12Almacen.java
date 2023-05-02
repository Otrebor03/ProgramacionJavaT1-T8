package _03Ejercicios;

import java.util.Scanner;

public class _12Almacen {
	
	final static int MAX_UNIDADES = 500;
	final static int MIN_UNIDADES = 100;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int cantidad = 0, unidades, contador = 0, stock = MAX_UNIDADES;
	
		do {
			
			System.out.println("Introduzca la cantidad a servir el dia "+(++contador)+": ");
			cantidad = tec.nextInt();
			
			if(cantidad > MAX_UNIDADES) {
				System.out.println("Pedido demasiado grande pida otra vez\n");
			}else if(cantidad < MAX_UNIDADES && cantidad > MIN_UNIDADES && cantidad < stock) {
				stock -= cantidad;
				System.out.println("Pedido Servido");
				System.out.println("Queda en el almacen: "+stock);
				if(stock < MIN_UNIDADES) {
					System.out.println("Rebasado stock minimo. Se compra "+(MAX_UNIDADES-stock)+" unidades");
					stock = MAX_UNIDADES;
					System.out.println("Queda en el almacen: "+stock);
				}
			}else if(cantidad < MAX_UNIDADES && cantidad > MIN_UNIDADES && cantidad > stock){
				System.out.println("Stock Insuficiente");
				System.out.println("Queda en el almacen: "+stock);
			}
			
			
		}while(cantidad != 0);
		
		System.out.println("Fin del programa");
		
		

	}

}
