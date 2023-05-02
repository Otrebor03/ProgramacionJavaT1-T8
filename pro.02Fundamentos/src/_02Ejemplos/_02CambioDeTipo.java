package _02Ejemplos;

public class _02CambioDeTipo {

	public static void main(String[] args) {
		 // Cambios de tipo implicitos

		
		byte b = 2;
		int i = b; //Esta convirtiendo b a tipo int antes de poder hacer la asignacion
		
		float f = 2.5f;
		double d = f; // Esta convirtiendo f a double antes de poder hacer la asignacion
		
		
		//Cambios de tipo Explicitos
		double g = 5.3;
		int h = (int)g; // Casting
	}

}
