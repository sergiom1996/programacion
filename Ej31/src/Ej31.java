import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Introducir dos numeros y mediante un menu elegir si calculamos su sum su resta su diviasion o su multiplicacion
		
		int n1, n2, n;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce un numero:");
		n1=teclado.nextInt();
		
		System.out.println("introduce otro numero:");
		n2=teclado.nextInt();
		
		System.out.println("Introduce un numero: ");
		System.out.println("1- Sumar");
		System.out.println("2- Restar");
		System.out.println("3- Multiplicar");
		System.out.println("4- Dividir");
		n=teclado.nextInt();
		
		switch (n) {
		case 1:
			n=n1+n2;
			System.out.println("La suma es " + n);
			break;
		case 2:
			n=n1-n2;
			System.out.println("La resta es " + n);
			break;
		case 3:
			n=n1*n2;
			System.out.println("La multiplicacion es " + n);
			break;
		case 4:
			n=n1/n2;
			System.out.println("La division es " + n);
			break;
		default:
			System.out.println("El numero introducido no es valido.");
			break;
		}

	}

}
