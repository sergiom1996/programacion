import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class StringsH1ej1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer una frase de máximo 80 caracteres y escribirla progresivamente es decir si la frase es: “ciervo”, el programa debe imprimir.
		
		String frase;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce una frase:");
		frase=teclado.nextLine();
		
		while(frase.length()>80) {
			System.out.println("introduce una frase:");
			frase=teclado.nextLine();
		}
		
		for (int i = 0; i < frase.length(); i++) {
			System.out.println(frase.substring(0,i+1));
		}

		
	}


}
