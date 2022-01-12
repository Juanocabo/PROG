package ejercicios;

import java.util.Scanner;

public class EjerPote {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,e,p,f;
		n = teclado.nextInt();
		e = teclado.nextInt();
		System.out.println((int)Math.pow(n,e ));
		p=e;
		while(p!=0) {
			--p;
			System.out.println((int)Math.pow(n,p ));
		}
	}

}
