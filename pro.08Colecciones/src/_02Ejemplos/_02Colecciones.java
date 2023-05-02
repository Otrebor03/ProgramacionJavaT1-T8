package _02Ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class _02Colecciones {

	public static void main(String[] args) {
		String[] nombre = {"ana", "luis", "angel"};
		
		ArrayList<String> listaNombres = new ArrayList<>(Arrays.asList(nombre));
		TreeSet<String> conjuntoNombres = new TreeSet<>(Arrays.asList(nombre));
	
	
		//Crear un array con los elementos de una coleccion
		//Metodo toArray() si queremos fuardar en un array de Object
		Object[] arrayObjetos = listaNombres.toArray();
//		String[] arrayString = listaNombres.toArray(); No puedo fuardar en un array de String
		
		//si quiero guardar en un array de String tengo que usar el otro metodo toArray()
		String[] arrayString = listaNombres.toArray(new String[0]); //Le estamos pidiendo que devuelva un array de String
		
		
		//Operaciones masivas
		ArrayList<String> hombres = new ArrayList<>(Arrays.asList("pepe", "luis", "miguel"));
		ArrayList<String> mujeres = new ArrayList<>(Arrays.asList("ana", "rosa", "esther"));
		ArrayList<String> jovenes = new ArrayList<>(Arrays.asList("pepe", "luis"));
		
		//¿Todos los jovenes son hombres?
		System.out.println("¿Todos los jovenes son hombres?"+hombres.containsAll(jovenes));
		
		//Hombres y mujeres juntos
		ArrayList<String> todos = new ArrayList<>();
		todos.addAll(hombres);
		todos.addAll(mujeres);
		System.out.println("Todos: "+todos);
		
		//Hombres mayores
		ArrayList<String> hombresMayores = new ArrayList<>(hombres);
		hombresMayores.removeAll(jovenes);
		System.out.println("Hombres mayores: "+ hombresMayores);
		
		//Hombres jovenes
		ArrayList<String> hombresJovenes = new ArrayList<>(hombres);
		hombresJovenes.retainAll(jovenes);
		System.out.println("Hombres mayores: "+ hombresJovenes);
	
	}

}
