import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class StringsH1ej4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer una cadena de hasta 80 caracteres y pasarla en funci�n de una variable de opci�n a may�sculas � a min�sculas e imprimir la cadena resultante
		
		String frase, letra;
		int n;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce una frase:");
		frase=teclado.nextLine();
		
		while ((frase.length() > 80) || (frase.length() == 0)) {
			System.out.println("introduce una frase de nuevo:");
			frase=teclado.nextLine();
		}
		

		do {
			System.out.println("Elige una opcion: ");
			System.out.println("0- Minusculas");
			System.out.println("1- Mayusculas");
			n=teclado.nextInt();
		} while ((n < 0) && (n > 1));
		
		if (n==0) {
			frase=frase.toLowerCase();
		} else {
			frase=frase.toUpperCase();
		}

		System.out.println(frase);
	}

}
