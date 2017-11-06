import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// leer un numero y decir si es positivo o negativo
		
		int n;
		
Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce un numero:");
		n=teclado.nextInt();
		
		if (n>0) {
			System.out.println("Es positivo.");
		} else if (n<0){
			System.out.println("Es negativo.");

		} else {
			System.out.println("Es cero");
		}
	}

}
