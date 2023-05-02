package _02Ejemplos;
import java.util.*;
public class _08RecorrerString {

	public static void main(String[] args) {
		//Dado un String que introduce el usuariomostrarlo cada uno de sus caracteres en una linea 
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Texto: ");
		String texto = tec.nextLine();
		
		for(int pos = 0; pos < texto.length(); pos++) {
			System.out.println(texto.charAt(pos));
		}
		
		
	}

}
