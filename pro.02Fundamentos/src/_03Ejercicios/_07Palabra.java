package _03Ejercicios;

import java.util.Scanner;

public class _07Palabra {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		String texto,primera_palabra, segunda_palabra, tercera_palabra;
		char primera_letra, ultima_letra; 
		int posicion_espacio, segundo_espacio, tercer_espacio, busca_coma, busca_coma2, busca_coma3, busca_punto, busca_punto2, busca_punto3, inversa3;
		
		System.out.println("Introduzca un texto: ");
		texto = tec.nextLine() + " ";
		
		//texto = texto.trim();
		
		int long_texto = texto.length();
		
		
		//PRIMERA LETRA
		primera_letra = texto.charAt(0);  
		
		
		
		//ULTIMA LETRA
		ultima_letra = texto.charAt(long_texto-1); //La ultima letra

		
		
		//Comprueba que el ultimo digito de la ultima letra no sea un punto o coma y en caso de serlo lo quita
		if(ultima_letra == '.') {
			ultima_letra = texto.charAt(long_texto-2);
		}else if(ultima_letra == ','){
			ultima_letra = texto.charAt(long_texto-2);
		}else if(ultima_letra == ' '){
			ultima_letra = texto.charAt(long_texto-2);
		}else {
			ultima_letra = texto.charAt(long_texto-1);
		}



		//POSICIONES ESPACIOS
		posicion_espacio = texto.indexOf(' ');//Posicion del primer espacio
		
		segundo_espacio = texto.indexOf(' ', posicion_espacio+1);//Posicion segundo espacio
		
		tercer_espacio = texto.indexOf(' ', segundo_espacio+1); //Posicion del tercer espacio
		
		 
		
		//BUSCA COMAS
	
		busca_coma = texto.indexOf(',', 0);
		busca_coma2 = texto.indexOf(',', posicion_espacio+1);
		busca_coma3 = texto.indexOf(',', segundo_espacio+1);
		
		if(busca_coma == busca_coma2) {
			busca_coma = -1;
		}
		
		if(busca_coma2 == busca_coma3) {
			busca_coma2 = -1;
		}
		
		//BUSCA PUNTOS
		busca_punto = texto.indexOf('.', 0);
		busca_punto2 = texto.indexOf('.', posicion_espacio+1); 
		busca_punto3 = texto.indexOf('.', segundo_espacio+1);
		
		if(busca_punto == busca_punto2) {
			busca_punto = -1;
		}
		
		if(busca_punto2 == busca_punto3) {
			busca_punto2 = -1;
		}
		
		
		//ELIMINAR PUNTOS, COMAS E IMPRIMIR
		//Primera Palabra
		if(busca_coma >= 0) {
			primera_palabra = texto.substring(0, posicion_espacio-1); //La primera palabra
		}else if(busca_punto >= 0){
			primera_palabra = texto.substring(0, posicion_espacio-1); //La primera palabra
		}else {
			if(long_texto == posicion_espacio)
			{
				primera_palabra = texto.substring(0, posicion_espacio); //La primera palabra
			}else {
				primera_palabra = texto.substring(0, posicion_espacio) + ' '; //La primera palabra
			}
			
		}
		
		//Segunda Palabra
		if(busca_coma2 > 0) {
			
			segunda_palabra = texto.substring(posicion_espacio+1, segundo_espacio-1); //La segunda palabra
		}else if(busca_punto2 > 0){
			segunda_palabra = texto.substring(posicion_espacio+1, segundo_espacio-1); //La segunda palabra
		}else {
			if(long_texto != segundo_espacio)
			{
				segunda_palabra = texto.substring(posicion_espacio+1, segundo_espacio);
			}else {
				segunda_palabra = texto.substring(posicion_espacio+1, segundo_espacio);
			}
		}
		
		
		//Tercera Palabra
		
		if(busca_coma3 >= 0) {
			tercera_palabra = texto.substring(segundo_espacio+1, tercer_espacio-1);
		}else if(busca_punto3 >= 0) {
			tercera_palabra = texto.substring(segundo_espacio+1, tercer_espacio-1);
		}else {
			if(tercer_espacio == -1) {
				inversa3 = texto.lastIndexOf(' ');
				tercera_palabra = texto.substring(inversa3);
			}else {
				tercera_palabra = texto.substring(segundo_espacio+1, tercer_espacio);
			}
		}
		

		
		System.out.format("La primera letra es: %s %nLa ultima letra es: %s %nLa primera palabra es: %s %nLa segunda palabra es: %s %nLa tercera palabra es: %s", primera_letra, ultima_letra, primera_palabra, segunda_palabra, tercera_palabra);
		


	}

}