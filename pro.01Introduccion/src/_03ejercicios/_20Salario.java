package _03ejercicios;

import java.util.Scanner;

public class _20Salario {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double horas, precioHora, impuesto1 = 0.10, impuesto2 = 0.02, sueldo;
		int limiteExtra = 40, extra = 10, ordinaria = 6, sueldoAlto = 350;
		
		System.out.print("Cuantas horas semanales has trabajado: ");
		horas = tec.nextDouble();
		
		if(horas > 0) {
			if(horas > 40) {
				double horaExtra = horas - limiteExtra;
				precioHora = (horaExtra * extra) + (limiteExtra * ordinaria);
			}else {
				precioHora = horas * ordinaria;
			}
			
			if(precioHora > sueldoAlto) {
				sueldo = precioHora - (precioHora * impuesto1);
				System.out.format("Su sueldo semanal es de %f e", sueldo);
			}else {
				sueldo = precioHora - (precioHora * impuesto2);
				System.out.format("Su sueldo semanal es de %f e", sueldo);
			}
			
		}else {
			System.out.println("Error al introducir las horas.");
		}
		
		
	}

}
