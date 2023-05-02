package _02Ejemplos._07Ordenacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ordenancion4PorMarca {
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
		
		Collections.sort(lista, new Comparator<Vehiculo>(){
			@Override
			public int compare(Vehiculo v1, Vehiculo v2) {
				return v1.getMarca().compareTo(v2.getMarca());
			}
		});
		
		
		for(Vehiculo v: lista) {
			System.out.println(v);
		}
		
		
	
	}
}


