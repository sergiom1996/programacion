/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Simular el lanzamiento de una moneda e imprimir si sale cara o cruz (10 veces)
		
		
		for ( int i=0;i<=10;i++){

		int tirada= (int) (Math.random()+0.5); // *2
		System.out.print(tirada);
		
			if (tirada==0){
				System.out.println(" Cruz");
			}
			else{
				System.out.println(" Cara");
			}
		}
	}

}
