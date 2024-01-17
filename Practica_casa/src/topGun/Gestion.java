package topGun;

import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
		
		//OBJETOS
		Scanner teclado = new Scanner(System.in);
		
		
		Piloto piloto1 = new Piloto(1, "Pete Maverick", 10000, "capitan");
		Piloto piloto2 = new Piloto(2, "Natasha Phoenix", 3000, "teniente");
		Piloto piloto3 = new Piloto(3, "Bradley Rooster", 3500, "teniente");
		
		System.out.println("Introduce los datos del 4º piloto!");
		
		Piloto piloto4 = new Piloto(teclado.nextInt(),teclado.nextLine(),teclado.nextInt()
				,teclado.nextLine());
		
		System.out.println("Introduce los datos del 5º piloto!");
		
		Piloto piloto5 = new Piloto(teclado.nextInt(),teclado.nextLine(),teclado.nextInt()
				,teclado.nextLine());
		
		piloto1.mostrarPiloto();

		piloto3.mostrarPiloto();
		
		
		
		
		teclado.close();
	}

}
