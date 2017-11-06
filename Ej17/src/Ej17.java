import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// mostrar, contar y sumar los multiplos de 2 entre 2 numeros introducidos por teclado (el segundo es mayor o igual que el primero)
		
		int n1,n2;
		int s=0;
		int cp=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce un numero:");
		n1=teclado.nextInt();
		
		System.out.println("introduce otro numero:");
		n2=teclado.nextInt();
		
		while (n1<=n2) {
			if (n1%2==0) {
				System.out.println(n1);
				cp++;
				s=s+n1;
			}
			n1++;
		}
		System.out.println("Hay " + cp + " pares.");
		System.out.println("La suma de los pares es " + s +".");
	}

}
