package _02Ejemplos._06RquisitosMiembros;

import java.util.Arrays;
import java.util.TreeSet;

public class TestListas {

	public static void main(String[] args) {
		//Los TreeSet requieren que los miembros implemente Comparable, de lo contrario se produce error de ejecucion
		
		TreeSet<Profesor> profesor = new TreeSet<>(Arrays.asList(
				new Profesor("1", "a"),
				new Profesor("2", "b"),
				new Profesor("3", "c")));
	
	}

}
