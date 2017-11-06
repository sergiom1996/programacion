import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// programa que solo nos permite introducir s o n
		
		Scanner teclado = new Scanner(System.in);
		
		String n;
		
		System.out.println("introduce s o n:");
		n=teclado.nextLine();
		
		while (!n.equals("s") && !n.equals("n")) {
			System.out.println("La letra introducida no es correcta, introduce s o n:");
			n=teclado.nextLine();		
		}
		System.out.println("FIN");

	}

}
