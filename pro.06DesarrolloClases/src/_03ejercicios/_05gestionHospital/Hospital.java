package _03ejercicios._05gestionHospital;

import java.util.NoSuchElementException;

public class Hospital {

	private final static int MAXC = 6;

	private Paciente[] listaCamas;
	private int numLibres;

	public Hospital() {
		this.listaCamas = new Paciente[MAXC + 1];
		numLibres = MAXC;

	}

	public int getNumLibres() {
		return numLibres;
	}

	public boolean hayLibres() {
		return numLibres>0;
	}
	
	public int primeraLibre() {
		int primeraLibre = 0;
		if(hayLibres()) {
			for(int i = 1; i < listaCamas.length && primeraLibre == 0; i++) {
				if(listaCamas[i] == null) {
					primeraLibre = i;
				}
			}
			
		}
		
		return primeraLibre;
	}

	public void ingresarPaciente(String n, int e)throws NoSuchElementException {
		
		if (hayLibres()) {
			Paciente p = new Paciente(n, e);
			int habitacion = primeraLibre();
			listaCamas[habitacion] = p;
			numLibres--;
			
		}else {
			throw new NoSuchElementException("No quedan camas libres");
		}

	}

	private void darAltaPaciente(int i) {
		if(listaCamas[i] != null) {
			listaCamas[i] = null;
			numLibres++;
		}
		
	}
	
	public void darAltas() {
		for(int i = 1; i < listaCamas.length; i++) {
			if(listaCamas[i] != null) {
				listaCamas[i].mejorar();
				if(listaCamas[i].getEstado() == 0) {
					darAltaPaciente(i);
				}
			}
			
		}
	}
	
	public String toString() {
		String res = "";
		for(int i = 1; i < listaCamas.length; i++) {
			if(listaCamas[i] != null) {
				res += i + ": " + listaCamas[i].toString() + "\n";
			}
		}
		
		return res;
	}
	
}
