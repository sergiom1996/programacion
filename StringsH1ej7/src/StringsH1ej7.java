import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class StringsH1ej7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer una frase por teclado y escribir a continuación cuantas mayúsculas, minúsculas y números contiene.
		
		String frase, letra;
		int minusculas=0, mayusculas=0, numeros=0;
		
		String minus= "abcdefghijklmnopqrstuvwxyz";
		String mayus= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";		
		String cifras = "1234567890";
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("introduce una frase:");
			frase=teclado.nextLine();
			
		} while ((frase.length() > 80) || (frase.length() == 0));
		
		
		for (int i = 0; i < frase.length(); i++) {
			
			if (minus.indexOf(frase.substring(i, i+1))!=-1) {
				minusculas++;
			} else if (mayus.indexOf(frase.substring(i, i+1))!=-1) {
				mayusculas++;
			} else if (cifras.indexOf(frase.substring(i, i+1))!=-1) {
				numeros++;
			}	
		} 
		
		System.out.println("Hay " + minusculas + " letras en minuscula");
		System.out.println("Hay " + mayusculas + " letras en mayuscula");
		System.out.println("Hay " + numeros + " numeros en la frase");
		
	}

}
