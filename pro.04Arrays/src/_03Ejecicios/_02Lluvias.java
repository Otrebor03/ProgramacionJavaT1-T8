package _03Ejecicios;

import java.util.Arrays;
import java.util.Scanner;

public class _02Lluvias {
	
	static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		int ini = 0;
		int fin = 3;
		double lluvia = 0;
		double[] p = { 8, 8, 0, 4, 5, 0, 7, 30, 9, 3, 7, 50, 13, 0, 15, 16, 30, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 7, 50, 7 };

		System.out.println("La lluvia total caida en el mes es de: " + lluviaTotal(p));
		System.out.println("La media de lluvia del mes es de: " + lluviaMedia(p));
		System.out.println("La cantidad de lluvia maxima es: " + lluviaMaxima(p));
		System.out.println("La cantidad minima de lluvia: " + lluviaMinima(p));
		System.out.println("El dia con mas lluvia fue: " + diaMasLluvia(p));
		System.out.println("El dia con menos lluvia fue: " + diaMenosLluvia(p));
		System.out.println("Buscar los dias con la lluvia indicada:"+(contarDiasLluviaX(p, lluvia)));
		System.out.println("LLuvia caida en un periodo de dias: "+lluviaTotalPeriodo(p, ini, fin));
		System.out.println("Dias con lluvia creciente: "+contarDiasLluviaCreciente(p));
		System.out.println("Primer dia que ha llovido la cantidad indicada: "+primerDiaLluviaX(p, 30));
		System.out.println("Ultio dia en llover la cantidad indicada: "+ultimoDiaLluviaX(p, 8));
	}

	//1
	public static double lluviaTotal(double p[]) {
		double suma = 0;

		for (int i = 0; i <= p.length - 1; i++) {
			suma += p[i];
		}

		return suma;
	}

	//2
	public static double lluviaMedia(double p[]) {
		return (lluviaTotal(p)) / p.length;
	}

	//3
	public static double lluviaMaxima(double p[]) {
		double mayor = 0;

		for (int i = 0; i <= (p.length - 1); i++) {
			if (p[i] > mayor) {
				mayor = p[i];

			}
		}

		return mayor;
	}

	//4
	public static double lluviaMinima(double p[]) {
		double menor = -1;

		for (int i = 0; i <= (p.length - 1); i++) {
			if (i == 0) {
				menor = p[i];
			} else {
				if (menor > p[i]) {
					menor = p[i];
				}
			}
		}

		return menor;
	}

	//5
	public static int diaMasLluvia(double p[]) {
		double mayor = -1;
		int dia = -1;

		for (int i = (p.length - 1); i >= 0; i--) {
			if (p[i] > mayor) {
				mayor = p[i];
				dia = i;
			}

			if (i != dia && mayor == p[i] && i < dia) {
				dia = i;
			}
		}

		return dia;

	}

	//6
	public static int diaMenosLluvia(double p[]) {
		double menor = -1;
		int dia = p.length;
		
		for(int i = (p.length); i >= 0; i--) {
			if(i == p.length) {
				menor = p[i-1];
				dia = p.length;
			}else {
				if(p[i] < menor) {
					menor = p[i];
					dia = i;
				}
				
				if(i != dia && menor == p[i] && i < dia) {
					dia = i;
				}
			}
		}

		return dia;

	}

	//7
	public static int contarDiasLluviaX (double p[], double x) {	
		int[] dias = new int[p.length];
		int contador = 0;
		
		for(int i = 0; i < p.length; i++) {
			
			if(x == p[i]) {
				contador++;	
			}
		}
		
		
		
		return contador;
		
	}

	//8
	public static double lluviaTotalPeriodo (double p[], int ini, int fin) {
		double total = 0;
		for(int i = ini; i <= fin; i++) {
			total += p[i];
		}
		
		return total;
	}
	
	//9
	public static int contarDiasLluviaCreciente(double p[]) {
		int esMenor = 0;
		
		for(int  i = 0; i < p.length; i++) {
			if(i == 30) {
				if(p[i] < p[0]) {
					esMenor++;
				}
			}else {
				if(p[i] < p[i+1]) {
					esMenor++;
				}
			}
			
		}
		
		return esMenor;
	}
	
	
	//Ejercicio 8
	//10
	public static int primerDiaLluviaX (double p[], double x) {
		int dia = 0;
		for(int i = 0; i < p.length; i++) {
			if(p[i] == x) {
				dia = i+1;
				i = p.length-1;
			}else {
				dia = -1;
			}
		}
		
		return dia;
	}
	
	//11
	public static int ultimoDiaLluviaX (double p[], double x) {
		int dia = 0;
		for(int i = p.length-1; i >= 0; i--) {
			if(p[i] == x) {
				dia = i+1;
				i = 0;
			}else {
				dia = -1;
			}
		}
		
		return dia;
	}
}
