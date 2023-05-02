package _03Ejercicios;

public class _01ExpresionesLogicas {

	public static void main(String[] args) {
		int m = 10, j = 10, p = 10, v = 10;
		
		boolean apartA = m < 18;
		System.out.println("a: " + apartA);
		
		boolean apartB = m > j;
		System.out.println("b: " + apartB);
		
		boolean apartC = (m > j) && (m > p) && (m > v);
		System.out.println("c: " + apartC);
		
		boolean apartD = (m > j) && (m < p) && (m > v);
		System.out.println("c: " + apartD);
		
		boolean apartE = (m < 18 && j < 18);
		System.out.println("e: "+apartE);
		
		boolean apartF = (m >= 18 || j >= 18 || v >= 18 || p >= 18);
		System.out.println("f: "+apartF);
		
		boolean apartG = (m < p && j < p && m < v && j < v);
		System.out.println("g: "+apartG);
		
		boolean apartH = (m+j+p+v) > 100;
		System.out.println("h: "+apartH);
		
		boolean apartI = (m+j) > p;
		System.out.println("i: "+apartI);
		
		boolean apartJ = (m+j) > (p+v);
		System.out.println("j: "+apartJ);
		
		/*
		boolean apartK = (m < 18 && j < 18);
		System.out.println("k: "+apartK);
		
		
		boolean apartL = ((m+j+v+p)/4) < 17;
		System.out.println("l: "+apartL);
		*/
		
		boolean apartM = !(m >= 18 || j >= 18 || v >= 18 || p >= 18);
		System.out.println("m: "+apartM);
		
		boolean apartN = ((m+j+v+p)/4) < 36;
		System.out.println("n: "+apartN);
		
		
		boolean apartO = (m == j || m == p || m == v || p == j || p == v || v == j);
		System.out.println("o: "+apartO);
		
		
		boolean apartP = (j>m || j > p || j > v);
		System.out.println("p: "+apartP);
		
	
	}

}
