import java.util.Scanner;

/**
 * 
 */

/**
 * @author alu
 *
 */
public class Ejer11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String texto= teclado.nextLine();
		texto= texto.toLowerCase();
		int m;
		m = texto.length();
		char a = 'a';
		int con=0;
	while(a>='a'&& a<='z') {
		for(int n = 0;n!=m && m<=60;++n) {
			if(a ==texto.charAt(n)) {
				con++;
			}
		}if(con>0)System.out.println("\""+a+"\""+" sale "+con+" veces");
		++a;
		con=0;
	}
		
			
	

	}
	}
