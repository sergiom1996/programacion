import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class H1ej20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se calcula seg�n el siguiente criterio: la parte pr�ctica vale el 10%;
		// la parte de problemas vale el 50% y la parte te�rica el 40%. El algoritmo leer� el nombre del alumno, las tres notas, escribir� el resultado y volver� a
		//pedir los datos del siguiente alumno hasta que el nombre sea una cadena vac�a. Las notas deben estar entre 0 y 10, si no lo est�n, no imprimir� las notas,
		// mostrara un mensaje de error y volver� a pedir otro alumno.
		
		String nombre=" ";
		float practica,problemas,teoria,media=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el nombre del alumno:");
		nombre=teclado.nextLine();
		
		while (!nombre.equals("")) {
		
			System.out.println("introduce la nota de practicas:");
			practica=teclado.nextInt();
			
			System.out.println("introduce la nota de problemas:");
			problemas=teclado.nextInt();
			
			System.out.println("introduce la nota de teoria:");
			teoria=teclado.nextInt();
			
			if ((practica<0) || (practica>10) || (problemas<0) || (problemas>10) || (teoria<0) || (teoria>10)) {
				System.out.println("ERROR, las notas introducidas no son correctas.");
			} else {
				media = (float) (practica * 0.1 + problemas * 0.5 + teoria * 0.4);
				System.out.println("La media de " + nombre + " es " + media);
			}
			
			System.out.println("introduce el nombre del alumno:"); // leeremos nombre la primera vez fuera del while para que si el primero es nulo no pida las notas
			nombre=teclado.nextLine();							   // y al final del while nos pedira el nombre del siguiente alumno
			
		}

		
		
		
		
		
		
		
	}

}