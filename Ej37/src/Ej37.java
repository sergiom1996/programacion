/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// haz la matriz transpuesta del ejercicio anterior
		
		int numeros[][]= new int [4][5];
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[0].length; j++) {
				numeros[i][j]=(int) ((Math.random()*100)+1);
			}
		}
		
		System.out.println("La matriz es:");
		
		for (int k = 0; k < numeros.length; k++) {
			for (int l = 0; l < numeros[0].length; l++) {
				System.out.printf("%2d ",numeros[k][l]);
			}
			System.out.println();
		}
		
		
		int transpuesta[][]=new int [numeros[0].length][numeros.length];
		
		for (int m = 0; m < transpuesta.length; m++) {
			for (int n = 0; n < transpuesta[0].length; n++) {
				transpuesta[m][n]=numeros[n][m];
			}
		}
		
		System.out.println("Su transpuesta es:");
		
		for (int o = 0; o < transpuesta.length; o++) {
			for (int p = 0; p < transpuesta[0].length; p++) {
				System.out.printf("%2d ",transpuesta[o][p]); // %2d deja dos huecos | %02d rellena los huecos en blanco con ceros
			}
			System.out.println();
		}
	}

}
