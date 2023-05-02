package _02Ejemplos._03Animales;

public class Gato extends Felino implements Paseable{
	@Override
	public void saludar() {
		System.out.println("Miau Miau");
	}
	
	@Override
	public void trepar() {
		System.out.println("Se trepar pero no bajar");
	}
	
	public void pasear() {
		System.out.println("Gato paseando");
	}
}
