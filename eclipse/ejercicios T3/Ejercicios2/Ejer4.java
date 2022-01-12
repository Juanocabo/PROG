package ejercicios;

import java.util.Scanner;

public class Ejer4 {
	// n= numero intro i= divisor c= contador divisores

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,i,c = 0;
		n = teclado.nextInt();
		i = n - 1 ;
		while(i  > 1 ) {
			if(n % i == 0) {
				
				++c;
				}
			--i;
			
	}
		if(c != 0 ) {
			System.out.print("El numero no es primo");
		}
		else System.out.print("el numero es primo");
}
}