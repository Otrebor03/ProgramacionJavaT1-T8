package _02Ejemplos._05InterfaceGenerico;

public class Test {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("1", "luis");
		Alumno a2 = new Alumno("2", "pepe");
		
		//Ningun problema al comparar dos alumnos
		System.out.println(a1.compareTo(a2));
		
		Profesor p1 = new Profesor("20", "Sonia");
		Profesor p2 = new Profesor("27", "Esther");
		//ningun problema al comparar dos profes
		System.out.println(p1.compareTo(p2));
		
		//Si comparo un alimno con un profe
		//Compila, porque el compareTo de Alumno recibe un Object
		//Error de ejecucion cuando Alumno.compareTo hace casting a (Alumno)
		System.out.println(a1.compareTo(p2));
		
		//Si comparo un profesor con otra cosa
		//Error de compilacion porque Profesor no tiene el metodo compareTo(Alumno)
		//System.out.println(p1.compareTo(a1));

	}

}
