package _02ejemplos._02AtributosEstaticos;

public class TestCalendario {

	private static Calendario c = new Calendario();
	public static void main(String[] args) {
	
		
		Calendario c1 = Calendario.getInstance();
		Calendario c2 = Calendario.getInstance();
		Calendario c3 = Calendario.getInstance();
		Calendario c4 = Calendario.getInstance();
	}
	

}
