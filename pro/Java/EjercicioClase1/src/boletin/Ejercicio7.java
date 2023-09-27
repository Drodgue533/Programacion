package boletin;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
	   
		/* Opción A. Creando variables internas
		double equiv = 1.06;
		double euros = 220;
		double conversion = euros * equiv;
		System.out.println(euros + "€ equivalen a " + conversion + "$");
	 	*/
		/* Opción B. Introduciendo los valores por teclado*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el número de euros (€): ");
		double euros = scanner.nextDouble();
		System.out.println("Introduce el cambio actual de dolares ($) a euros (€): ");
		double equiv = scanner.nextDouble();
		double conversion = euros * equiv;
		System.out.println(euros + "€ equivalen a " + conversion + "$");
		scanner.close();
		
		}
}
