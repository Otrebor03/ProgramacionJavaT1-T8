package _02Ejemplos._06MetodosGenericos;

public class Utiles {

	//Devolver el minimo de un array
	//Para int
	public static int minimo(int[] v) {
		int minimo = v[0];
		for(int i = 1; i < v.length; i++) {
			if(v[i] < minimo) {
				minimo = v[i];
			}
		}
		
		return minimo;

	}
	
	//Para double
	public static double minimo(double[] v) {
		double minimo = v[0];
		for(int i = 1; i < v.length; i++) {
			if(v[i] < minimo) {
				minimo = v[i];
			}
		}
		
		return minimo;

	}
	
	//Para byte, short, long, float, char, boolean... lo mismo
	
	//Para string
	public static String minimo(String[] v) {
		String minimo = v[0];
		for(int i = 1; i < v.length; i++) {
			if(v[i].compareTo(minimo)<0) {
				minimo = v[i];
			}
		}
		
		return minimo;

	}
	
	//Para un array de cualquier tipo de objetos
	//(Metodo generico  sin usar notacion de genericidad)
	public static Object minimo(Object[] v) {
		Object minimo = v[0];
		for(int i = 1; i < v.length; i++) {
			if(((Comparable)v[i]).compareTo(minimo)<0) {
				minimo = v[i];
			}
		}
		
		return minimo;
		
	}
	
	//Para un array de cualquier tipo de objetos
	//(Metodo generico usando notacion de genericidad)
	public static <T extends Comparable<T>> T maximo (T[] v) {
		T maximo = v[0];
		for(int i = 1; i < v.length; i++) {
			if(v[i].compareTo(maximo)>0) {
				maximo = v[i];
			}
		}
		return maximo;
	}

}
