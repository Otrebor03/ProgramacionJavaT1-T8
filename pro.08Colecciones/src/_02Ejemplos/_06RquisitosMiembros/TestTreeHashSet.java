package _02Ejemplos._06RquisitosMiembros;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class TestTreeHashSet {

	public static void main(String[] args) {
		//Los HashSet y LinkedHashSet requieren que la clase miembro tenga reescrito el metodo hashCode()
		//Con la clase Cliente no funcionaria bien: 
		//contains no encontraria elementos
		//la insercion podria admitir duplicados
		
		TreeSet<Cliente> cliente = new TreeSet<>(Arrays.asList(
				new Cliente("1", "a"),
				new Cliente("2", "b"),
				new Cliente("3", "c")));
		
		System.out.println(cliente.contains(new Cliente("1", "a")));
		System.out.println(cliente);
		
		System.out.println("----------------------------------------");
		
		HashSet<Proveedor> proveedor = new HashSet<>(Arrays.asList(
				new Proveedor("1", "a"),
				new Proveedor("1", "a"),
				new Proveedor("2", "b"),
				new Proveedor("3", "c")));
		
		System.out.println(proveedor.contains(new Proveedor("1", "a")));
		System.out.println(proveedor);
		
		
		
	}

}
