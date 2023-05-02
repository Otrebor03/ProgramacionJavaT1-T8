package _02Ejemplos;

public class _06SentenciaFor {

	public static void main(String[] args) {
		
		
		System.out.println("Mostrar del 1 al 5");
		// Mostrar del 1 al 5
		//con While
		int num = 1;
		while (num <= 5) {
			System.out.println(num);
			num++;
		}
		
		System.out.println();
		
		//Con For
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("Sumar numeros entre 1 y 3");
		
		//Sumar numeros entre 1 y 3
		//Con While
		num = 1;
		int suma = 0;
		while(num <= 3) {
			suma += num;
			num++;
		}
		System.out.println(suma);
		
		
		System.out.println();
		
		//Con For
		suma = 0;
		for(int i = 1; i <= 3; i++) {
			suma += i;
		}
		System.out.println(suma);
		
		
		
		
	}
	

}
