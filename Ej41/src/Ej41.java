/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se dispone de una tabla de 5 p�ginas, 10 filas y 20 columnas, que se refieren al centro, al curso y al n�mero de alumnos
		//de un colegio respectivamente. Imprimir la nota media por curso y la nota media m�xima y su centro de pertenencia.
		
		int vector[][][]= null;
		vector= new int [5][10][20];
		float nmc=0;
		float nmm=0;
		int curso=0;
		int centro=0;
		
		
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				for (int k = 0; k < vector[0][0].length; k++) {
					vector[i][j][k]=(int) (Math.random()*11);
				}
			}
		}
		
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				for (int k = 0; k < vector[0][0].length; k++) {
					nmc = nmc + vector[i][j][k];
				}
				nmc=nmc/vector[0][0].length;
				if (nmc>nmm){
					nmm=nmc;
					curso=j;
					centro=i;
					
				}
				
				System.out.println("La nota media del curso " + j + " del centro " + i + " es " + nmc);
				
				nmc=0;				
			}
		}
		
		System.out.println();
		System.out.println("La nota media maxima del curso " + curso + " del centro " + centro + " es " + nmm);
		System.out.println();
		
		
	}

}
