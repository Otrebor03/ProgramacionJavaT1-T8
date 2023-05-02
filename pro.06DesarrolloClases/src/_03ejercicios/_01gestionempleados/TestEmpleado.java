package _03ejercicios._01gestionempleados;

import java.util.Scanner;

public class TestEmpleado {
	public static void main(String[] args) {
		Empleado e1 = leerEmpleado();
		Empleado e2 = leerEmpleado();
		System.out.println(e1);
		System.out.println("----------------");
		System.out.println(e2);
		//Incrementar sueldo 20% al empleado que menos cobre
		if(e1.getSueldo() < e2.getSueldo()) {
			e1.incrementarSueldo(20);
		} else {
			e2.incrementarSueldo(20);
		}
		System.out.println("----------------");
		System.out.println(e1);
		System.out.println("----------------");
		System.out.println(e2);
		//Incrementar sueldo 10% al empleado mas antiguo
		if(e1.antiguedad() > e2.antiguedad()) {
			e1.incrementarSueldo(10);
		} else {
			e2.incrementarSueldo(10);
		}
		System.out.println("----------------");
		System.out.println(e1);
		System.out.println("----------------");
		System.out.println(e2);
		
		//Mostrar el ifpf que le corresponde a e1 y e2
		System.out.println("IRPF DE e1: " + Empleado.calcularIRPF(e1.getSueldo()));
		System.out.println("IRPF DE e2: " + Empleado.calcularIRPF(e2.getSueldo()));
		System.out.println("IRPF de un sueldo de 2000€: " + Empleado.calcularIRPF(2000));
		
	}

	public static Empleado leerEmpleado() {
		Scanner tec = new Scanner(System.in);

		System.out.println("Nombre: ");
		String nombre = tec.nextLine();
		System.out.println("Dni: ");
		String dni = tec.next();
		System.out.println("Año de ingreso: ");
		int anyo = tec.nextInt();
		System.out.println("Sueldo: ");
		double sueldo = tec.nextDouble();
		
		Empleado e = new Empleado(nombre, dni, anyo, sueldo);
		return e;
	}

}
