import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// programa que lee las notas de un alumno en 10 asignaturas que las guarde en un array y que nos diga su media.
		
		int notas[]= new int [10]; // longitud del vector | el [] tambien se piede poner detras de int
		String nombre;
		float media=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce el nombre del alumno:");
		nombre=teclado.nextLine();
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("introduce una nota:");
			notas[i]=teclado.nextInt();
			media = media + notas[i];
		}
		
		media=media/notas.length;
		
		System.out.println("La media de las notas de " + nombre + " es " + media);
		
	}

}
