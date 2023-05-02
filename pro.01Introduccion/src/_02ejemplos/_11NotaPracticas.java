package _02ejemplos;

import java.util.Scanner;

public class _11NotaPracticas {

	public static void main(String[] args) {
		/*
		 * La nota de practicas se calcula de la siguiente forma:
		 * - Las practicas aprobadas suman 1 pto(si se han aprobado mas de 2)
		 * - Las suspendidas suman 0.5 pto(si hay menos de 5 sin suspender)
		 * - Las no entregadas restan 0.5 pto
		 * 
		 * */
		
		Scanner tec = new Scanner(System.in);
		
		int aprobados, suspendidos, noentregadas;
		double nota = 0;
		
		System.out.print("Aprobados: ");
		aprobados = tec.nextInt();
		
		System.out.print("Suspendidos: ");
		suspendidos = tec.nextInt();
		
		System.out.println("No entregados: ");
		noentregadas  = tec.nextInt();
		
		
		if(aprobados > 2) {
			nota += aprobados*1;
		}
		
		if(suspendidos < 5) {
			nota += suspendidos*0.5;
		}
		
		nota -= noentregadas * 0.5; 
		
		System.out.println(nota);
		
		
		

	}

}
