	package _03Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _05PalabrasTexto {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre del fichero: ");
		String nombreFichero = tec.nextLine();
		
		//Para averiguar que palabras contiene nos ayudamos de un set
		Set<String> s = new LinkedHashSet<>();
		//Abrimos el fichero y lo leemos palabra a palabra
		Scanner f = null;
		try {
			f = new Scanner(new File(nombreFichero));
			while(f.hasNext()) {
				String palabra = f.next();
				s.add(palabra);
				
			}
			System.out.println("Palabras del fichero: ");
			for(String palabra: s) {
				System.out.println(palabra);
			}
		}catch(FileNotFoundException e) {
			System.out.println("El fichero no existe");
		}finally {
			if(f != null) {
				f.close();
			}
		}
		
	
		
		
		

	}

}


