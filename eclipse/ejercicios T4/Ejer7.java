import java.util.Scanner;

/**
 * 
 */

/**
 * @author alu
 *
 */
public class Ejer7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			String frase = teclado.nextLine();
			int mayu=0, minu= 0, num=0;
			char texto;
			int n,m;
			m = frase.length();
			for(n=0;n!=m && m<=80;++n) {
			texto = frase.charAt(n);
			if (texto >= 'A' && texto <= 'Z' ) ++mayu;
			else if(texto >='0' && texto <='9' ) ++num;
			else if(texto >= 'a' && texto <= 'z') ++minu;
			}
			System.out.println("mayusculas"+ mayu);
			System.out.println("minusculas"+ minu);
			System.out.println("numeros"+ num);

	}

}
