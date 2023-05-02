package _03ejercicios._01gestionempleados;

public class TestEmpresa {
	public static void main(String[] args) {
		Empresa matisse = new Empresa("Matisse DAM");
		matisse.contratar(new Empleado("luis","11111A",2000,1500));
		matisse.contratar(new Empleado("rosa","22222B",2001,1550));
		matisse.contratar(new Empleado("pepe","33333C",2002,1600));
		matisse.contratar(new Empleado("lola","44444D",2003,1650));
		matisse.contratar(new Empleado("darwin","55555E",2005,1700));
		
		//subimos 10% a los que cumplen un trienio
		matisse.subirTrienio(10);
		System.out.println(matisse);
		
		Empleado e = new Empleado("","55555E",0,0);
		matisse.despedir(e);
		matisse.despedir("44444D");
		System.out.println(matisse);
		
		
	}
}
