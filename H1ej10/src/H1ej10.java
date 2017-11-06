import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class H1ej10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Modificar el algoritmo anterior, de forma que si se teclea un cero, se vuelva a pedir el número por teclado
		//(así hasta que se teclee un número mayor que cero) (recuerda la estructura mientras).
		
		int n=-1;
		
		while (n < 1) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("introduce el numero n:");
			n=teclado.nextInt();
		}
		
		
		if (n%2==0) {
			System.out.println( n + " es par.");
		} else {
			System.out.println( n + " es impar.");
		}
		
	}

}
