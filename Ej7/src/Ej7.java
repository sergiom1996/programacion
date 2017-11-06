import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// introducir n frases y contarlas
		
Scanner teclado = new Scanner(System.in);
		
	/**	String n;
		int c=0;
		int i=0;
		
		while (i==0) {		
			System.out.println("introduce una frase (si no tienes mas frases introduce 0):");
			n=teclado.nextLine();
			if (n.equals("no")) {
				System.out.println(c);
				i=1;
			} else {
				c++;

			}
			
			* 
			 */

		String n="0";
		int c=-1;
		int i=0;
		
		while (!n.equals("no")) {		
			System.out.println("introduce una frase (si no tienes mas frases introduce 0):");
			n=teclado.nextLine();
			c++;
			

			}
		System.out.println(c);
			
			
	
	}

}
