package _03ejercicios._05gestionHospital;

public class Paciente implements Comparable<Paciente>{
	private String nombre;
	private int edad;
	private int gravedad;
	
	
	public Paciente(String n, int e) {
		this.nombre = n;
		this.edad = e;
		gravedad = (int) ((Math.random()*5));
	}
	
	public int getEdad() {
		return edad;
	}
	
	public int getEstado(){
		return gravedad;
	}
	
	public void mejorar() {
		if(gravedad > 0) {
			this.gravedad--;
		}
	}
	
	public void empeorar() {
		if(gravedad < 5) {
			this.gravedad++;
		}
	}
	
	@Override
	public String toString() {
		String estado = null;
		switch(gravedad) {
			case 0:
				estado = "curado";
				break;
			case 1:
				estado = "muy leve";
				break;
			case 2:
				estado = "leve";
				break;
			case 3:
				estado = "enfermo";
				break;
			case 4:
				estado = "grave";
				break;
			case 5:
				estado = "muy grave";
				break;
		}	
		
		 return String.format("%s - %d anos - %s", nombre, edad, estado);
	}
	
	@Override
	public int compareTo(Paciente o) {
		if(this.edad < o.edad) return -1;
		else if(this.edad > o.edad) return 1;
		else if(this.gravedad < o.gravedad) return -1;
		else if(this.gravedad > o.gravedad) return 1;
		else return 0;
		
		
	}
	
	
}
