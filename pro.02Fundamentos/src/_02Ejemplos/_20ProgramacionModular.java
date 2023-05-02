package _02Ejemplos;

import java.util.Scanner;

public class _20ProgramacionModular {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Longitud habitacion: ");
		double l = tec.nextDouble();
		System.out.println("Anchura Habitacion:");
		double a = tec.nextDouble();
		
		// Tambien habria que ponerlo asi si no estuviese en la misma clase double sup = _20ProgramacionModular.superficie(l, a);
		double dinero = precioHabitacion(l, a);
		System.out.println("Coste: "+ dinero);
	}

	// Metodo que devuelve la superficie de un rectangulo dadas la longitud y la anchura
	public static double superficie(double longitud, double anchura) {
		//longitud y anchura son los parametros formales del metodo
		double s = longitud * anchura;
		
		return s;
		
	}
	
		//Metodo que calcula el precio de una habitacion en funcion de sus dimensiones
	public static double precioHabitacion(double longitud, double anchura) {
		//El precio se calcula a razon de 1.7 euros el metro cuadrado
		double metros = superficie(longitud, anchura);
		double precio = metros * 1.7;
	
		return precio;
	}
}
