import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//38.-Cargar en una matriz las notas de los alumnos de un colegio en funci�n del n�mero de cursos
		//(filas) y del n�mero de alumnos por curso (columnas).
		
		int vector[][]= null;
		int nc, na, nota;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el numero de cursos:");
		nc=teclado.nextInt();
		
		System.out.println("introduce el numero de alumnos que hay en cada curso:");
		na=teclado.nextInt();
		
		vector= new int [nc][na]; // declaramos la dimension del array
		
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				System.out.println("introduce la nota:");
				nota=teclado.nextInt();
				vector[i][j]=nota;
			}
		}
		
		System.out.println("La matriz resultante es:");
		
		for (int k = 0; k < vector.length; k++) {
			for (int l = 0; l < vector[0].length; l++) {
				System.out.printf("%2d ",vector[k][l]);
			}
			System.out.println();
		}
		
		
	}

}