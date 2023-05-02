package _03Ejercicios._Herencia._05Televisores;

public class testTV {

	public static void main(String[] args) {
		Tubo t1 = new Tubo("1", "2", 500, 200, "120");
		
		System.out.println(t1);
		
		Lcd l1 = new Lcd("2", "3", 600, 300, "220", "220");
		System.out.println(l1);

	}

}
