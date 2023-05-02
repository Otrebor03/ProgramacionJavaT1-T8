package _02Ejemplos;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class _07RecorrerMap {
	public static void main(String[] args) {
		//Nombres de reyes y cuantos han habido
		Map<String, Integer> reyes = new TreeMap<>();
	
		reyes.put("Juan Carlos", 1);
		reyes.put("Felipe", 6);
		reyes.put("Carlos", 5);
		
		//Para recorrer un Map hay que recorrer su Set de claves
		Set<String> nombres = reyes.keySet();
		for(String rey: nombres) {
			Integer veces = reyes.get(rey);
			System.out.println(veces+" reyes de nombre "+rey);
		}
		
		
		//Lo mismo, de otra forma
		for(String rey: reyes.keySet()) {
			System.out.println(reyes.get(rey)+" reyes de nombre "+rey);
		}
		
		//De otra forma: Usando entrySet() que devuelve in set de objetos Entry
		for(Map.Entry<String, Integer> entry : reyes.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println(val+" reyes de nombre "+key);
		}
	}
}
