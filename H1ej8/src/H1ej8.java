import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class H1ej8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Una tienda ofrece un descuento del 15% sobre el total de la compra durante el mes de octubre. Dado un mes y un importe,
		// calcular cuál es la cantidad que se debe cobrar al cliente.
		
		int mes;
		float precio;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce el mes actual:");
		mes=teclado.nextInt();
		
		System.out.println("introduce el precio:");
		precio=teclado.nextFloat();
		
		if (mes==10) {
			precio = precio * 0.85f; // para que 0.85 sea float hay que poner la f detras, sino por defecto sera double
		}
		
		System.out.println("El prefio final es " + precio);
	}

}
