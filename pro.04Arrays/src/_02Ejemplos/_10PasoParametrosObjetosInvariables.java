package _02Ejemplos;

public class _10PasoParametrosObjetosInvariables {

	public static void main(String[] args) {
		String palabra = "casa";
		
		//El paso de parametros es por referencia pero los ambios no afectan a la variable 'palabra' porque los String son objetos invariables
		pasarAMayusculas(palabra);
		System.out.println(palabra);
		palabra = pasarAMayusculas2(palabra);
		System.out.println(palabra);
		
		

	}
	
	public static void pasarAMayusculas(String p) {
		p = p.toUpperCase();
	}


	public static String pasarAMayusculas2(String p) {
		return p.toUpperCase();
	}


}

