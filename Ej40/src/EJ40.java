/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EJ40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear una tabla de 3 p�ginas, 4 filas y 5 columnas donde el primer elemento valga 1, el segundo 2, el tercero 3 y
		// as� sucesivamente, e imprimirla.
		
		int vector[][][]= null;
		vector= new int [3][4][5];
		int n=1;
		
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				for (int k = 0; k < vector[0][0].length; k++) {
					vector[i][j][k]=n;
					n++;
				}
			}
			n=1;
		}
		
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				for (int k = 0; k < vector[0][0].length; k++) {
					System.out.printf("%2d ",vector[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}

}
