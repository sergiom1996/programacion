import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Contar las veces que aparece una letra en una palabra		
		
		String frase, letra;
		int c=0;
		int l;
		int n=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce una frase:");
		frase=teclado.nextLine();
		
		System.out.println("introduce una letra:");
		letra=teclado.nextLine();
		
		l=frase.length();
		
		while (c<l) {
			if (letra.equals(frase.substring(c, c+1))) {
				n++;
			} 
			c++;
		}
		
System.out.println("la letra " + letra + " esta " + n + " veces en la frase introducida.");
		
		
	}

	

}
