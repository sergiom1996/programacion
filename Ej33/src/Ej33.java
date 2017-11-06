/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ej33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crea un array de 20 elementos co nombres de personas e imprimelos cada uno en una fila diferente.
		
		String nombres[]= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t"};
		String comodin;
		
		
		for (int l = 0; l < nombres.length; l++) {
			System.out.print(nombres[l] + " ");
		}
		
		// ahora ordenamos los nombres alfabeticamente mediante el metodo de burbuja
		for (int i = 0; i < nombres.length - 1; i++) {
			for (int j = 0; j < nombres.length - 1; j++) {
				int result = nombres[j].compareTo(nombres[j+1]); // para que el compareTo funcione hay que declararlo en otra linea aparte con una varieble adicional
																// si es 0 seran iguales, si es menor que 0 sera menor y si es mayor que 0 sera mayor
				if (result < 0) { // para hacerlo creciente cambiamos la comparacion en el if a mayor
					comodin=nombres[j];
					nombres[j]=nombres[j+1];
					nombres[j+1]=comodin;
				}
			}
		}
		
		System.out.println();
		
		for (int k = 0; k < nombres.length; k++) {
			System.out.print(nombres[k] + " ");
		}
		
	}

}
