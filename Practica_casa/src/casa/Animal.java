package casa;

public class Animal {

	public void sonido() {

		System.out.println("Sonido");
	}

	public class Perro extends Animal {

		public void sonido() {

			System.out.println("Guau Guau");
		}

	}

	Animal miAnimal = new Perro();
	
	miAnimal.sonido();

}
