package ejercicios;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,i, suma = 0, t=0, n1;
		n = teclado.nextInt();
		n1 = n;
		if (n != 0) {
		i = n ;
		while(i > 0) {
			if(n % i == 0) suma = suma + i;
			--i;
			}
		i = n1 ;
		if(suma != n+1) {
		while(t == 0){
			if(suma != i + 1) {
				int x,z;
				suma = 0;
				x = ++i ;
				z = x;
				
				while(z > 0) {
					if(x % z == 0) suma = suma + z;
					--z;
					}
			}
			else ++t;
		}
		System.out.print("el siguiente numero que si es primo es "+i);
		}
		else if(suma == n+1) System.out.print("el numero es primo");
		}
	}

}
