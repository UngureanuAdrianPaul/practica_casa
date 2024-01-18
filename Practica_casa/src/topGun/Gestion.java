package topGun;

import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {

		// OBJETOS
		Scanner teclado = new Scanner(System.in);

		Piloto piloto1 = new Piloto(1, "Pete Maverick", 10000, "capitan");
		Piloto piloto2 = new Piloto(2, "Natasha Phoenix", 3000, "teniente");
		Piloto piloto3 = new Piloto(3, "Bradley Rooster", 3500, "teniente");
/*
		// DATOS 4º PILOTO

		System.out.println("Introduce los datos del 4º piloto!");
		System.out.println("Número de identificación: ");
		int id4 = teclado.nextInt();
		teclado.nextLine();

		System.out.println("Nombre: ");
		String nombre4 = teclado.nextLine();

		System.out.println("Número de horas: ");
		int horas4 = teclado.nextInt();
		teclado.nextLine();

		System.out.println("Puesto: ");
		String puesto4 = teclado.nextLine();

		Piloto piloto4 = new Piloto(id4, nombre4, horas4, puesto4);

		// DATOS PILOTO 5º

		System.out.println("Introduce los datos del 5º piloto!");

		System.out.println("Número de identificación: ");
		int id5 = teclado.nextInt();
		teclado.nextLine();

		System.out.println("Nombre: ");
		String nombre5 = teclado.nextLine();

		System.out.println("Número de horas: ");
		int horas5 = teclado.nextInt();
		teclado.nextLine();

		System.out.println("Puesto: ");
		String puesto5 = teclado.nextLine();

		Piloto piloto5 = new Piloto(id5, nombre5, horas5, puesto5);

		// MOSTRAR INFORMACION PILOTOS

		piloto1.mostrarPiloto();

		piloto3.mostrarPiloto();

		piloto4.mostrarPiloto();

		piloto5.mostrarPiloto();
*/
		// CREAMOS AVIONES

		// AVION COMBATE 1

		System.out.println("Introduce los datos del avión de combate: ");

		System.out.println("Número de identificación: ");
		int idComb1 = teclado.nextInt();
		teclado.nextLine();

		System.out.println("Modelo del avión: ");
		String modeloComb1 = teclado.nextLine();

		System.out.println("Capacidad del avión: ");
		int capComb1 = teclado.nextInt();
		teclado.nextLine();

		System.out.println("¿Tiene tecnología furtiva?: ");
		boolean esFurtivoComb1 = teclado.nextBoolean();
		teclado.nextLine();

		Combate combate1 = new Combate(idComb1, modeloComb1, capComb1, piloto2, esFurtivoComb1);

		combate1.mostrarPiloto();

		System.out.println(" Tecnología furtiva?: " + combate1.isEsFurtivo());

		
		
		
		
		teclado.close();
	}

}
