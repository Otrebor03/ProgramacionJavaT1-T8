package _03Ejecicios;

public class _09Tocayos {

	public static void main(String[] args) {
		String[] g1 = {"miguel","jose","ana","maria"}; 
		String[] g2 = {"ana", "jose", "lujan", "juan", "jose", "pepa", "angela", "sofia", "andres", "bartolo"};
		int menor = Math.min(g1.length, g2.length);
		String[] g3 = new String[menor];
		int contador = 0;
		
		for(int i = 0; i < g1.length; i++) {
			for(int f = 0; f < g2.length; f++) {
				if(g1[i].equals(g2[f])) {
					f = -1;
					g3[contador] = g1[i];
					contador++;
					i++;	
				}
			}			
		}
		for(int i = 0; i < g3.length; i++){
			if(g3[i]==null) {
				i =g3.length;
			}else {
				System.out.println(g3[i]+" tiene un tocayo en el segundo grupo");
			}

		}
		System.out.println(contador+" personas del primer grupo tienen tocayo");
	
	}

}
