package _03Ejercicios._Herencia._04MonedasYBilletes;

public class testDinero {

	public static void main(String[] args) {
		Billetes b1 = new Billetes(10, 2003, 0.5, 0.5);
		Billetes b2 = new Billetes(20, 2004, 0.5, 0.5);
		
		Moneda m1 = new Moneda(1, 2003, 0.5, 0.1);
		Moneda m2 = new Moneda(2, 2004, 0.10, 0.2);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(m1);
		System.out.println(m2);

	}

}
