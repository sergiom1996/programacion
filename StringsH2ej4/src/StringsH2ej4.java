import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class StringsH2ej4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribe un programa que pida por teclado dos nombres con su apellido cada uno del siguiente modo:
		//	Introduce un nombre y un apellido:
		//	Manuel García
		//	Introduce otro nombre y apellido:
		//	Jimena Pérez
		//	Después debe intercambiar los apellidos a los nombres y mostrarlos:
		//	Jimena García
		//	Manuel Pérez
		
		String nombre1, nombre2;
		
		String apellido1, apellido2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce un nombre y un apellido:");
		nombre1=teclado.nextLine();
		
		System.out.println("introduce otro nombre y un apellido:");
		nombre2=teclado.nextLine();
		
		
		for (int i = nombre1.length(); i > 0; i++) {
			if (nombre1.substring(i-1, i).equals(" ")) {
				apellido1 = nombre1.substring(i);
			}
		}
		
		for (int i = nombre2.length(); i > 0; i++) {
			if (nombre2.substring(i-1, i).equals(" ")) {
				apellido2 = nombre2.substring(i);
			}
		}
		
		
		
		
	}

}
