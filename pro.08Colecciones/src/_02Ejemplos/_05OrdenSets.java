package _02Ejemplos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _05OrdenSets {
	/**
	 * UNa de las diferencias entre los distints tipos 
	 * de un set es el orden wn que aparecen los elemnetos al iterar
	 */
	
	public static void main(String[] args) {
		Integer[] v = {10, 1, 100, 2, 30, 4, 20, 50};
		TreeSet<Integer> ts = new TreeSet(Arrays.asList(v));
		HashSet<Integer> hs = new HashSet(Arrays.asList(v));
		LinkedHashSet<Integer> lhs = new LinkedHashSet(Arrays.asList(v));
		
		//Al mostrar los set aparecerean en distintos ordenes
		System.out.println(ts);
		System.out.println(hs);
		System.out.println(lhs);
	}
}
