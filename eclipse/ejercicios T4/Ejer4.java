import java.util.Scanner;

/**
 * devolver el texto en mayus o minus dependiendo de una variable
 */

/**
 * @author David y Juan
 *
 */
public class Ejer4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String texto = teclado.nextLine();
		System.out.println("para mayus pulsa 1 y para minus 2");
		int opcion = teclado.nextInt();
		if (opcion == 1) {
			System.out.print(texto.toUpperCase());
		}
		else if (opcion == 2) {
			System.out.print(texto.toLowerCase());
		}
	}

}
