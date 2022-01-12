package ejercicios;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		int n;
		Scanner teclado = new Scanner(System.in);
	     n = teclado.nextInt();
	     if(n >= 1 && n <= 10) {
	    	 System.out.println("La tabla de multiplicar de "+ n + " es:");
	    	 System.out.println(n+"*1 = "+ n*1);
	    	 System.out.println(n+"*2 = "+ n*2);
	    	 System.out.println(n+"*3 = "+ n*3);
	    	 System.out.println(n+"*4 = "+ n*4);
	    	 System.out.println(n+"*5 = "+ n*5);
	    	 System.out.println(n+"*6 = "+ n*6);
	    	 System.out.println(n+"*7 = "+ n*7);
	    	 System.out.println(n+"*8 = "+ n*8);
	    	 System.out.println(n+"*9 = "+ n*9);
	    	 System.out.println(n+"*10 = "+ n*10);
	     }
	     else System.out.println("Error");
	}

}
