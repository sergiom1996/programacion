import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class StringsH1ej8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer una frase filtr�ndola a que todos sus caracteres sean may�sculas, una vez filtrada y dado un numero entre 1 y 10 haga un cifrado de la frase
		//(denominado cifrado CESAR) del modo siguiente , si el numero por ejemplo es 3, transforme la frase de manera que cada car�cter se transforme en 3 c�digos
		//ASCII mas es decir : Frase inicial PROGRAMACION resultado SURJUDPDFLRQ. Desarrollar los programas de codificar y descodificar mediante dos funciones.
		
		
		int n;
		String frase, frasecifrada="";
		
		char ascii;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("introduce una frase:");
			frase=teclado.nextLine();
			
		} while ((frase.length() > 80) || (frase.length() == 0));
		
		do {
			System.out.println("introduce el numero para cifrar:");
			n=teclado.nextInt();
			
		} while ((n < 1) || (n >10));
		
		frase = frase.toUpperCase();
		
		for (int i = 0; i < frase.length(); i++) {

			ascii = (char) (frase.charAt(i) + n);
			
			if (ascii > 90) {
				ascii = (char) (ascii - 90);
				ascii = (char) (64 + ascii); 
			}
			
			frasecifrada = frasecifrada + ascii;

			// String ascii2 ="" + ascii; // cambiamos ascii a string

			frase = frase.replace(frase.charAt(i), ascii);
		}
		
		System.out.println("La frase cifrada es " + frase);
		
		
	}

}
