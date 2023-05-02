package _03Ejecicios;

import java.util.Arrays;

public class _03Dados {
	
	final static int LANZAMIENTOS = 10;
	final static int MOSTRAR_CADA = 2;

	public static void main(String[] args) {
		
		int[] cifras = new int[7];
		int contador = 0;
		
		
		do {
			
			int moneda =  (int) (Math.random()*6+1);
			
			
			switch(moneda) {
			case 1:
				cifras[1]+=1;
				break;
			case 2:
				cifras[2]+=1;
				break;
			case 3:
				cifras[3]+=1;
				break;
			case 4:
				cifras[4]+=1;
				break;
			case 5:
				cifras[5]+=1;
				break;
			case 6:
				cifras[6]+=1;
				break;
			}
			
			
			contador++;
			if(contador != 0 && contador%MOSTRAR_CADA == 0) {
				
				System.out.println("Numero de lanzamientos: "+contador);
				
				for(int i = 1; i < 7; i++) {
					
						System.out.println(i+": "+((cifras[i]*100)/contador));
				}
				
			}
			 
			
		}while(contador != LANZAMIENTOS);


		
		
		
	}
	
	

}
