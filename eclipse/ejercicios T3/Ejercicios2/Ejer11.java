package ejercicios;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int num,div=2,cont=0;
	Scanner teclado = new Scanner(System.in);
	num= teclado.nextInt();
	
	while(num>1) {
		cont=0;
		--num;
		div = num -1;
		while(div > 1) {
		if(num % div == 0) ++cont;
		--div;
		}if(cont == 0 && div>=1) System.out.println(num);
	}

	}

}
