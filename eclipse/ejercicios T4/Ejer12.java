import java.util.Scanner;

/**
 * 
 */

/**
 * @author alu
 *
 */
public class Ejer12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String texto = teclado.nextLine();
		String resultado = ("");
		int m = texto.length(),i= texto.length(),n;
		resultado=texto;
		while(i>0) {
			resultado=("");
			for( n = 0;n<m-1 && m<=20;++n) {
				resultado = resultado + texto.charAt(n);
				}
			texto=texto.charAt(m-1)+resultado;
			System.out.println(texto);
		--i;
		}

	}

}
