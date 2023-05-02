package _03ejercicios._04gestorvuelos;

import _02ejemplos._01Tiempo.Tiempo;

public class TestVuelo {

	public static void main(String[] args) {
		//Tiempo t1 = new Tiempo(19, 05, 00);
		//Tiempo t2 = new Tiempo(21, 00, 00);
		Vuelo v = new Vuelo ("IB101", "Valencia", "Paris", new Tiempo(19, 05, 00), new Tiempo(21, 00, 00), 6);

		v.reservarAsiento("miguel", "11111111111A");
		v.reservarAsiento("Luis", "2222222222222B");
		v.reservarAsiento("Pablo", "33333333C");
		
		System.out.println("_______________________________________");
		System.out.println(v);
		System.out.println("_______________________________________");
		
		v.reservarAsiento("Victor", "444444444444D", 'V');
		v.reservarAsiento("Patricia", "55555555E", 'P');
		System.out.println(v);
	}

}
