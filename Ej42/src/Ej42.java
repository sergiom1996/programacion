/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Una empresa guarda en una tabla de 3x12x4 las ventas realizadas por sus tres representantes a lo largo de doce meses
		//de sus cuatro productos, VENTAS [representante, mes, producto]. Queremos proyectar el array tridimensional sobre uno de
		//dos dimensiones que represente el total de ventas, TOTAL [mes, producto], para lo cual sumamos las ventas de cada producto
		//de cada mes de todos los representantes. Imprimir ambos arrays.
		
		int vector[][][]= null;
		vector= new int [3][12][4];
		
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				for (int k = 0; k < vector[0][0].length; k++) {
					vector[i][j][k]=(int) (Math.random()*11);
				}
			}
		}
		
		int bidi[][]= null;
		bidi= new int [12][4];		
		
		for (int j = 0; j < bidi.length; j++) { // vector[0].length
			for (int k = 0; k < bidi[0].length; k++) { // vector[0][0].length
				for (int i = 0; i < vector.length; i++) {
					bidi[j][k] = bidi[j][k] +vector[i][j][k];
				}
									
			}
		}
		
		for (int k = 0; k < bidi.length; k++) {
			for (int l = 0; l < bidi[0].length; l++) {
				System.out.printf("%2d ",bidi[k][l]);
			}
			System.out.println();
		}
		
		
		
		
	}

}
