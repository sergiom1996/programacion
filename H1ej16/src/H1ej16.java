import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class H1ej16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Teniendo en cuenta que la clave es �eureka�, escribir un algoritmo que nos pida una clave. Solo tenemos 3 intentos para acertar, si fallamos los 3
		// intentos nos mostrara un mensaje indic�ndonos que hemos agotado esos 3 intentos. (Se recomienda utilizar un interruptor). Si acertamos la clave,
		// saldremos directamente del programa.
		
		String clave;
		int n=0, sw=0;
		
		Scanner teclado = new Scanner(System.in);
		
		while ((n<3) && (sw==0)){
			
			System.out.println("introduce la clave:");
			clave=teclado.nextLine();
			
			if (clave.equals("eureka")) {
				sw=1;
			}
			n++;
		}
		
		if (sw==1) {
			System.out.println("La clave es correcta");
		} else {
			System.out.println("La clave no es correcta");
		}
		
		
	}

}
