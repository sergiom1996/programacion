import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// comprobar si un numero mayor o igual que 1 es primo
		
		int n;
		int cd=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce un numero mayor que 1:");
		n=teclado.nextInt();
		
		while (n<1) {			
			System.out.println("introduce un numero mayor que 1:");
			n=teclado.nextInt();
		}
		
		int m=n;
		
		while (m>0) {					// si lo comprobamos hasta la raid cuadrada delnumero sera mas eficiente, ya que a partir de ahi ya no habra mas divisores
			if (n%m==0) {
				cd++;
			}
			m--;
		}
		
		if (cd>2) {
			System.out.println("El numero " + n + " no es primo.");			
		} else {
			System.out.println("El numero " + n + " es primo.");	
		}
		
	}

}
