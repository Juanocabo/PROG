import java.util.Scanner;

/**
 * 
 */

/**
 * @author alu
 *
 */
public class Ejer5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			String frase = teclado.nextLine();
			String textoimpar = ("");
			String textopar = ("");
			int n,m;
			m = frase.length();
			for(n=0;n!=m && m<=80;++n) {
			if(n % 2==0) {
			textopar = textopar + frase.charAt(n);
			}
			else textoimpar = textoimpar + frase.charAt(n);
			}
			System.out.println(textopar);
			System.out.println(textoimpar);
		}



	}


