package _03ejercicios._03coches;

public class Coche {
	private boolean enMarcha;
	private double velActual;
	private double velMaxima;
	private double revActual;
	private double revMaxima;
	private int marcha;
	
	//Getter
	public boolean isEnMarcha() {
		return enMarcha;
	}
	public double getVelActual() {
		return velActual;
	}
	public double getVelMaxima() {
		return velMaxima;
	}
	public double getRevActual() {
		return revActual;
	}
	public double getRevMaxima() {
		return revMaxima;
	}
	public int getMarcha() {
		return marcha;
	}
	
	
	public void setEnMarcha(boolean enMarcha) {
		this.enMarcha = enMarcha;
	}
	public void setVelActual(double velActual) {
		if(velActual < 0) {
			this.velActual = 0;
		} else if(velActual > velMaxima) {
			this.velActual = velMaxima;
		} else {
			this.velActual = velActual;
		}
	}
	

	public void setVelMaxima(double velMaxima) {
		this.velMaxima = velMaxima;
	}

	public void setRevActual(double revActual) {
		this.revActual = revActual;
		if(revActual < 0) {
			this.revActual = 0;
		} else if(revActual > revMaxima) {
			this.revActual = revMaxima;
		} 
	}
	
	public void setRevMaxima(double revMaxima) {
		this.revMaxima = revMaxima;
	}
	public void setMarcha(int marcha) {
		if(marcha < 0) {
			this.marcha = 0;
		} else if(marcha > 5) {
			this.marcha = 5;
		} else {
			this.marcha = marcha;
		}
	}
	
	
	public Coche() {
		this(180,65000);
//		setVelMaxima(180); // o bien this.velMaxima = 180;
//		setRevMaxima(65000); // ....
//		setVelActual(0);
//		setRevActual(0);
//		setMarcha(0);
//		setEnMarcha(false);
	}
	public Coche(double velMaxima, double revMaxima) {
		setVelMaxima(velMaxima); // o bien this.velMaxima = revMaxima;
		setRevMaxima(revMaxima); // ....
		setVelActual(0);
		setRevActual(0);
		setMarcha(0);
		setEnMarcha(false);
	}
	public String toString() {
		String result = "";
		if(enMarcha) {
			result += "Encendido";
		} else {
			result += "Apagado";
		}
//		result += " - " + marcha + "ª";
//		result += " - " + velActual + "km/h de " + velMaxima;
//		result += " - " + revActual + "rpm de " + revMaxima;
		
		result += String.format(" - %d ª - %.1f kmh de %.1f - %.1f rpm de %.1f", marcha, velActual,velMaxima,revActual, revMaxima);
		return result;
	}
	
	public void arrancar() {
		if(!enMarcha) enMarcha = true;
	}
	public void apagar() {
		if(enMarcha) {
			enMarcha = false;
			velActual = 0;
			revActual = 0;
			marcha = 0;// o bien velActual = revActual = marcha = 0;
		}
	}
	public void acelerar (double v) {
		if(enMarcha) {
			setVelActual(velActual + v);
			setRevActual(revActual + v * 70);
		}
	}
	
	public void frenar (double v) {
		if(enMarcha) {
			setVelActual(velActual - v);
			setRevActual(revActual - v * 70);
			
			if(velActual == 0) {
				marcha = 0;
				revActual = 0;
			}
		}
	}
	
	public void subirMarcha() {
		if(enMarcha && marcha < 5) {
			marcha ++;
			setRevActual(revActual * 0.7);
		}
	}
	public void bajarMarcha() {
		if(enMarcha && marcha > 0) {
			marcha --;
			setRevActual(revActual * 1.3);
		}
	}
	
	public double consumo () {
		double c;
		if(!enMarcha || marcha == 0) {
			c = 0;
		} else {
			c = revActual / marcha / 1000;
		}
		return c;
	}
	public double consumo2 () {
		double c = 0;
		if(enMarcha && marcha != 0) {
			c = revActual / marcha / 1000;
		}
		return c;
	}
	public double tiempoParaLlegar(double km) {
		return km / velActual;
	}
	
}
