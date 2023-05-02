package _02ejemplos._02AtributosEstaticos;

public class AlumnoGradoSuperior {
	private int nia;
	private String nombre;
	
	//Todos los alumnos comparten el mismo valor del siguiente atributo
	//porque todos tienen el mismo numero de horas semanales.
	private static int horasSemanales;
	
	public AlumnoGradoSuperior(int nia, String nombre, int horasSemanales) {
		this.nia = nia;
		this.nombre = nombre;
		
		//horasSemanales es un atributo DE LA CLASE. No tiene sentido poner this
		AlumnoGradoSuperior.horasSemanales = horasSemanales;
	}
	@Override 
	public String toString() {
		return nia + " - " + nombre + " - " + horasSemanales;
	}
	
}
