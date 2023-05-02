package _03Ejercicios;

public class _15Notas {

	public static void main(String[] args) {
		int [][] notas = {
				{0, 3, 6, 8, 2},
				{0, 9, 9, 8, 4},
				{0, 0, 0, 0, 0}
		};
		
		
		
		//imprimirPorAlumno(notas);
		System.out.println("___________________________________");
		//imprimirPorAsignatura(notas);
		System.out.println("___________________________________");
		//mediasPorAlumno(notas);
		System.out.println("___________________________________");
		//mediasPorAsignaturas(notas);
		System.out.println("___________________________________");
		masFacil(notas);
		System.out.println("___________________________________");
		//suspendidas(notas);
		System.out.println("___________________________________");
		//suspensos(notas);
	}
	
	
	public static void imprimirPorAlumno (int[][]n) {
		
		for(int i = 0; i < n.length; i++ ) {
			System.out.println("Alumno "+(i+1)+": ");
			for(int j = 0; j<n[i].length; j++) {
				System.out.println("	Asignatura "+(j+1)+": "+ n[i][j]);
			}
		}
		
	}

	public static void imprimirPorAsignatura(int[][]n) {
		for(int i = 0; i<n[0].length; i++) {
			System.out.println("Asignatura "+(i+1)+": ");
			for(int j = 0; j<n.length; j++) {
				System.out.println("	Alumno "+(j+1)+": "+n[j][i]);
			}
		}
		
	}
	
	public static void mediasPorAlumno(int[][] n) {
		double media = 0;
		
		for(int i = 0; i < n.length; i++) {
			media = 0;
			for(int j = 0; j < n[i].length; j++) {
				media += (n[i][j]);
				
			}
			
			System.out.println("Media Alumno "+(i+1)+": "+media/n[i].length);
			
		}
		
		
	}
	
	public static void mediasPorAsignaturas(int[][] n) {
		
		for(int i = 0; i<n[0].length; i++) {
			double media = 0;
			for(int j = 0; j<n.length; j++) {
				media += n[j][i]; 
			}
			
			System.out.println("Media asignatura "+(i+1)+": "+media/n.length );
		}
		
		
		
	}
	
	public static void masFacil(int[][] n) {
		double facil = 0;
		int asignatura = 0;
		
		for(int i = 0; i<n[0].length; i++) {
			double media = 0;
			for(int j = 0; j<n.length; j++) {
				media += n[j][i]; 
			}
			media /=n.length;
			if(media > facil) {
				facil = media;
				asignatura = i+1;
			}
		}
		
		System.out.println("La asignatura mas facil es la "+ asignatura);
		
		
	}
	
	public static void suspendidas(int[][] n) {
		int cont;
		for(int i = 0; i < n.length; i++) {
			cont = 0;
			for(int j = 0; j<n[i].length; j++) {
				if(n[i][j] < 5) {
					cont++;
				}
				
			}
			
			if(cont == n[i].length) {
				System.out.println("El alumno "+(i+1)+" ha suspendido todo");
			}
		}
	}
	
	
	public static void suspensos(int[][] n) {
		int cont, asig;
		for(int j = 0; j<n[0].length; j++) {
			cont = 0;
			asig = 0;
			
			for(int i = 0; i<n.length; i++) {
				asig++;
				if(n[i][j] < 5) {
					cont++;
				}else {
					cont = 0;
				}
			}
			
			if(cont == asig) {
				System.out.println("La asignatura "+(j+1)+" la han suspendido todos");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
