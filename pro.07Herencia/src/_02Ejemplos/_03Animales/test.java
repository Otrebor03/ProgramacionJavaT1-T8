package _02Ejemplos._03Animales;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		ArrayList<Animal> animales = new ArrayList<>();
		
		animales.add(new Gato());
		animales.add(new Tigre());
		animales.add(new Gato());
		
		//Con el perro se producira error al hacer el casting a Felino
		//animales.add(new Perro());
		
		
		//Definir saludar en animal nos permite aprovechar el polimorfismo
		for(Animal a: animales) {
			a.saludar();
		}
		
		//No puedo llamar a trepat porquie la clase Animal no tiene ese metodo
//		for(Animal a: animales) {
//			a.trepar();
//		}
		
		//podemos llamar a trepar si hacemos casting, Con el perro se producira error al hacer el casting a Felino
		for(Animal a: animales) {
			((Felino)a).trepar();
		}
		
		//Puedo llamar a pasear() de perros y gatos
		Perro p = new Perro();
		p.pasear();
		Gato g = new Gato();
		g.pasear();
		
		
		//Pero no puedo llamar a pasear sobre una lista con perros y gatos
//		ArrayList<Animal> misMascotas = new ArrayList<>();
//		misMascotas.add(new Perro());
//		misMascotas.add(new Gato());
//		
//		for(Animal a: misMascotas) {
//			a.pasear();
//		}
		
		//Usamos el interface Paseable si que puedo pasear a mis mascotas
		ArrayList<Paseable> misMascotas = new ArrayList<>();
		misMascotas.add(new Perro());
		misMascotas.add(new Gato());
		
		for(Paseable a: misMascotas) {
			a.pasear();
		}
		
		//Se puede conseguir lo mismo haciendo un casting
//		ArrayList<Animal> misMascotas = new ArrayList<>();
//		misMascotas.add(new Perro());
//		misMascotas.add(new Gato());
//		
//		for(Animal a: misMascotas) {
//			((Paseable)a).pasear();
//		}

	}

}
