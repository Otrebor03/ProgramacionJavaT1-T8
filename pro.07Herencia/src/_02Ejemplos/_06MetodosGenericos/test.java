package _02Ejemplos._06MetodosGenericos;

import _02Ejemplos._05InterfaceGenerico.Alumno;
import _02Ejemplos._05InterfaceGenerico.Profesor;


public class test {

	public static void main(String[] args) {
		Profesor[] profesores = {new Profesor("1", "a"), new Profesor("2", "b")};
		Alumno[] alumnos = {new Alumno("1", "a"), new Alumno("2", "b")};
		
		Object[] personas = {new Alumno("1", "a"), new Profesor("2", "b")};
		
		System.out.println(Utiles.minimo(alumnos));
		System.out.println(Utiles.minimo(profesores));
		
		System.out.println(Utiles.maximo(alumnos));
		System.out.println(Utiles.maximo(profesores));
		
		//Este dara error de ejecucion
		System.out.println(Utiles.minimo(personas));
		
		//Este dara error de compilacion
		//System.out.println(Utiles.maximo(personas));
	}

}
