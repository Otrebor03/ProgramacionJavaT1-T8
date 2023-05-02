package _03Ejecicios;

import java.util.Arrays;

public class _05SumasParciales {

	public static void main(String[] args) {
		int[] v = {0, 1, 2, 3, 4, 5}; 
		
		System.out.println(Arrays.toString(sumaParcial(v)));
		
 
	}
	
	
	public static int[] sumaParcial(int v[]) {
		int[] t = new int[v.length];
		
		for(int i = 0; i < v.length; i++) {
			t[i]+=v[i];
			
			if(i!= 0) {
				t[i] = t[i-1]+v[i]; 
			}
			
		}
		
		return t;
		
	}

}
