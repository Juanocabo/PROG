import java.util.Scanner;

public class Ejer08 {
	/**
	 * 
	 * @param m elementos
	 * @param n agrupacion
	 * @return 
	 */
	
	public static int agrupacion(int m,int n) {
		int resultado;
		resultado =Ejer03.factorial(m)/(Ejer03.factorial(n)*Ejer03.factorial(m-n));
		return resultado;
	}
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduce el numero de elementos y el numero en el que se desean agrupar");
	int m=teclado.nextInt(),n=teclado.nextInt();
	System.out.println("el numero de combinaciones en las que "+m+
			" elementos se agrupan de "+n+" en "+n+" es: "+agrupacion(m,n));
	}

}
