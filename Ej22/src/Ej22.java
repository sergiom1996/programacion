import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// introducir una frase por teclado imprimirla cinco veces  en cinco filas diferentes desplazandola cuatro columnas a la derecha cada vez
		
		String frase;
		String espacios="    ";
		int cf=0;
		int ce=0;
		int ne=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce una frase:");
		frase=teclado.nextLine();
		
		while (cf<5) {
			while (ce<ne) {
				System.out.printf(espacios);
				ce++;
			}
			System.out.println(frase);
			ce=0;
			cf++;
			ne++;
		}
		
	}

}
