package _03Ejercicios;

public class _21Mitades {
	public static void main(String[] args) {
		String[][] m1 = {
				{"A","A","A","A","A"},
				{"A","A","A","A","A"},
				{"A","A","A","A","A"},
				{"A","A","A","A","A"},
				{"A","A","A","A","A"},
				{"A","A","A","A","A"},
				{"A","A","A","A","A"},
		};
		izquierdaDerecha(m1);
	}
	private static void inferiorSuperior(String[][] m) {
		int inf = 0, sup = 0;
		//Mitad superior
		for (int i = 0; i < m.length / 2; i++) {
			for (int j = 0; j < m[i].length; j++) {
				sup = sup + m[i][j].length(); 
			}
		}
		//Mitad inferior
		if(m.length % 2 == 0) {
			for (int i = m.length / 2 ; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					inf = inf + m[i][j].length(); 
				}
			}
		} else {
			for (int i = m.length / 2 + 1 ; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					inf = inf + m[i][j].length(); 
				}
			}
		}
		if(inf > sup) System.out.println("INFERIOR");
		else if(sup > inf) System.out.println("SUPERIOR");
		else System.out.println("IGUALES");
	}
	private static void inferiorSuperior2(String[][] m) {
		int inf = 0, sup = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if(m.length % 2 == 0) {
					//Filas pares
					if(i < m.length / 2) sup +=  m[i][j].length(); 
					else inf +=  m[i][j].length();
				} else {
					//Filas impares
					if(i < m.length / 2) sup +=  m[i][j].length(); 
					else if (i > m.length / 2) inf +=  m[i][j].length();
					else /* i es la fila central */;
				}
			}
		}
		if(inf > sup) System.out.println("INFERIOR");
		else if(sup > inf) System.out.println("SUPERIOR");
		else System.out.println("IGUALES");
	}
	private static void izquierdaDerecha(String[][] m) {
		int izqDesde = 0, izqHasta = (m[0].length / 2) - 1, derDesde, derHasta = m[0].length - 1;
		if(m[0].length % 2 == 0) {
			//Columnas par
			derDesde = m[0].length / 2;
		} else {
			//Columnas impar
			derDesde = m[0].length / 2 + 1;
		}
		int izq = 0, der = 0;
		//Parte izquierda
		for (int j = izqDesde; j <= izqHasta; j++) {
			for (int i = 0; i < m.length; i++) {
				izq += m[i][j].length();
			}
		}
		//Parte derecha
		for (int j = derDesde; j <= derHasta; j++) {
			for (int i = 0; i < m.length; i++) {
				der += m[i][j].length();
			}
		}
		
		if(izq > der) System.out.println("IZQUIERDA");
		else if(der > izq) System.out.println("DERECHA");
		else System.out.println("IGUALES");
	}
}
