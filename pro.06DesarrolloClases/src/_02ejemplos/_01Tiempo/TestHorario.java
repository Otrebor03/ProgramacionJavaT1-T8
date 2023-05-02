package _02ejemplos._01Tiempo;

public class TestHorario {
	public static void main(String[] args) {
		Horario h1 = new Horario("Matisse ESO");
		h1.anyadirFranja(new Tiempo(8,50,0));
		h1.anyadirFranja(new Tiempo(9,45,0));
		h1.anyadirFranja(new Tiempo(7,55,0));
		h1.anyadirFranja(new Tiempo(10,40,0));
		
		System.out.println(h1.toString());
		
		
		Horario h2 = new Horario("Matisse tarde");
		h2.anyadirFranja(16,0);
		h2.anyadirFranja(17,0);
		System.out.println(h2);
				
	}
}
