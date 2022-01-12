package ejercicios;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			int a,b, suma;
			//lee los números A y B, extremos de los que debo sumar
			System.out.println("Introduzca el numero menor");
			a= teclado.nextInt();
			System.out.println("Introduzca el numero mayor");
			b= teclado.nextInt();
			//sumo los numeros comprendidos entre a y b
			
			suma = 0;
			for(int contador =a+1; contador < b;contador++)
				suma +=contador	;
			System.out.println("La suma es : "+ suma);
	}

}
