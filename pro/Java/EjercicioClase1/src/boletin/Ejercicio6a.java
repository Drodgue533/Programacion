package boletin;

public class Ejercicio6a {

	public static void main(String[] args) {
		
		/**6. Dada la variable cadena tipo String, haz que vaya mostrando por pantalla la
		secuencia siguiente:
		La casa de
		La casa de Juan es
		La casa de Juan es el número
		La casa de Juan es el número 25
		
		Solución utilizando el método substring de String
		**/
		
		String msg = "la casa de Juan es el número 25";
		System.out.println(msg.substring(0, 10));
		System.out.println(msg.substring(0, 18));
		System.out.println(msg.substring(0, 28));
		System.out.println(msg);

	}

}
