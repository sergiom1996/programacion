import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class H1ej7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as hay en el curso actual. Dise�ar un algoritmo
		//para este prop�sito (recuerda que para calcular el porcentaje puedes hacer una regla de 3).
		
		int ninio,ninia;
		int total;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el numero de ninios:");
		ninio=teclado.nextInt();
		
		System.out.println("introduce el numero de ninias:");
		ninia=teclado.nextInt();
		
		total = ninio + ninia;
		
		ninio = ninio*100/total;
		ninia = ninia*100/total;
		
		System.out.println("El porcentaje de ninios es " + ninio);
		System.out.println("El porcentaje de ninias es " + ninia);
		
	}

}
