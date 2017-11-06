import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// imprimir el mayor y el menor de una serie de 5 numeros introducidos por teclado
		
		int n;
		int c=0;
						
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce un numero:");
		n=teclado.nextInt();
		
		int mayor=n;
		int menor=n;
		
		while (c < 4) {
						
			System.out.println("introduce un numero:");
			n=teclado.nextInt();
			
			if (n>mayor) {
				mayor=n;
			}
			if (n<menor) {
				menor=n;
			}
			c++;
		}
		System.out.println("El mayor es " + mayor + " y el menor es " + menor);
		
	}

}
