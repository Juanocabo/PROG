package ejercicios;

import java.util.Scanner;

public class Ejer11 {

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
		
		while(t == 0){
			if(i != 0) {
				int x,z;
				suma = 0;
				x = --i ;
				z = x;
				
				while(z > 0) {
					if(x % z == 0) suma = suma + z;
					--z;
					
					}
			if(suma == i + 1)System.out.println(i);
			}
			else ++t;
		
		
		}
		
		}
	}

}
