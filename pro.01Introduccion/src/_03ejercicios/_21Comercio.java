package _03ejercicios;

import java.util.Scanner;

public class _21Comercio {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double compra = 0, descuento = 0.08, superior = 40, max = 12, descuentoCompra, compraFinal;
		
		System.out.print("Introduzca el importe de la compra: ");
		compra = tec.nextDouble();
		
		descuentoCompra = descuento * compra;
		compraFinal = compra - descuentoCompra;
		
		
		if(compra > 0) {
			if(compra > superior) {
				if(descuentoCompra > max) {
					double Superior12 = compra-12;
					System.out.println("Porcentaje del descuento aplicado: 8%");
					System.out.println("Descuento aplicado: 12 e(Ha excedido la cantidad maxima posible de dinero descontado)");
					System.out.println("Total a pagar: " +Superior12+"  e");
				}else{
					System.out.println("Porcentaje del descuento aplicado: 8%");
					System.out.println("Descuento aplicado: "+descuentoCompra+" e" );
					System.out.println("Total a pagar: " +compraFinal+"  e");	
				}	
			}else {
				System.out.println("Porcentaje del descuento aplicado: 0%");
				System.out.println("Descuento aplicado: 0 e No ha superado la cantidad minima");
				System.out.println("Total a pagar: " +compra+"  e");
			}		
		}else {
			System.out.println("Error al introducir el valor de la compra.");
		}
		
	}
}
