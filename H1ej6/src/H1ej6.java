import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class H1ej6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Realizar un algoritmo que lea un n�mero por teclado. En caso de que ese n�mero sea 0 o menor que 0, se saldr�
		// del programa imprimiendo antes un mensaje de error. Si es mayor que 0, se deber� calcular su cuadrado y la
		// ra�z cuadrada del mismo, visualizando el numero que ha tecleado el usuario y su resultado (�Del numero X, su
		// potencia es X y su ra�z X�). Para calcular la ra�z cuadrada se puede usar la funci�n interna RAIZ(X)  o con una
		// potencia de 0,5.
		
		int a,b;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el numero a:");
		a=teclado.nextInt();
		b=a;
		
		if (a <= 0) {
			System.out.println("Espabila tonto");
		} else {
			System.out.print("Del numero " + a + " su cuadrado es ");
			a=(int)(Math.pow(a, 2));

			b=(int)(Math.sqrt(b));
			
			System.out.println(a + " y su raiz es " + b);
		}
		
		
		
	}
}

