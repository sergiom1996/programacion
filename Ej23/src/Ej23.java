/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// imprimir numeros del 0 al 100 controlando filas y columnas
		
		int n=0;
		int m=1;
		
		while (n<=100) {
			System.out.printf("%02d ",n);
			m++;
			if (m>10) {
				System.out.println();
				m=1;
			}
			n++;
		}
	}

}
