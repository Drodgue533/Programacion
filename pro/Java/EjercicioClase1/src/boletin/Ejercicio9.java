package boletin;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double iva= 21d;
		System.out.println("Introduce la base imponible de la factura: ");
		double baseImp = scanner.nextDouble();
		double precio = baseImp + baseImp * iva /100 ;
		System.out.println("El precio final del producto es: " + precio);
		scanner.close();
	}

}
