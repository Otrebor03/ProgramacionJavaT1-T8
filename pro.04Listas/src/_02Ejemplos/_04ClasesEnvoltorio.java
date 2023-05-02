package _02Ejemplos;

public class _04ClasesEnvoltorio {

	public static void main(String[] args) {
		//La forma estricta de usar string
		String nombre = new String("nombre");
		//La forma no estrivta de usar String
		String apellido = "gotera";
		
		
		// La forma estricta de usar clases envoltorio, como Integer
		Integer edad = new Integer(40);
		System.out.println(edad.intValue());
		
		//La forma no estricta de usar Integer
		Integer nota = 7;
		System.out.println(nota);

	}

}
