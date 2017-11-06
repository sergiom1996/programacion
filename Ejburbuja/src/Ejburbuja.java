import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejburbuja {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// metodo de ordenacion por burbuja (creciente) ={1,5,4,3,6,7,8,4,9,4,3,7}
		
		int vector[]= null;
		int comodin;
		int n;

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce la longitud del array:");
		n=teclado.nextInt();
		
		vector= new int [n]; // longitud del vector
		
		for (int l = 0; l < vector.length; l++) {
			System.out.println("introduce un valor:");
			vector[l]=teclado.nextInt();
		}

		
		
		for (int i = 0; i < vector.length - 1; i++) {
			for (int j = 0; j < vector.length - 1; j++) {
				if (vector[j] > vector[j+1]) { // para hacerlo decreciente cambiamos la comparacion en el if a menor
					comodin=vector[j];
					vector[j]=vector[j+1];
					vector[j+1]=comodin;
				}
			}
		}
		
		for (int k = 0; k < vector.length; k++) {
			System.out.print(vector[k] + " ");
		}

	}

}
