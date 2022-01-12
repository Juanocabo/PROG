import java.util.Scanner;

public class Ejer06 {
	/**
	 * @param P numero positivo
	 * @param Q numero positivo
	 * @return el minimo comun multiplo entre P y Q 
	 */
	public static int mcm(int P, int Q) {
		int max,min;
		if(P<=Q){max=Q; min=P;}
		else{ max=P; min=Q;}
		return (max/Ejer05.mcd(P, Q)*min);
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce dos numeros para hallar su m.c.m.");
		int P=teclado.nextInt(),Q=teclado.nextInt();
		System.out.println("El m.c.m. de "+P+" y "+Q+" es: "+mcm(P,Q));

	}

}

