import java.util.Scanner;

/**
 * 
 */

/**
 * @author alu
 *
 */
public class Ejer9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			String frase = teclado.nextLine();
			int num = teclado.nextInt();
			String texto= ("");
			char letra;
			int n,m;
			frase= frase.toUpperCase();
			m = frase.length();
			for(n=0;n!=m && m<=80;++n) {
			letra = (char) (frase.charAt(n)+num);
			texto = texto + letra;
			
			}
			System.out.print(texto);
		}


	}

