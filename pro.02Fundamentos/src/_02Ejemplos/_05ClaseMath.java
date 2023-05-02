package _02Ejemplos;

import java.util.Scanner;

public class _05ClaseMath {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Numero E: "+ Math.E);
		System.out.println("Numero PI: "+ Math.PI);
		
		//Redondeo
		System.out.println("Ceil: "+ Math.ceil(49.23));	
		System.out.println("Floor: "+ Math.ceil(49.23));
		System.out.println("Round: "+ Math.round(48.23));

		//Hay dos metodos round, uno que devuelve un int y otro que devuelve un long
		long redondeo = Math.round(48.23);   //Recibe un double
		int redondeado2 = Math.round(48.23f);//Recibe un float

		System.out.println(redondeo);     
		System.out.println(redondeado2);  
	
		//Funciones trigonometricas
		System.out.println("Seno de 90: "+ Math.sin(90));
		
		//Otras funciones
		System.out.println("Valor absoluto 10: "+ Math.abs(10));
		System.out.println("Valor absoluto -10: "+ Math.abs(-10));
		

		
		
	}

}
