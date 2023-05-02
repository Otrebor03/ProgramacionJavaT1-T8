package _03Ejecicios;

import java.util.Arrays;

public class _07DosArrays {

	public static void main(String[] args) {
		double[] n1 = {1, 1, 1, 1};
		double[] n2 = {2, 2, 2, 2};
		double[] c;
		
		if(n1.length == n2.length) {
			c = sumaArraysIguales(n1, n2);
			System.out.println("La suma es: " + Arrays.toString(c));
			
		}else {
			c = sumaArrays(n1, n2);
			System.out.println("La suma es: " + Arrays.toString(c));
		}
	}
	
	
	public static double[] sumaArraysIguales (double a[], double b[]) {
		
		double[] c = new double[a.length];
		
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i]+b[i];
		}
		
		return c;
	}


	public static double[] sumaArrays(double a[], double b[]) {
		double[] c;
		
		if(a.length > b.length) {
			c = new double[a.length];
			for(int i = 0; i < b.length; i++) {
				c[i]+=b[i];
			}
			
			for(int i = 0; i < b.length; i++) {
				c[i]+=a[i];
			}
		}else {
			c = new double[b.length];
			
			for(int i = 0; i < a.length; i++) {
				c[i]+=a[i];
				
			}
			
			for(int i = 0; i < b.length; i++) {
				c[i]+=b[i];
			}			
			
		}
		
		return c;
	}

}
