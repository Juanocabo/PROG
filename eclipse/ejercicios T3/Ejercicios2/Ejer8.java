package ejercicios;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num, cont=1, factorial=1;
		num= teclado.nextInt();
		if(num>0) {
			while (cont<=num){
				
				factorial= factorial * cont;
				cont++;
			}
			System.out.println("El factorial de tu numero es: "+ factorial);
		}
	}

}
