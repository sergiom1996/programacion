import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class StringH1ej11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hacer un programa para que pida una palabra de no más de 20 caracteres y efectúe todas las rotaciones posibles de dicha palabra de forma que el último
		// carácter pase al primero y los demás corran un espacio, es decir si la palabra fuera “HOLA” el resultado debe ser :HOLA AHOL LAHO OLAH
		// Observar que una palabra de n caracteres tiene n rotaciones.
		
		String frase;
		char comodin;
		
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("introduce una frase:");
			frase=teclado.nextLine();
			
		} while ((frase.length() > 20) || (frase.length() == 0));
		
		char vector[]= null;
		vector = new char [frase.length()];
		
		vector = frase.toCharArray();
		
		for (int i = 0; i < vector.length-1; i++) {
		
			for (int j = vector.length-1; j > 0; j--) {
				comodin = vector[j];
				vector[j] = vector [j-1];
				vector [j-1] = comodin;
			}
			
			for (int k = 0; k < vector.length; k++) {
				System.out.print(vector[k]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		// otra forma mas facil
		
		for (int i = 0; i < frase.length(); i++) {
			System.out.println(frase);
			frase = frase.substring(1).concat(frase.substring(0, 1)); // coge la frase sin el primer caracter y lo pasa al final
		}
		
		
		
	}

}
