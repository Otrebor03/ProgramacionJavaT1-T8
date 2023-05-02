package _02Ejemplos;

public class _07EjerciciosTema2ConFor {

	public static void main(String[] args) {

		imparesHastaN(5);
		System.out.println();

		NImpares(10);

		System.out.println();

		cuentaAtras(8);
		
		System.out.println();
		MostrarDivisoresN(5);
		
		System.out.println();
		SumaDivisoresN(5);
		
		System.out.println();
		sumaNPrimeros(10);
		

	}

	public static void imparesHastaN(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	public static void NImpares(int n){
		int contador = 0;
		for(int i = 1; contador <= n; i += 2) {
			contador++;
			System.out.println(i);
		}

	}

	public static void cuentaAtras(int n) {
		for (int i = n; i >= 0; i--) {
			System.out.println(i);
		}
	}

	public static void MostrarDivisoresN(int n) {
		int contador = 0;
		for(int i = 0; i <= n; i++) {
			contador++;
			int division = n%contador;
			if(division == 0) {
				System.out.println(contador);
			}
		}
	}
	
	public static void SumaDivisoresN(int n) {
		int contador = 0, suma = 0;
		for(int i = 0; i <= n; i++) {
			contador++;
			int division = n%contador;
			if(division == 0) {
				suma += contador;
			}
		}
		
		System.out.println("La suma es: "+suma);
	}
	
	public static void sumaNPrimeros(int n) {
		int suma = 0;
		for(int i = 1; i <= n; i++) {
			suma += i;
		}
		
		System.out.println(suma);
	}
	
}
