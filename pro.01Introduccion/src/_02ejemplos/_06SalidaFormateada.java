package _02ejemplos;

public class _06SalidaFormateada {

	public static void main(String[] args) {
		
		int precio1 = 185, precio2 = 76;
		
		System.out.println("Numero: " + precio1 +" euros");
		System.out.println("Numero: " + precio2 +" euros");
		
		System.out.format("Numero: %d euros %n", precio1);
		System.out.format("Numero: %d euros %n", precio2);
		
		System.out.format("Numero: %5d euros %n", precio1);
		System.out.format("Numero: %5d euros %n", precio2);	
		
	
		System.out.format("Numero: %05d euros %n", precio1);
		System.out.format("Numero: %05d euros %n", precio2);	
	
		
		System.out.format("Numero: %-5d euros %n", precio1);
		System.out.format("Numero: %-5d euros %n", precio2);
	
		//Cuando pones le pones el 5 sirve para hacer una alineacion 
		//a la deracha y si se pone 05 lo rellenara con 0 el espacio 
		//a la derecha y si pones -5 alinea a la izquierda
		
		
		double estatura1 = 1.837, estatura2 = 1.87495987;
		System.out.println("Estatura "+ estatura1 + " metros" );
		System.out.println("Estatura "+ estatura2 + " metros" );
		
		System.out.format("Estatura %f metros %n", estatura1);
		System.out.format("Estatura %f metros %n", estatura2);
		
		//Con el 6 indico el sitio que quiero reservar 
		//y despues del punto los decimales que quiero coger
		System.out.format("Estatura %6.2f metros %n", estatura1);
		System.out.format("Estatura %6.2f metros %n", estatura2);
		
		//Con el 6 indico el sitio que quiero reservar 
		//y despues del punto los decimales que quiero coger 
		//y con el cero te rellena por la izquierda
		System.out.format("Estatura %06.2f metros %n", estatura1);
		System.out.format("Estatura %06.2f metros %n", estatura2);
		
		//Con el - es un alineado a la izquierda
		System.out.format("Estatura %-6.2f metros %n", estatura1);
		System.out.format("Estatura %-6.2f metros %n", estatura2);
		
	}

}


/*
 * %d ----> numeros enteros
 * %f ----> numeros decimales
 * 
 *System.out.format("______%___%___%__", ___,___,___);
 * 
 * 
 * 
 * 
 * 
 * */