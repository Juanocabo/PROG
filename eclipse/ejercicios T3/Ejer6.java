package ejercicios;

import java.util.Scanner;

public class Ejer6 {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 1, suma1=0,suma2=0, c=1;
		
		while (n != 0) {
			n = teclado.nextInt();
			if(c%2 == 0)
			suma2 = suma2 + n;
			else suma1 = suma1 +n;
			++c;
		}
		System.out.print("el resulado de la suma impar es: "+ suma1 +" el resulado de la suma par es: "+ suma2);
	}

}
