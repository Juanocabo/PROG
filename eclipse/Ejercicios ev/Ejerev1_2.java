import java.util.Scanner;

/**
 * 
 */

/**
 * @author alu
 *
 */
public class Ejerev1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		int v,m;
		v = (int) (Math.random() * 50);
		do {
			System.out.println("escribe");
			m = teclado.nextInt();
			if(m<v) {
				System.out.println("te has quedado corto,corto");}
			else if(m>v) {
				System.out.println("tas pasao");}
			++i;
		}while(m!=v && i<7);
		
	if(m==v)System.out.println("has acertado");
	if(i>7)System.out.println("Te has quedado sin intentos");
	}

}
