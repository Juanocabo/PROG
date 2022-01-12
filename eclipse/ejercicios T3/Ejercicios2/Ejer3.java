/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author David y Juan
 *
 */
public class Ejer3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,i;
		n = teclado.nextInt();
		i = n;
		while(i  > 1 ) {
			--i;
			if(n % i == 0) {
				System.out.println(i);
				}
				
			
		}

	}

}
