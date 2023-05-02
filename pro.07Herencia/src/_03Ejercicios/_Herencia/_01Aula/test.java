package _03Ejercicios._Herencia._01Aula;

public class test {

	public static void main(String[] args) {
		Aulas a = new Aulas(1, 10, 20);
		System.out.println(a);
		System.out.println("-------------------------");
		
		Musica m = new Musica(3, 10, 20, true);
		System.out.println(m);
		System.out.println("-------------------------");
		
		Musica m2 = new Musica(4, 10, 20, false);
		System.out.println(m2);
		System.out.println("-------------------------");
		
		Informatica i = new Informatica(2, 10, 20, 5);
		System.out.println(i);
	}

}
