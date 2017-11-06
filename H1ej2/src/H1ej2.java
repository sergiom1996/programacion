import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class H1ej2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Algoritmo que lea dos números, calculando y escribiendo el valor de su suma, resta, producto y división.
		
		int a,b;
		int resultado=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el numero a:");
		a=teclado.nextInt();
		
		System.out.println("introduce el numero b:");
		b=teclado.nextInt();
		
		resultado = a + b;
		System.out.println("la suma de " + a + " mas " + b + " es " + resultado);
		
		resultado = a - b;
		System.out.println("la resta de " + a + " menos " + b + " es " + resultado);
		
		resultado = a * b;
		System.out.println("la mutiplicacion de " + a + " por " + b + " es " + resultado);
		
		resultado = a / b;
		System.out.println("la division de " + a + " entre " + b + " es " + resultado);
		
	}

}
