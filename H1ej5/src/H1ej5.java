import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class H1ej5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Diseñar un algoritmo que pida por teclado tres números; si el primero es negativo, debe imprimir el producto de
		// los tres y si no lo es, imprimirá la suma.
		
		int a,b,c;
		int resultado=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el numero a:");
		a=teclado.nextInt();
		
		System.out.println("introduce el numero b:");
		b=teclado.nextInt();
		
		System.out.println("introduce el numero c:");
		c=teclado.nextInt();
		
		if (a < 0) {
			resultado = a * b * c;
			System.out.println("El resultado de " + a + " por " + b + " por " + c + " es " + resultado);
		} else {
			resultado = a + b + c;
			System.out.println("El resultado de " + a + " mas " + b + " mas " + c + " es " + resultado);
		}
		
		
		
	}

}
