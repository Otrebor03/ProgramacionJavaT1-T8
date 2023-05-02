package _02Ejemplos._07Ordenacion;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenancion1PorDefecto {
	//Vamos a ordenar una coleccion de vehiculos con la ordenacion por defecto
	//La ordenacion por defecto es la que marca el metodo compareTo del objeto
	//que estamos ordenando (en este caso el compareTo de vehiculo)
	//Es requisitop que la clase Vehiculo implements Comparable<>
	
	public static void main(String[] args) {
		ArrayList<Vehiculo> lista = new ArrayList<>();	
		lista.add(new Vehiculo("1234ABC", "FORD", "FIESTA", 1200));
		lista.add(new Vehiculo("4321ABC", "Audi", "A3", 1300));
		lista.add(new Vehiculo("1234CDE", "Dacia", "Duster", 1200));
		lista.add(new Vehiculo("1224ABC", "Citroen", "C4", 1200));
		lista.add(new Vehiculo("1434ABC", "FORD", "TWINGO", 1200));
		
		Collections.sort(lista);
		for(Vehiculo v: lista) {
			System.out.println(v);
		}
	
	}
}

