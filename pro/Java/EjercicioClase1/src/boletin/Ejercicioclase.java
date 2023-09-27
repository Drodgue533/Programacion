package boletin;

import java.util.Scanner;

public class Ejercicioclase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce tu nombre, por favor!: ");
		String miNombre = scanner.nextLine();
		System.out.println("Hola " + miNombre + "!");
		scanner.close();
	}

	/* tipo identificador = new Scanner(System.in);
	 * Ej : Scanner scanner = new Scanner(System.in);
	 * 
	 *  scanner.nextDouble();-->double
	 *  scanner.nextInt();-->int
	 *  scanner.nextLine();-->String*/

	
}
