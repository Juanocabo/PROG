import java.util.Scanner;

/**
 * en un texto de max 80 nunero de minus y mayus
 */

/**
 * @author David Juan
 *
 */
public class Ejer2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase = teclado.nextLine();
		int cma=0, cmi= 0;
		char texto;
		int n,m;
		m = frase.length();
		for(n=0;n!=m && m<=80;++n) {
		texto = frase.charAt(n);
		if (texto >=97) ++cmi;
		else if(texto>64) ++cma;
		}
		System.out.println("El numero de mayusculas es "+ cma);
		System.out.println("El numero de minusculas es "+ cmi);
	}

}
