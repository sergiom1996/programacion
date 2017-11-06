/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generar una matriz de 4 filas y 5 columnas con numeros aleatorios del 1 al 100
		
		int numeros[][]= new int [4][5];
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[0].length; j++) {
				numeros[i][j]=(int) ((Math.random()*100)+1);
			}
		}
		
		for (int k = 0; k < numeros.length; k++) {
			for (int l = 0; l < numeros[0].length; l++) {
				System.out.printf("%2d ",numeros[k][l]);
			}
			System.out.println();
		}
		
	}

}
