package _02ejemplos._01Tiempo;

/**
 * Clase de programa para probar la clase Tiempo
 * @author jgarcia
 *
 */
public class TestTiempoV1 {
	public static void main(String[] args) {
		//Creamos un objeto de la clase tiempo para almacenar cuando
		//comienza la primera clase en el insti
		TiempoV1 inicio = new TiempoV1(7,55,0);
//		Tiempo inicio = new Tiempo();
//		
//		inicio.hora = 7;
//		inicio.minuto = 55;
//		inicio.segundo = 0;
		
		//Creamos un objeto de la clase tiempo para almacenar cuando
		//finaliza la primera clase en el insti
		TiempoV1 fin = new TiempoV1(8,50,0);
//		Tiempo fin = new Tiempo();
//		fin.hora = 8;
//		fin.minuto = 50;
//		fin.segundo = 0;
		
		//Mostramos por pantalla los objetos inicio y fin
		System.out.println("Inicio: " + inicio.toString());
		System.out.println("Fin: " + fin.toString());
		
		//Siempre que usamos un objeto como si fuera un String,
		//java llama automáticamente al metodo toString() del 
		//objeto
		System.out.println("Inicio: " + inicio);
		System.out.println("Fin: " + fin);
		
		String periodo = "Desde " + inicio + " hasta " + fin;
		System.out.println(periodo);
		
		//Podemos crear objetos Tiempo usando otros constructores
		TiempoV1 t1 = new TiempoV1("20:10:30");
		TiempoV1 t2 = new TiempoV1(21);
		TiempoV1 t3 = new TiempoV1(61);
		TiempoV1 t4 = new TiempoV1(3661);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
	}

}
