import java.util.Scanner;

/**
 * En este ejercicio leeremos una frase de manera progresiva de max 80 car.
 */

/**
 * @author David y Juan
 *
 */
public class Ejer1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase = teclado.nextLine();
		String texto = ("");
		int n,m;
		m = frase.length();
		for(n=0;n!=m && m<=80;++n) {
		texto = texto + frase.charAt(n);
		System.out.println(texto);
		}
	}

}
