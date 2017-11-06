import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class H1ej13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Se pide representar el algoritmo que nos calcule la suma de los N primeros números naturales. N se leerá por teclado (no tenemos porque llamar a
		// la variable N, podemos llamarla como queramos).
		
		int n,suma=0;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero:");
		n=teclado.nextInt();
		
		for (int i = 1; i <= n ; i++) {
			suma = suma + i;
		}
		
		System.out.println("La suma de los numeros desde 1 hasta " + n + " es " + suma);
		
		
	}

}
