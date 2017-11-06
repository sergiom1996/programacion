import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class StringH1ej10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribir un programa que lea una frase (máximo 60 caracteres) y diga cuántas letras distintas tiene y la frecuencia de las mismas, para homogeneizar el
		// conjunto de letras debemos trabajar solo con mayúsculas.
		
		String frase, letras="";
		int contador=0;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("introduce una frase:");
			frase=teclado.nextLine();
			
		} while ((frase.length() > 60) || (frase.length() == 0));
		
		frase= frase.toUpperCase();
		
		for (int i = 0; i < frase.length(); i++) {   // recorre la frase y pasa los valores a la variable letras
			if ("0123456789.,:; /()[]{}".indexOf(frase.substring(i, i+1))== -1) {
				if (letras.indexOf(frase.substring(i, i+1)) == -1) {
					letras = letras + frase.substring(i, i+1);
					
					for (int j = 0; j < frase.length(); j++) {
						if (frase.substring(i, i+1).equals(frase.substring(j, j+1))) {
							contador++;   // este for cuenta las veces que aparece una letra distinta
						}
					}
					System.out.println("La letra " + frase.substring(i, i+1) + " esta " + contador + " veces en la frase");
					contador=0;
				}
			}
		}
		
		System.out.println("la frase tiene " + letras.length() + " letras diferentes.");
	}

}
