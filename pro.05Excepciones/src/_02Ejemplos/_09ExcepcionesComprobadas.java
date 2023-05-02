package _02Ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;



public class _09ExcepcionesComprobadas {

	//Dado un fichero edades.txt que contiene edades de personas, calcular la edad media de todos ellos
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre del fichero de edades: ");
		String nombreFichero = tec.next();
		
		try {
			//La excepcion FileNotFound es COMPROBADA y java me obliga a hacer algo con ella. En este ejemplo la vamos a CAPTURAR
			Scanner f = new Scanner(new File(nombreFichero));
			int sumaEdades = 0;
			int contEdades = 0;
			while(f.hasNext()) {
				try {
					int edad = f.nextInt();
					sumaEdades += edad;
					contEdades++;
				}catch (InputMismatchException e) {
					f.next();
				}
				
			}
			System.out.println("Media: " + (sumaEdades / (double) contEdades));
		}catch(FileNotFoundException e) {
			System.out.println("El fichero no existe o no se puede abrir");
		}catch (InputMismatchException e) {
			System.out.println("El fichero contiene algun dato incorrecto");
		}

	}

}
