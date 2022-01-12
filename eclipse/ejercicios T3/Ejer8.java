package ejercicios;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,i,f;
		n = teclado.nextInt();
		f = n;
		i = n -1;
			while(i !=0) {
				f = f * (n - i);
				--i;
			}
		System.out.print("el factorial de " + n + " es: "+ f);

	}

}
