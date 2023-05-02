package _03Ejercicios;

import java.util.Scanner;

public class _10QuitarBlancosSobrantes {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		String frase, palabra1, palabra2, frase_final;
		
		System.out.println("Introduce dos palabras separadas por varios espacios: ");
		frase = tec.nextLine()+ " ";
		
		palabra1 = frase.substring(0, frase.indexOf(' '));
		palabra2 = (frase.substring(frase.indexOf(' '), frase.length())).trim();
		frase_final = (palabra1 + " " + palabra2).trim();
		System.out.format("Quitando espacios sobrntes: %s", frase_final);
		
		
	}

}
