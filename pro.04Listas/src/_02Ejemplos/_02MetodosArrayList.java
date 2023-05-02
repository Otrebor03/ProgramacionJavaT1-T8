package _02Ejemplos;
import java.util.ArrayList;
public class _02MetodosArrayList {

	public static void main(String[] args) {
		ArrayList<String> dias = new ArrayList<>();
		
		//Tamanyo inicial
		System.out.println("Tamano inicial: "+dias.size());
		
		//Anyadir un elemento al final del array list
		dias.add("Lunes");
		dias.add("Martes");
		System.out.println(dias);
		dias.add("Jueves");
		System.out.println(dias);
		
		//Insertar un elemento en determinada posicion
		dias.add(2, "miercoles");
		System.out.println(dias);
		
		//Sobreescribir el elemento que esta en determinada posicion
		dias.set(0, "LUNES");   //dias[0] = "LUNES";
		System.out.println(dias);
		
		//Consultar el tamano del ArrayList
		System.out.println("Numero elementos: "+dias.size());
		
		//Consultar un elemento por su posicion
		System.out.println("Primer elemento: " +dias.get(0));
		System.out.println("Segundo elemento: " +dias.get(1));
		
		// Convertir a mayusculas el elemento de la posicion 1
		dias.set(1, dias.get(1).toUpperCase());   
		System.out.println(dias);
		
		//Eliminar
		dias.remove(3); //Por posicion
		System.out.println(dias);
		dias.remove("LUNES");  //Por contenido (En caso de existir varios contenidos iguales se eliminara el primero)
		System.out.println(dias);
		
		//Eliminar devuelve true si se ha podido eliminar
		if(dias.remove("agosto")) {
			System.out.println("Se ha eliminado agosto");
		}else {
			System.out.println("Agosto no estaba en la lista");
		}
		
		//Buscar elementos
		if(dias.contains("MARTES")) {
			System.out.println("MARTES esta en la lista");
		}else {
			System.out.println("MARTES no esta en la lista");
		}
		
		//Posicion de un elemnto en la lista
		System.out.println("Posicion de MARTES: "+dias.indexOf("MARTES"));
		System.out.println("Posicion de MARTES: "+dias.indexOf("SABADo"));
	
	}

}
