import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class H1ej9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Realizar un algoritmo que dado un número entero, visualice en pantalla si es par o impar. 
		
		int n;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el numero n:");
		n=teclado.nextInt();
		
		if (n%2==0) {
			System.out.println( n + " es par.");
		} else {
			System.out.println( n + " es impar.");
		}
		
		
		
	}

}
