/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// imprimir y contar los multiplos de 2 o 3 entre 1 y 100
		
		int c=1;
		int c2=0;
		int c3=0;
		
		System.out.println("Los multiplos de 2 entre 1 y 100 son: ");
		while (c < 100) {
			if (c%2==0) {
				System.out.println(c);
				c2++;
			}
			c++;
			}
		System.out.println("Hay " + c2 + " multiplos de 2 entre 1 y 100.");
		c=1;
		
		System.out.println("Los multiplos de 3 entre 1 y 100 son: ");
		while (c < 100) {
			if (c%3==0) {
				System.out.println(c);
				c3++;
			}
			c++;
			}
		System.out.println("Hay " + c3 + " multiplos de 3 entre 1 y 100.");
		}
	}

