import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// leer 2 numeros e imprimir los numeros entre ellos de menos a mayor
		// contar cuantos hay y cuantos son pares y realiza la suma de los impares
		
		int n1, n2;
		int c=0;
		int cp=0;
		int si=0;
		int cambio=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce un numero:");
		n1=teclado.nextInt();
		
		System.out.println("introduce otro numero:");
		n2=teclado.nextInt();
		
		while (n1==n2) {
			
			System.out.println("Los numeros son iguales.");
				
			System.out.println("introduce un numero:");
			n1=teclado.nextInt();
				
			System.out.println("introduce otro numero:");
			n2=teclado.nextInt();
			}
		
		if (n1>n2) {
			cambio=n1;
			n1=n2;
			n2=cambio;
		}
		
		int nb=n1; //variable para que muestre n1 al final
		n1++; // suma para que no cuente n1
		
		while (n1<n2) {
			System.out.println(n1);
			c++;
			
			if (n1%2==0) {
				cp++;
			} else {
				si = si + n1; 
			}
			n1++;
		}
		
		System.out.println("hay " + c + " numeros, " + cp + " pares y la suma de los impares es " + si + " entre " + nb + " y " + n2);
	}
		
		

}
