package _02Ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _05VariosTryCatch {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int[] a = {2, 1, 3, 8, 10};
		int[] b = {5, 1, 0, 2};

		try {
			System.out.println("Dividir un elemento de a entre un elemento de b");
			System.out.println("Que posicion de a quieres dividir?");
			int posA = tec.nextInt();  //InputMismatch si no se introduce un entero
			
			System.out.println("Entre que posicion de b lo quieres dividir?");
			int posB = tec.nextInt(); //InputMismatch si no se introduce un entero
			
			
			int dividendo = a[posA];  //ArrayIndexOutOfBoundsException si la posicion es incorrecta
			int divisor = b[posB];    //ArrayIndexOutOfBoundsException si la posicion es incorrecta
			int cociente = dividendo/divisor; //ArithmeticException si se divide entre 0
			
			System.out.printf("%d / %d = %d", dividendo, divisor, cociente);
		}catch (InputMismatchException e) {
			System.out.println("Debes introducir un entero");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("La posicion no es correcta");
		}catch (ArithmeticException e) {
			System.out.println("No se puede dividir entre cero");
		}catch(Exception e) {
			System.out.println("Se ha encontrado algun otro error");
		}finally {
			System.out.println("Esto se ejecuta siempre");
		}
	}

}
