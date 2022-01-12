package ejercicios;

import java.util.Scanner;

public class EjerPote2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,e,p,f=0,r;
		n = teclado.nextInt();
		e = teclado.nextInt();
		r=1;
		p=e;
	    f=0;
		while(f<=p) {
			r= r*n;
			++f;
			System.out.println(r);
		}	
			
			
	}

}
