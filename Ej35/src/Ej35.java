import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hacer un programa que busque una nota en un vector y nos diga cuantas veces esta (partimos del ejercicio anterior en el que leemos el array)
		
		int notas[]= new int [10]; // longitud del vector | el [] tambien se puede poner detras de int
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
		
		int n; // nota que vamos a buscar
		int cn=0;
		
		System.out.println("La media de las notas de " + nombre + " es " + media);
		
		System.out.println("introduce la nota que quieres buscar:");
		n=teclado.nextInt();
		
		
		for (int k = 0; k < notas.length; k++) {
			if (notas[k]==n) {
				cn++;
			}
		}
		
		System.out.println("La nota " + n + " esta " + cn + " veces.");
		
	}

}
