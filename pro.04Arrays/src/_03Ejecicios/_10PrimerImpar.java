package _03Ejecicios;

public class _10PrimerImpar {

	public static void main(String[] args) {
		int[] nums = {2, 2, 3, 4, 5, 6};
		suma(nums);
		System.out.println("La suma de numeros es de: "+suma(nums));

	}
	
	public static int suma(int n[]) {
		int suma = 0;
		for(int i = 0; i<n.length; i++) {
			if(impar(n[i])) {
				i = n.length;
			}else {
				suma+=n[i];
			}
		}
		return suma;
	}
	
	public static boolean impar(int n) {
		if(n%2 != 0) {
			return true;
		}else {
			return false;
		}
	}

}
