package _03ejercicios._05gestionHospital;

public class TestPaciente {

	public static void main(String[] args) {
		Paciente p = new Paciente("Juan", 20);
		Paciente p2 = new Paciente("Miguel", 30);
		
		System.out.println(p);
		System.out.println(p2);
	System.out.println("_______________________");
		
		if(p.compareTo(p2) == -1) {
			System.out.println(p);
		}else if(p.compareTo(p2) == 1){
			System.out.println(p2);
		}
		
		while(p.getEstado() > p2.getEstado()) {
			p.mejorar();
		}
		
		while(p2.getEstado() > p.getEstado()) {
			p2.mejorar();
		}
		
		
		System.out.println("________________________");
		System.out.println(p);
		System.out.println(p2);
	System.out.println("_______________________");

	}
	

}
