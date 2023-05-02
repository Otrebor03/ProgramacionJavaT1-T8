package _03ejercicios._03coches;

public class TestCoche {
	public static void main(String[] args) {
		Coche c = new Coche();
		System.out.println(c);
		
		c.subirMarcha();
		c.acelerar(20);
		System.out.println(c);
		
		c.arrancar();
		System.out.println(c);
		c.subirMarcha();
		c.acelerar(20);
		System.out.println(c);
		c.subirMarcha();
		c.acelerar(30);
		System.out.println(c);
	}
}
