import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class StringsH1ej6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer una frase por teclado (máximo 80) y a continuación escribir cuantas vocales, consonantes y caracteres numéricos posee.
		
		String frase;
		String vocales = "aeiouAEIOU";
		String consonantes = "BbCcDdFfGgHhJjKkLlMmNnÑñPpQqRrSsTtVvWwXxYyZz";
		String numeros = "1234567890";
		int numvocales = 0, numconsonantes = 0, numnumeros = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("introduce una frase:");
			frase=teclado.nextLine();
			
		} while ((frase.length() > 80) || (frase.length() == 0));
		
		for (int i = 0; i < frase.length(); i++) {
			
			if (vocales.indexOf(frase.substring(i, i+1))!=-1) {
				numvocales++;
				
				System.out.println("Hay una vocal en la posicion " + (i+1));
				
			} else if (consonantes.indexOf(frase.substring(i, i+1))!=-1) {
				numconsonantes++;
			} else if (numeros.indexOf(frase.substring(i, i+1))!=-1){
				numnumeros++;
			}	
		} 
		
		System.out.println("hay " + numvocales + " vocales en la frase.");
		System.out.println("hay " + numconsonantes + " consonantes en la frase.");
		System.out.println("hay " + numnumeros + " numeros en la frase.");
		
	}

}
