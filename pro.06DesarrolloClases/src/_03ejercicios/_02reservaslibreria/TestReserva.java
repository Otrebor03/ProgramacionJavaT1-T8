package _03ejercicios._02reservaslibreria;

import java.util.Scanner;

public class TestReserva {
	public static void main(String[] args) {
		Reserva r1 = leerReserva();
		Reserva r2;
		do {
			r2 = leerReserva();
		} while( r1.equals(r2));
		
		//Incrementar en 1 el numero de ejemplares
		r1.setEjemplares(r1.getEjemplares() + 1);
		r2.setEjemplares(r2.getEjemplares() + 1);
		
		// Mostrar las reservas en orden
		if(r1.compareTo(r2) < 0) {
			System.out.println(r1);
			System.out.println(r2);
		} else {
			System.out.println(r2);
			System.out.println(r1);
		}
		
	}
//	public static void main(String[] args) {
//		Reserva r1 = leerReserva();
//		Reserva r2 = leerReserva();
//		while(r1.equals(r2)) {
//			System.out.println("Iguales. Vuelve a introcirla");
//			r2 = leerReserva();
//		}
//		
//	}
	
	public static Reserva leerReserva() {
		Scanner tec = new Scanner(System.in);
		System.out.println("Nif: ");
		String nif = tec.next(); tec.nextLine();
		
		System.out.println("Nombre: ");
		String nombre = tec.nextLine();
		
		System.out.println("Telefono: ");
		String telefono = tec.nextLine();
		
		System.out.println("Codigo de libro: ");
		int codigo = tec.nextInt();
		
		System.out.println("Numero ejemplares: ");
		int ejemplares = tec.nextInt();
		
		return new Reserva(nif,nombre,telefono,codigo,ejemplares);
		
	}
}
