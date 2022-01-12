package ejercicios;

import java.util.Scanner;

public class Ejer5 {
// n=num introducido       suma= acmula el resultado       c= cuenta los nums introducidos
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 1, suma=0, c=0;
		
		while (n != 0) {
			n = teclado.nextInt();
			System.out.println(suma+"+"+ n);
			suma = suma + n;
			++c;
		}
		System.out.print("el resulado de la suma es: "+ suma + " y se han introducido : "+ c);
	}

}
