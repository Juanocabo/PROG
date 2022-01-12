package ejercicios;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num, cont, suma=0;
		num = teclado.nextInt();
		cont = num;
		
		while(cont  > 1 ) {
			--cont;
			if(num % cont == 0) {
				suma= suma + cont;
				
				}
		}if(num== suma && num !=0 ) {
			System.out.println("El numero es perfecto");
		}
		
		else System.out.println("El numero no es perfecto");
	
	}

}
