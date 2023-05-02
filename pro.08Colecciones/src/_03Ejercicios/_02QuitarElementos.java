package _03Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class _02QuitarElementos {

	public static void main(String[] args) {
		
		//CASO EJERCICIO 2
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList("pepa", "pepe",  "luis"));
	     System.out.println("Lista original: " + list);

	     borrar(list, "b");
	     System.out.println("Lista 2: " + list);

	     borrar(list, "c");
	     System.out.println("Lista 3: " + list);

	     borrar(list, "d");
	     System.out.println("Lista 4: " + list);
	     
	     
	     //-------------------------------------------------------------------------------------
	     //CASO GENERICO
	     
	     ArrayList<String> lista1 = new ArrayList<>(Arrays.asList("pepa", "pepe",  "luis"));
	     borrarGenerico(lista1, new Predicate<String>(){
	    	 public boolean test(String elemento) {
	    		 if(elemento.startsWith("pe"))return true;
	    		 else return false;
	    	 }
	     });
	     System.out.println(lista1);
	     
	     
	     //-------------------------------------------------------------------------------------
	     //CASO LAMBDA
	     
	     ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
	     borrarGenerico(lista2, (n)->{return n % 2 == 0;});
	
		
		

	}
	
	public static void borrar (Collection<String> lista, String prefijo) {
		Iterator<String> iterator = lista.iterator();
		while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.startsWith(prefijo)) {
                iterator.remove();
            }
        }
		
		
	}
	
	
	//Borrar elementos de una coleccion que sea en general (generico)
	public static <T> void borrarGenerico(Collection<T> lista, Predicate<T> prefijo) {
		Iterator<T> iterador = lista.iterator();
		while (iterador.hasNext()) {
			T elemento = iterador.next();
			if(prefijo.test(elemento)) {
				iterador.remove();
			}
			
		}
		
	}

}
