package _02Ejemplos;

public class _08Aleatorios {

	public static void main(String[] args) {
		//Math.random() genera numeros aleatorios [0 y 1[
		
		double num0y1 = Math.random();
		System.out.println("Numero en [0 y 1[: "+num0y1);

		System.out.println("Numero en [0 y 10[: "+num0y1*10);
		
		System.out.println("Numero en [0 y 10[: "+num0y1*100);
		
		System.out.println("Numero en [20 y 30[: "+(20+num0y1*10));
		
		//Numeros enteros 
		System.out.println("Entero en [0,7[ "+ (int)(Math.random()*7));
		
		//Lanzar un dado (valor entero entre [1 y 6]
		System.out.println("Dado: "+ (1+(int)(Math.random()*6)));
	}

}
