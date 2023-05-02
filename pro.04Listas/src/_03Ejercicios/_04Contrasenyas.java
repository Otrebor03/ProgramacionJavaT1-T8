package _03Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class _04Contrasenyas {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		int posCursor = 0;
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Contrasena: ");
		String contrasenya = tec.nextLine();
		
		for(int i = 0; i < contrasenya.length(); i++) {
			char c = contrasenya.charAt(i);
			switch(c) {
			case '<': posCursor = 0; break;
			case '>': posCursor = l.size(); break;
			case '+': if(posCursor < l.size()) posCursor++; break;
			case '-': if(posCursor > 0) posCursor--; break;
			default: l.add(posCursor, ""+c); posCursor++;
			}
		}
		
		System.out.println(l);

	}

}
