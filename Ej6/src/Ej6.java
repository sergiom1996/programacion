import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// numeros desde 1 hasta n
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		System.out.println("introduce un numero:");
		n=teclado.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println(i);					
	}
	}

}
