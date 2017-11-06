import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class H1ej19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer tres números que denoten una fecha (día, mes, año). Comprobar que es una fecha válida. Si no es válida escribir un mensaje de error.
		// Si es válida escribir la fecha cambiando el número del mes por su nombre. Ej. Si se introduce 1 2 2006, se deberá imprimir “1 de febrero de 2006”.
		// El año debe ser mayor que 0. (Usa la estructura caso de).
		
		int dia=0, mes=0, anyo=0;
				
		Scanner teclado = new Scanner(System.in);
		
		while((anyo<1)) {
			System.out.println("introduce el anyo:");
			anyo=teclado.nextInt();
		}
		
		while((mes<1) || (mes>12)) {
			System.out.println("introduce el mes (en numero):");
			mes=teclado.nextInt();
		}
		
		if (mes==2) {
			if (anyo%4==0) {
				while ((dia<1) || (dia>29)) {
					System.out.println("introduce el dia:");
					dia=teclado.nextInt();
				}
			} else {
				while ((dia<1) || (dia>28)) {
					System.out.println("introduce el dia:");
					dia=teclado.nextInt();
				}
			}
		} else if ((mes==1) || (mes==3) || (mes==5) || (mes==7) || (mes==8) || (mes==10) || (mes==12)) {
			while ((dia<1) || (dia>31)) {
				System.out.println("introduce el dia:");
				dia=teclado.nextInt();
			}
		} else {
			while ((dia<1) || (dia>30)) {
				System.out.println("introduce el dia:");
				dia=teclado.nextInt();
			}
		}
			
		switch (mes) {
		case 1:
			System.out.print(dia + " de enero de " + anyo);
			break;
		case 2:
			System.out.print(dia + " de febrero de " + anyo);
			break;
		case 3:
			System.out.print(dia + " de marzo de " + anyo);
			break;
		case 4:
			System.out.print(dia + " de abril de " + anyo);
			break;
		case 5:
			System.out.print(dia + " de mayo de " + anyo);
			break;
		case 6:
			System.out.print(dia + " de junio de " + anyo);
			break;
		case 7:
			System.out.print(dia + " de julio de " + anyo);
			break;
		case 8:
			System.out.print(dia + " de agosto de " + anyo);
			break;
		case 9:
			System.out.print(dia + " de septiembre de " + anyo);
			break;
		case 10:
			System.out.print(dia + " de octubre de " + anyo);
			break;
		case 11:
			System.out.print(dia + " de noviembre de " + anyo);
			break;
		case 12:
			System.out.print(dia + " de diciembre de " + anyo);
			break;
		}
		
		
		
		
	}

}
