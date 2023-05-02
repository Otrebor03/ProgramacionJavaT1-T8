package _02Ejemplos;

public class _07Busqueda {

	public static void main(String[] args) {
		int[] notas = {8, 5, 7, 9, 2, 4, 6, 7};
		
		//ejemplo de Recorrido: ¿Cuantos han suspendido?
		int susp = 0;
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] < 5) {
				susp++;
			}
		}
		System.out.println("Han suspendido "+susp+" alumnos");
		
		
		//Ejemplo de busqueda: ¿Hay algun sobresaliente?
		boolean encontradSobresaliente = false;
		for(int i = 0; i < notas.length && encontradSobresaliente == false; i++) {
			if(notas[i] >= 9) {
				encontradSobresaliente = true;
			}
		}
		
		if(encontradSobresaliente) {
			System.out.println("Hya algun sobresaliente");
		}else {
			System.out.println("No hay ningun sobresaliente");
		}
		
		//Ejemplo de busqueda: Hay algun aprobado
		int aprobados = 0;
		for(int i = 0; i < notas.length && aprobados == 0; i++) {
			if(notas[i] >= 5) {
				aprobados++;
			}
		}
		
		if(aprobados == 0) {
			System.out.println("No hay aprobados");
		}else {
			System.out.println("Hay aprobados");
		}
		
		
		//Ejemplo de busqueda: ¿Todos han suspendido?
		aprobados = 0;
		for(int i = 0; i < notas.length && aprobados == 0; i++) {
			if(notas[i] >= 5) {
				aprobados++;
			}
		}
		
		if(aprobados == 0) {
			System.out.println("Todos suspendidos");
		}else {
			System.out.println("Todos aprobados");
		}
		
		
		
		
	}

}
