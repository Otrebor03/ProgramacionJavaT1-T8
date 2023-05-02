package _02Ejemplos._06RquisitosMiembros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		//Los TreeSet requieren  que los miembros implementen comparable 
		//de lo contrario se produce error de ejecucion
//		ArrayList<Alumno> alumnos = new ArrayList<>(Arrays.asList(
//				new Alumno("1", "a"),
//				new Alumno("2", "b"),
//				new Alumno("3", "c")));
//		
//		System.out.println(alumnos.contains(new Alumno("1", "a")));
//		System.out.println(alumnos.indexOf(new Alumno("1", "a")));
		
		//Si hacemos lo mismo con la clase Profesor, que tiene metodo equals reesvrito todo funcionara bien
		
		ArrayList<Profesor> profesor = new ArrayList<>(Arrays.asList(
				new Profesor("1", "a"),
				new Profesor("2", "b"),
				new Profesor("3", "c")));
		
		System.out.println(profesor.contains(new Profesor("1", "a")));
		System.out.println(profesor.indexOf(new Profesor("1", "a")));
		
		
		TreeSet<Cliente> cliente = new TreeSet<>(Arrays.asList(
				new Cliente("1", "a"),
				new Cliente("2", "b"),
				new Cliente("3", "c")));
		
		System.out.println(cliente.contains(new Cliente("1", "a")));
		
		
		
	}

}
