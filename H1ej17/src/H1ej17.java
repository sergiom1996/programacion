import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class H1ej17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Algoritmo que lea n�meros enteros hasta teclear 0, y nos muestre el m�ximo, el m�nimo y la media de todos ellos. Piensa como debemos inicializar las variables.
		
		int n=-1, mayor=0, menor=0, suma=0;
		int c=0;

		
		while (n!=0) {
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("introduce un numero:");
			n=teclado.nextInt();
			
			if (c==0) {
				mayor=n;
				menor=n;
				suma=n;
				c++;
			} else if (n!=0){
				suma=suma+n;
				if (n>mayor) {
					mayor=n;
				} else if (n<menor) {
					menor=n;
				}
				c++;
			}

		}

		n=suma/c;
		System.out.println("El maximo es " + mayor);
		System.out.println("El minimo es " + menor);
		System.out.println("La media es " + n);
	}

}
