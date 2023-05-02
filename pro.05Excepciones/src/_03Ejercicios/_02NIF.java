package _03Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class _02NIF {

	public static void main(String[] args) {
		String dni = "50595942J";

		System.out.println(verificacionDNI(dni));
		

	}
	
	
	public static boolean verificacionDNI(String dni) {
		try {
			int n = Integer.parseInt(dni.substring(0, dni.length()-1)); 
			ArrayList<Character>letras = new ArrayList<>(Arrays.asList('T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'));
			
			if(letras.get(n % 23).equals(dni.charAt(dni.length()-1))) {
				return true;
			}else {
				return false;
			}
		}catch(NumberFormatException e) {
			return false;
		}catch(StringIndexOutOfBoundsException e) {
			return false;
		}

	}

}
