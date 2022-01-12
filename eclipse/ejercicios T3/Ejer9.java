package ejercicios;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,i, suma = 0;
		n = teclado.nextInt();
		if (n != 0) {
		i = n -1;
		while(i > 0) {
			if(n % i == 0) suma = suma + i;
			--i;
		}
		if (suma == n)System.out.print(n + " es un numero perfecto");
		else System.out.print(n + " no es un numero perfecto");
		}
		else System.out.print(n + " no es un numero perfecto");
	}

}
