import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej19 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//simular el funcionamiento de un reloj digital y que permita ponerlo en hora
		
		int horas, minutos, segundos;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce la hora:");
		horas=teclado.nextInt();
		
		System.out.println("introduce el minuto:");
		minutos=teclado.nextInt();
		
		System.out.println("introduce el segundo:");
		segundos=teclado.nextInt();
		
		while ((horas < 0) || (horas > 23)) {
			System.out.println("introduce la hora:");
			horas=teclado.nextInt();
		}
		
		while ((minutos < 0) || (minutos > 59)) {
			System.out.println("introduce el minuto:");
			minutos=teclado.nextInt();
		}
		
		while ((segundos < 0) || (segundos > 59)) {
			System.out.println("introduce el segundo:");
			segundos=teclado.nextInt();
		}
		
		while (horas<24) {
			if (segundos == 60) {
				segundos=0;
				minutos++;
			}
			
			if (minutos == 60) {
				minutos=0;
				horas++;
			}
			
			if (horas == 24) {
				horas=0;
			}
			
			System.out.printf("%02d:%02d:%02d\n",horas,minutos,segundos);
			//System.out.println();
			segundos++;
			Thread.sleep(1000);
			
		}
		
		
	}

}
