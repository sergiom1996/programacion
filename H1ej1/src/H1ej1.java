import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class H1ej1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo que intercambie los
		// valores de ambas variables y muestre cuánto valen al final las dos variables (recuerda la asignación)
		
		int a,b, comodin;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el numero a:");
		a=teclado.nextInt();
		
		System.out.println("introduce el numero b:");
		b=teclado.nextInt();
		
		comodin=a;
		a=b;
		b=comodin;
		
		System.out.println("El numero a es " + a);
		System.out.println("El numero b es " + b);
	}

}
