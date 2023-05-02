package _03Ejercicios;

import java.util.Scanner;

public class _13Taxi {
	
	final static double DIA_LABORAL = 0.73;
	final static double NOCHE_LABORAL = 0.84;
	final static double DOMINGOS = 0.93;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String tiempo;
		int dia;
		double precio = 0, km;
		
		System.out.println("Que dia es: ");
		dia = tec.nextInt();
		
		System.out.println("DIA o NOCHE: ");
		tiempo = tec.next();
		
		System.out.println("Cuantos Km has hecho: ");
		km = tec.nextDouble();
		
		if(dia > 0 && dia < 6) {
			if(tiempo.equals("dia") == true) {
				precio = DIA_LABORAL*km;
				if(precio < 2.95) {
					precio = 2.95;
				}
			}else {
				precio = NOCHE_LABORAL*km;
				if(precio < 4) {
					precio = 4;
				}
			}
		}else {
			precio = DOMINGOS*km;
		}
		
		System.out.format("El coste del trayecto es %feuros", precio);
			
		
		
		
		

	}

}
