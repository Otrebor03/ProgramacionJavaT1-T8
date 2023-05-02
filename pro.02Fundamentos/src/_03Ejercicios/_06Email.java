package _03Ejercicios;

import java.util.Scanner;

public class _06Email {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String direccion, nombre, subdominio, dominio; 
		int posicion_arroba, posicion_punto;
		
		System.out.print(" Introduce tu drireccion de email: ");
		direccion = tec.nextLine();
		
		posicion_arroba = direccion.indexOf('@');
		posicion_punto = direccion.indexOf('.');
		
		nombre = direccion.substring(0, posicion_arroba);
		subdominio = direccion.substring(posicion_arroba+1, posicion_punto);
		dominio = direccion.substring(posicion_punto+1, (direccion.length()));
		
		System.out.println("Nombre usuario: "+ nombre + "\nSubdominio: "+ subdominio + "\nDominio: "+ dominio);
	}

}
