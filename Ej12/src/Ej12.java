import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// numeros del 1 al 100 y sumar pares por un lado e impares por otro
		
		int n;
		int si=0;
		int sp=0;
		int c=1;
		
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("introduce un numero:");
		n=teclado.nextInt();
		
		while (c<=n) {
			System.out.println(c);
			
			if (c%2==0) {
				sp = sp + c;
			} else {
				si = si + c;
			}
			c++;
		}
		System.out.println("la suma de los pares es " + sp);
		System.out.println("la suma de los impares es " + si);
	}

}
