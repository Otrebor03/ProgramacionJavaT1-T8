package _02ejemplos._02AtributosEstaticos;

import javax.naming.OperationNotSupportedException;

//Otro ejemplo de uso de atributos static:
// Queremos diseñar la clase Administrador para 
// representar a los administradores de un sistema informático
// PERO NO QUEREMOS QUE PUEDA HABER MÁS DE 3 ADMINISTRADORES
public class Administrador {
	private String nombre;
	private static int numAdministradores = 0;
	
	public Administrador(String nombre) {
		if(numAdministradores == 3) {
			throw new IllegalAccessError("No puede haber mas de 3");
		} else {
			this.nombre = nombre;
			numAdministradores++;
		}
	}

	@Override
	public String toString() {
		return nombre;
	}
}
