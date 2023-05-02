package _03Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _09Baloncesto {

	public static void main(String[] args) {
		List<String> faltones = new ArrayList<>(Arrays.asList("Pablo", "Roberto","Marcos", "Fran","Roberto", "Fran", "Marcos", "Roberto", "Roberto","Roberto","Marcos","Pablo","Pablo","Pablo","Pablo","Pablo"));

		 Map<String, Integer> expulsados = new HashMap<>();
		 
		 
		 for(String jugador: faltones) {
			 Integer num = expulsados.get(jugador);
			 if(num == null) {
					expulsados.put(jugador, 1);
				}else {
					num++;
					expulsados.put(jugador, num);
					if(num == 5) {
						System.out.println("Expulsado: "+jugador);
					}
				}
			}
		 
		 
	}

}
