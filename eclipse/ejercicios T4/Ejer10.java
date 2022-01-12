import java.util.Scanner;

/**
 * 
 */

/**
 * @author alu
 *
 */
public class Ejer10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	char a;
	String codigo=("");
	String fin=("00000000");
	do{
	codigo = teclado.next();
	a = codigo.charAt(3);
	if(a>=0 && a<=5 && codigo!=fin)System.out.println("año de nacimiento 199" + a);
	
	a = codigo.charAt(4);
	if (a =='M') System.out.println("sexo femenino");
	else if (a=='H')System.out.println("sexo masculino");
	
	a = codigo.charAt(5);
	if (a =='1') System.out.println("curso 1");
	else if (a=='2')System.out.println("curso 2");
	codigo=("");
	}while(codigo.equals(fin)==false); 
	} 
}
