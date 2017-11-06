import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class H1ej12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Desarrollar un algoritmo que nos calcule el cuadrado de los 9 primeros números naturales (recuerda la estructura para)
		
		int n;
		int cuadrado;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero:");
		n=teclado.nextInt();

		 for (int i = 1; i <= n; i++) {
			 cuadrado=(int)(Math.pow(i, 2));
			 System.out.println("El cuadrado de " + i + " es " + cuadrado);
		}
		
	}

}
