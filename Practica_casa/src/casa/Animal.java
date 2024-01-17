package casa;
import java.util.Scanner;

public class Animal {

	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		 
		String nombre = teclado.nextLine();
		int cifra = teclado.nextInt();
		
		System.out.println(nombre);
		System.out.println(cifra);
	}
}