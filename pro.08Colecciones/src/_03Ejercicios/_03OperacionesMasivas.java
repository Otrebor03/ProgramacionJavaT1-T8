package _03Ejercicios;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class _03OperacionesMasivas {

	public static Integer[] quitarDuplicados(Integer[] v) {
		//Creamos un set y añadimos los elementos del array. Esto hara que los duplicados no esten en el set
		Set<Integer> s = new LinkedHashSet<>();
		for(int i = 0; i < v.length; i++) {
			s.add(v[i]);
		}
		
		Integer[] resultado = new Integer[s.size()];
		int i = 0;
		for(Integer num: s) {
			resultado [i] = num;
			i++;
		}
		
		return resultado;
	}

	//Version corta
	public static Integer[] quitarDuplicados2(Integer[] v) {
		Set<Integer> s = new LinkedHashSet<>(Arrays.asList(v));
		
		Integer[] resultado = s.toArray(new Integer[0]);
		
		
		return resultado;
	}
}
