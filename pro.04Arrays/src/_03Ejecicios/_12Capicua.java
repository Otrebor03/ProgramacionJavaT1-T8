package _03Ejecicios;

public class _12Capicua {

	public static void main(String[] args) {
		String[] frase = { "casa", "de", "la", "de", "casa" };
		
		if(capicua(frase)) {
			System.out.println("Es capicua");
		}else {
			System.out.println("No es capicua");
		}

	}

	public static boolean capicua(String frase[]) {
		boolean capicua = false;
		
		for(int i = 0; i < frase.length; i++) {
			for(int f = frase.length-1; f >-1; f--) {
				if(frase[i].equals(frase[f])) {
					capicua = true;
				}else {
					capicua = false;
				}
				i++;
			}
			
		}
		
		return capicua;
	}
}
