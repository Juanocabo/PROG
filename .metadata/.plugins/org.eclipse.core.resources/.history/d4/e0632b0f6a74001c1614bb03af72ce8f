import java.util.Scanner;

public class Ejer05 {
		/**
		 * @param P numero positivo
		 * @param Q numero positivo
		 * @return el maximo comun divisor entre P y Q 
		 */
	public static int mcd(int P, int Q) {
		
		int i,c1 = 0;
		if(P>=0 && Q>=0) {
			for(i=1;i<=P;++i) {
				if(P % i == 0 && Q % i == 0)c1=i;		
			}
		}return c1;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce dos numeros para hallar su m.c.d.");
		int P=teclado.nextInt(),Q=teclado.nextInt();
		System.out.println("El m.c.d. de "+P+" y "+Q+" es: "+mcd(P,Q));

	}

}
