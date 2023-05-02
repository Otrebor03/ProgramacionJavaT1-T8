package _02ejemplos._02AtributosEstaticos;




/*
 * Esta cñase sigue el patron SINGLETON, este patron tiene como objetivo evitar que se puedan crear varios objetos de la clase. 
 * Es decir que haya un unico objeto de la clase
 * */
public class Calendario {

	private static Calendario c = new Calendario();

	public Calendario() {
		System.out.println("Se ha creado el calendario");
		//Se incializan los atributos
		//...
		//...
		
		System.out.println("Creando calendario...");
		
		//Esto es para que el constructor tarde tiempo en ejecutarse
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println("Calendario Creado...");

	}
	
	public static Calendario getInstance() {
		return c;
	}
		
	}
	
	
	

