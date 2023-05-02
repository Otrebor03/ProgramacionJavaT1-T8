package _02Ejemplos._07Ordenacion;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenancion2PorCilindrada {
	//Vamos a ordenar una colecciond e vbehiculos por cilindrada
	//Para ello, vamos a pasar al metodo sort un objeto de la clase 
	//ComparadorPorCilindrada qie se va a encargar de determinar si un 
	//vehiculo va antes o despues que otro atendiendo a su cilindrada
	
	public static void main(String[] args) {
		ArrayList<Vehiculo> lista = new ArrayList<>();	
		lista.add(new Vehiculo("1234ABC", "FORD", "FIESTA", 1200));
		lista.add(new Vehiculo("4321ABC", "Audi", "A3", 1300));
		lista.add(new Vehiculo("1234CDE", "Dacia", "Duster", 1200));
		lista.add(new Vehiculo("1224ABC", "Citroen", "C4", 1200));
		lista.add(new Vehiculo("1434ABC", "FORD", "TWINGO", 1200));
		
		Collections.sort(lista, new ComparadorPorCilindrada());
		
		
		for(Vehiculo v: lista) {
			System.out.println(v);
		}
		
		//Ordenar por cilindrada de mayor a menor
		Collections.sort(lista, new ComparadorPorCilindrada2());
		
		for(Vehiculo v: lista) {
			System.out.println(v);
		}
	
	}
}

