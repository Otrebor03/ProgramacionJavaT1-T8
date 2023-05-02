package _03Ejercicios._Herencia._02Juegos;

public class test {

	public static void main(String[] args) {
		Juego j1 = new Juego("Juego1", "Fabricante1", 2001);
		Juego j2 = new Juego("Juego2", "Fabricante2", 2002);
		
		JuegoEnVenta j3 = new JuegoEnVenta("Juego3", "Fabricante3", 2003, 3, 33);
		JuegoEnAlquiler j4 = new JuegoEnAlquiler("Juego4", "Fabricante4", 2004, 4, 44, 444);
		
		JuegoEnVenta2 j5 = new JuegoEnVenta2("Juego5", "Fabricante5", 2005, 5, 55);
		JuegoEnAlquiler2 j6 = new JuegoEnAlquiler2("Juego6", "Fabricante6", 2006, 6, 66, 666);
		
		System.out.println("Prueba ventas: ");
		j3.vender();
		j5.quitar();
		System.out.println(j3);
		System.out.println(j5);
		
		System.out.println("Prueba alquiler: ");
		j4.alquilar();
		j6.quitar();
		System.out.println(j4);
		System.out.println(j6);
		
		System.out.println("Anyadimos de nuevo");
		j4.devolver();
		j6.devolver2();
		System.out.println(j4);
		System.out.println(j6);
		

	}

}
