package _02ejemplos._01Tiempo;

public class TestTiempo {
	public static void main(String[] args) {
		
		Tiempo t = new Tiempo(20,20,30);
		System.out.println(t);
		
		//Modificamos la clase
		
		t.setHora(12); //t.hora = 12;
		t.setMinuto(t.getMinuto() + 1);
		
		System.out.println(t);
		
		//Comparar dos objetos de tipo Tiempo
		Tiempo t1 = new Tiempo(10,20,30);
		Tiempo t2 = new Tiempo(10,20,30);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t1));
		System.out.println(t1.equals("10:20:30"));
		System.out.println(t1.equals(t2));
		
		
//		t.setHora(120);
//		t.setMinuto(-23);
//		System.out.println(t);
		
		
	
		
	}
}
