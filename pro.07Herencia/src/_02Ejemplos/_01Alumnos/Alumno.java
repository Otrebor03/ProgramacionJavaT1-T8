package _02Ejemplos._01Alumnos;

public class Alumno extends Persona{
	private int nia;
	private String grupo;
	
	public Alumno(String dni, String nombre, int nia, String grupo) {
		super(dni, nombre);
		this.nia = nia;
		this.grupo = grupo;
	}
	
	@Override
	public String toString() {
//		return getDni()+" - "+getNombre()+" - "+nia+" - "+grupo;
		return super.toString()+" - "+nia+" - "+grupo;
	}

}
