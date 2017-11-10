import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class StringsH2ej2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribe un programa que pida por teclado una cadena y una letra, de manera que elimine las 3 primeras ocurrencias de la letra que encuentre en la cadena
		// y lo muestre por pantalla.
		
		String palabra;
		String letra;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("introduce una palabra:");
			palabra=teclado.nextLine();
			
		} while ((palabra.length() > 10) || (palabra.length() == 0));
		
		do {
			System.out.println("introduce una letra:");
			letra=teclado.nextLine();
			
		} while (letra.length() != 1);
		
		for (int i = 0; i < 3; i++) {
			palabra = palabra.replaceFirst(letra, "");
		}
		
		System.out.println(palabra);
		
	}

}
