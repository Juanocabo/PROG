/**
 * busca una palabra en un texto y nos devuelve su posicion y no esta 0
 */

/**
 * @author David y Juan
 *
 */
import java.util.Scanner;
public class Ejer3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String texto = teclado.nextLine() + " ";
		String palabra = teclado.next();
		String palabrat= ("") ;
		int n=0,m,c=1,a=0;
		while(a==0) {
		for(m = texto.length();n!=m && texto.charAt(n)>64 || texto.charAt(n)>96;++n){
		palabrat =  (palabrat + texto.charAt(n));
		}
		if(palabrat.equals(palabra) == true) {
			System.out.print("esta en la posicion "+ c);
			++a;
		}
		else {++c;
		++n;
		palabrat=("");
		}
		if(n==m) {System.out.print("0"); ++a;}
		}
	}

}
