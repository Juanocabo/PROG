import java.util.Scanner;

/**
 * 
 */

/**
 * @author alu
 *
 */
public class Ejer6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase = teclado.nextLine();
		int con=0, vo= 0, num=0;
		char texto;
		int n,m;
		frase = frase.toLowerCase();
		m = frase.length();
		for(n=0;n!=m && m<=80;++n) {
		texto = frase.charAt(n);
		if (texto == 'a'||texto == 'e'||texto == 'i'||texto == 'o'||texto == 'u') ++vo;
		else if(texto >=48 && texto <=57 ) ++num;
		else if(texto >= 'a' && texto <= 'z') ++con;
		}
		System.out.println("vocales"+ vo);
		System.out.println("consonantes"+ con);
		System.out.println("numeros"+ num);
	}

}
