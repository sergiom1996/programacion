import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class H1ej14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Se pide representar el algoritmo que nos calcule la suma de los N primeros n�meros pares a partir de N
		//(si N es par ser�a el primer n�mero que hay que sumar). Es decir, si insertamos un 5, nos haga la suma de 6+8+10+12+14.
		
		int n;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero:");
		n=teclado.nextInt();
		int m=n, c=0, suma=0;
		
		while (c < n) {
			if (m%2==0) {
				suma=suma+m;
				c++; // suma 1 cuando encuentra un numero par
			}
			m++; 
		}
		
		System.out.println("La suma de los " + n + " siguientes pares desde " + n + " son " + suma);
		
		
		
	}

}
