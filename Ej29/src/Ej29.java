import java.util.Random;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Simular 100 tiradas de 2 dados y apuntar cuantas veces sale 10
		
		int cont=0;
		
		 for (int c=0;c<=100;c++){
			 
			 int dado1= (int) ((Math.random()*6)+1); // hace la multiplicacion del numero generado entre 0 y 1 x 6 y  como nunca va a llegar a 6, le sumamos 1 y lo pasamos a entero.
			 int dado2= (int) ((Math.random()*6)+1);
			 			 			 
			 int tirada= (dado1+dado2);
			 System.out.println(tirada);
				if (tirada==10){
					cont++;
				}
	}
		 System.out.println( "El numero de veces que ha salido 10 es " + cont);
	}

}
