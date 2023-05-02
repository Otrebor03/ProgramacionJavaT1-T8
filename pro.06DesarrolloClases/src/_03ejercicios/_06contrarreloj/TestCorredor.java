package _03ejercicios._06contrarreloj;

import _02ejemplos._01Tiempo.*;

public class TestCorredor {
	public static void main(String[] args) {
		int d = Corredor.generarDorsal();
		Corredor c1 = new Corredor(d,"pepe",new Tiempo(10,0,0));
		
		Corredor c2 = new Corredor(Corredor.generarDorsal(),"luis", new Tiempo(10,10,0));
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.setLlegada(new Tiempo(10,30,0));
		try {
			c2.setLlegada(new Tiempo(10,0,0));
		} catch(IllegalArgumentException e) {
			System.out.println("Tiempo incorrecto");
		}
		System.out.println(c1);
		System.out.println(c2);
		
	}
}
