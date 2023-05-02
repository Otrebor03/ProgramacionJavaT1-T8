package _03ejercicios._01gestionempleados;

import java.util.Calendar;

public class Empleado implements Comparable<Empleado>{
	//Constante: Numero de horas de la jornada ordinaria
	final static int HORAS_JORNADA_ORDINARIA = 40;
	
	
	private String nombre;
	private String dni;
	private int anyo;
	private double sueldo;
	
	
	
	public Empleado(String nombre, String dni, int anyo, double sueldo) {
		this.nombre = nombre; //setNombre(nombre);
		this.dni = dni; //setDni(dni);
		setAnyo(anyo);
		setSueldo(sueldo);
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getDni() {
		return dni;
	}
	public int getAnyo() {
		return anyo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setAnyo(int anyo) {
		if(anyo < 0) throw new IllegalArgumentException("El anyo no puede ser negativo");
		this.anyo = anyo;
	}
	public void setSueldo(double sueldo) {
		if(sueldo < 0) throw new IllegalArgumentException("El sueldo no puede ser negativo");
		this.sueldo = sueldo;
	}
	public int antiguedad() {
		int anyoActual = Calendar.getInstance().get(Calendar.YEAR);
		int antig = anyoActual - anyo;
		if(antig < 0) {
			antig = 0;
		}
		return antig;
	}
	
	
	public int antiguedad2() {
		return Math.max(0, Calendar.getInstance().get(Calendar.YEAR) - anyo);
	}
	
	public void incrementarSueldo(double porcentaje) {
		sueldo = sueldo + sueldo * porcentaje / 100;
	//	setSueldo(getSueldo() + getSueldo() * porcentaje / 100 );
	}

	@Override
	public String toString() {
		
//		return "Nombre: " + nombre +
//				"\nDni: " + dni +
//				"\nAño de ingreso: " + anyo +
//				"\nSueldo bruto anual: " + sueldo + " €.";
		
		return String.format("Nombre: %s%nDni:%s%nAño de ingreso: %d%nSueldo bruto anual: %.2f €",
				nombre,dni,anyo,sueldo);
				
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if( ! (o instanceof Empleado)) return false;
		
		Empleado e = (Empleado) o;
		if(this.dni.equals(e.dni)) {
			return true;
		} else {
			return false;
		}
		//o bien
		//return this.dni.equals(((Empleado)o).dni);
		
	}
	public int compareTo(Empleado e) {
//		int comparacion = this.dni.compareTo(e.dni);
//		if(comparacion < 0) return -1;
//		else if(comparacion > 0) return 1;
//		else return 0;
		
		return this.dni.compareTo(e.dni);
		
	}
	
	public static double calcularIRPF (double salarioMensual) {
		
		double irpf;
		if(salarioMensual < 800) irpf = 3;
		else if(salarioMensual < 1000) irpf = 10;
		else if(salarioMensual < 1500) irpf = 15;
		else if(salarioMensual < 2100) irpf = 20;
		else  irpf = 30;
		
		return irpf;
	}
	
	

}
