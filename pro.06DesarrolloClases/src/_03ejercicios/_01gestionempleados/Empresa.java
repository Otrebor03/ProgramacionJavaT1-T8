package _03ejercicios._01gestionempleados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Empresa {
	private String nombre;
	private ArrayList<Empleado> plantilla;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		plantilla = new ArrayList<>();
	}
	
	public int getNumeroEmpleados() {
		return plantilla.size();
	}

	//Getter y setter
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Empleado> getPlantilla() {
		return plantilla;
	}
	
	public void contratar(Empleado e) throws IllegalArgumentException {
		if(plantilla.contains(e)) { 
			throw new IllegalArgumentException("No se puede contratar a alguien que ya esta contratado");
		} else {
			plantilla.add(e);
		}
	}
	
	//Haciendo una busqueda para comprobar si está y otra para eliminar
	public void despedir (Empleado e) throws NoSuchElementException {
		if(plantilla.contains(e)) { 
			plantilla.remove(e);
		} else {
			throw new NoSuchElementException("No se puede despedir a alguien que no esta contratado");
		}
	}
	//Haciendo una sola busqueda para eliminar
	public void despedir2 (Empleado e) throws NoSuchElementException {
//		if(plantilla.remove(e) == false) { 
		if(!plantilla.remove(e) ) { 
			throw new NoSuchElementException("No se puede despedir a alguien que no esta contratado");
		}
	}
	//Recorriendo la lista con un Iterator
	public void despedir3 (Empleado e) {
		Iterator<Empleado> it = plantilla.iterator();
		boolean enc = false;
		while(it.hasNext() && !enc) {
			Empleado x = it.next();
			if(x.equals(e)) {
				enc = true;
				it.remove();
			}
		}
		if(!enc) throw new NoSuchElementException("No se puede despedir a alguien que no esta contratado");
	}
	//Recorriendo la lista con un for
	public void despedir4 (Empleado e) {
		boolean enc = false;
		for(int i = 0; i < plantilla.size() && !enc; i++) {
			Empleado x = plantilla.get(i);
			if(x.equals(e)) {
				enc = true;
				plantilla.remove(i);
			}
		}
		if(!enc) throw new NoSuchElementException("No se puede despedir a alguien que no esta contratado");
	}
	
	//Recorriendo la lista con un for
	public void despedir (String dni) {
		boolean enc = false;
		for(int i = 0; i < plantilla.size() && !enc; i++) {
			Empleado x = plantilla.get(i);
			if(x.getDni().equals(dni)) {
				enc = true;
				plantilla.remove(i);
			}
		}
		if(!enc) throw new NoSuchElementException("No se puede despedir a alguien que no esta contratado");
	}
	
	//Creando un empleado e ficticio, con el mismo dni que el que quiero eliminar
	public void despedir2 (String dni) {
		Empleado e = new Empleado("",dni,0,0);
		if(!plantilla.remove(e) ) { 
			throw new NoSuchElementException("No se puede despedir a alguien que no esta contratado");
		}
	}
	
	//Subir trienio 
	public void subirTrienio(double porcentaje) {
		for(Empleado e: plantilla) {
			//Si la antiguedad es multiplo de 3 ....
			if(e.antiguedad() % 3 == 0) {
				e.incrementarSueldo(porcentaje);
			}
		}
	}
	
	@Override 
	public String toString() {
		String res = "Empresa " + nombre;
		for(int i = 0; i < plantilla.size(); i++) {
			Empleado e  = plantilla.get(i);
			res += "\n" + e.toString(); // += "\n" + e;
		}
		
		//o bien
		res = "Empresa " + nombre;
		for(Empleado e: plantilla) {
			res += "\n" + e.toString(); // += "\n" + e;
		}
		
		return res;
	}
	

	
	

	
}
