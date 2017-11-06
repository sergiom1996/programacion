import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// introducir un numero y que nos diga si es primo, su factorial y su tabla de multiplicar
		
		int n;
		int cp=0;
		int tm=0;
		int r=0;
		int f=1;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero:");
		n=teclado.nextInt();
		
		while (n<1) {
			System.out.println("introduce un numero:");
			n=teclado.nextInt();
		}
		
		int m=n;
		
		while (m>=1) {
			if (n%m==0) {
				cp++;
			}
			f=f*m;
			m--;
		}
		
		System.out.println("El factorial de " + n + " es " + f);
		
		if (cp>2) {
			System.out.println(n + " no es primo.");
		} else {
			System.out.println(n + "  es primo.");
		}
		
		while (tm<=10) {
			r=n*tm;
			System.out.println(n + "*" + tm + "=" + r);
			tm++;
		}
		
		
	}

}
