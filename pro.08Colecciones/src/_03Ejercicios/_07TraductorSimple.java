package _03Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _07TraductorSimple {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		Scanner f = null;
		try {
			f= new Scanner(new File("texto2"));
			while(f.hasNext()) {
				String cast = f.next();
				String ing = f.nextLine().trim();
				m.put(cast, ing);
			}
			Scanner tec = new Scanner(System.in);
			System.out.println("Frase: ");
			String frase = tec.nextLine();
		
			String[] palabras = frase.split(" ");
			for(String p: palabras) {
				String traduccion = m.get(p);
				if(traduccion == null) {
					System.out.println(p + " ");
				}else {
					System.out.println(traduccion +" ");
				}
			}
		}catch(FileNotFoundException e) {
			System.out.println("Fichero incorrecto");
		}finally {
			if(f!=null) {
				f.close();
			}
		}
		
		
		
	}
}
