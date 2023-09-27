package boletin;

public class Ejercicio6 {

	/**6. Dada la variable cadena tipo String, haz que vaya mostrando por pantalla la
	secuencia siguiente:
	La casa de
	La casa de Juan es
	La casa de Juan es el número
	La casa de Juan es el número 25**/
	
	public static void main(String[] args) {
		
		String msg = "La casa de";
		System.out.println(msg);
		msg += " Juan es ";
		System.out.println(msg);
		msg += " el número";
		System.out.println(msg);
		msg += " " + 25;
		System.out.println(msg);
		
	}

}
