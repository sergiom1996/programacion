import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// leer un numero y decir si es par o impar
		
				int n;
				
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("introduce un numero:");
		n=teclado.nextInt();
				
		if (n%2==1) {
			System.out.println("Es impar.");
		} else if (n%2==0){
			System.out.println("Es par.");
		} else {
			System.out.println("Es cero");
		}
	}

}
