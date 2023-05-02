package _02Ejemplos;

public class _09SentenciaDoWhile {

	public static void main(String[] args) {
		// Contar el numero de intentos que tenemos que hacer antes de obtener un 6 al lanzar un dado
		
		int contador = 0, dado;
		
		do {
			dado = lanzarDado();
			System.out.println("Dado: "+ dado);
			
			contador++;
			
		}while(dado != 6);
		System.out.println(contador);
		
		
	}
	
	
	public static int lanzarDado() {
		return (int) (1+Math.random() *6);
		
	}

}
