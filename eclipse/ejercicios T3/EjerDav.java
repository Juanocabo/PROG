package ejercicios;

import java.util.Scanner;

public class EjerDav {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,c=0,i=0,y=1, suma=0,e;
		n= teclado.nextInt();
		while(y<=n) {
		for(e=n-y;e>=0;--e) {
		System.out.print(" ");
		}
		for(c=0;c<y;++c) {
			++suma;
			System.out.print(suma);
		}
		for(c=y;c>1;--c) {
			--suma;
			System.out.print(suma);
		}
		suma=0;
			System.out.println(" ");
			++y;
		}
		}
		
	}
