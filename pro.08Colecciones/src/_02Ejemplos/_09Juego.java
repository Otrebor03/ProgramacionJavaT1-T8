package _02Ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _09Juego {

	public static void main(String[] args) {
		// En un juegolos jugadores tienen 5 puntos cada uno 
		//cada vez que un jugador pierde la partida se le resta un punto
		//El primero que llega a cero pierde el juego
		
		//Tenemos en un Map Los puntos de cada jugador
		Map<String, Integer> puntos = new HashMap<>();
		puntos.put("luis", 5);
		puntos.put("ana", 5);
		puntos.put("pepe", 10);
		
		Scanner tec = new Scanner(System.in);
		boolean finJuego = false;
		while(!finJuego) {
			System.out.println("Quien pierde la partida: ");
			String nombre = tec.next();
			
			if(nombre.isEmpty() || !puntos.containsKey(nombre)) {
				System.out.println("Texto erroneo");
			}else {
				Integer punto = puntos.get(nombre);
				if(punto == 1) {
					System.out.println("Perdedor: "+nombre);
					int ganador = 0;
					String gana = null;
					for(String persona: puntos.keySet()) {
						if(ganador < puntos.get(persona)) {
							ganador = puntos.get(persona);
							gana = persona;
						}
					}
					
					System.out.println("Ganador: "+gana);
					finJuego = true;
				}else {
					puntos.put(nombre, --punto);
				}
			}
		}

	}

}
