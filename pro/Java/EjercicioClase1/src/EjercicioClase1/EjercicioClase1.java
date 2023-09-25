package EjercicioClase1;

public class EjercicioClase1 {

	public static void main(String[] args) {
		
		double d1 = 10;
		double d2 = 20;
		// 1.
		double resul = d1 * 2 - 4;
		System.out.println("Restamos 4 al doble de d1: " + resul);
		
		double resul1 = (-4 + d1) * 2;
		System.out.println("Restamos 4 a d1 y calculamos el doble: " + resul1);
		
		double resul2 = ((2 + d1) / 12) + d2;
		System.out.println("Sumamos 2 a d1 y dividimos por 12, a todo ello sumamos d2: " + resul2);
		
		double resul3 = (d2 / d1) / 2;
		System.out.println("Dividimos d2 entre d1, y todo ello dividido entre 2: " + resul3);
		
		double resul4 = d2 / (d1/2);
		System.out.println("Dividimos d2 entre la mitad de d1: " + resul4);
		
		double resul5 = d2 - (d1/4);
		System.out.println("Restamos a d2 un cuarto de d1: " + resul5);
		
		double resul6 = (d2 - d1) / 4;
		System.out.println("Restamos d1 a d2, y todo ello lo dividimos entre 4: " + resul6);
		
		double resul7 = (d2 - d1) / 4;
		System.out.println("Dividimos d2 entre d1, y todo ello lo multiplicamos por 2: " + resul7);
	}
	
	
	
	
	
}
