import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class StringsH2ej3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribe un programa que pida por teclado una palabra y diga si es un palíndromo o no. Una palabra es un palíndromo si se lee igual de izquierda a
		// derecha que de derecha a izquierda.
		
		String palabra, palindromo="";
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("introduce una palabra:");
			palabra=teclado.nextLine();
			
		} while ((palabra.length() > 10) || (palabra.length() == 0));
		
		for (int i = palabra.length(); i > 0; i--) {
			palindromo = palindromo + palabra.substring(i-1, i);
		}
		
		if (palabra.equals(palindromo)) {
			System.out.println(palindromo + " es un palindromo");
		} else {
			System.out.println(palabra + " no es un palindromo");
		}
		
	}

}
