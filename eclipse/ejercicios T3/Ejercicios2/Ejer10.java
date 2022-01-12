package ejercicios;

import java.util.Scanner;

public class Ejer10 {

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
				System.out.println("El numero no es primo");
				while(c!= 0) {
					++n;
					i=n-1;
					c=0;
					while(i>1){
					if(n % i == 0) {
						
						++c;
						}
					--i;
					}
	
				}
				System.out.println("El numero primo es: " + n);
			}
			
	}
	}