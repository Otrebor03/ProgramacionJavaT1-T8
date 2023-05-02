package _03ejercicios._05gestionHospital;

public class TestHospital {

	public static void main(String[] args) {
		Hospital h = new Hospital();
		h.ingresarPaciente("Luis", 20);
		h.ingresarPaciente("Pedro", 21);
		h.ingresarPaciente("Raul", 12);
		h.ingresarPaciente("Miguel", 30);
		h.ingresarPaciente("Rosa", 40);
		
		System.out.println(h);

		do {
			h.darAltas();
			System.out.println("____________________");
			System.out.println(h);
		}while(h.getNumLibres() < 5);
		
	}

}
