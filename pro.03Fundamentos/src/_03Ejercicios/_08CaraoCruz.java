package _03Ejercicios;

import java.util.Scanner;

public class _08CaraoCruz {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int cara  = 0, cruz  = 0, tiradas = 0;
		double moneda;
		double porcen_cara, porcen_cruz, diferencia;
		boolean auxiliar = true;
		
		do {
			moneda = Math.random();
			
			tiradas++;
			
			if(moneda < 0.5) {
				cara++;
			}else {
				cruz++;
			}
			
			
			diferencia = porcen(cara, tiradas) - porcen(cruz, tiradas);
			
			if(diferencia <= 0.1) {
				auxiliar = false;
			}
			
		}while(auxiliar);
		
		porcen_cara = porcen(cara, tiradas);
		porcen_cruz = porcen(cruz, tiradas);
		
		
		
		System.out.format("Veces Cara: %d %nVeces Cruz: %d %nPorcentaje Caras: %f %% %nPorcentaje Cruz: %f %% %n", cara, cruz, porcen_cara, porcen_cruz);
	}
	

	public static double porcen(int lado, int tiradas) {
		return (lado*100)/tiradas;
		
	}
	
}
