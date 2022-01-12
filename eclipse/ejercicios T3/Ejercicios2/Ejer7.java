package ejercicios;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, suma= 0, i,c=0, me = 0 , ma = 0;
		i= teclado.nextInt();
		if(i>0) {
		++c;
		suma=suma + i;
		me = i;
		ma = i;}	
		while(i != 0) {
			n= teclado.nextInt();
			i = n;
			if(i != 0) {
				if(n>=ma) ma = n;
				if(n<me) me=n;
				suma = suma + n;
				++c;
			}
		}
		System.out.print("la media de estos numeros es: " + (float)suma/c+ " y el mayor y el menor son respectivamente:"+ ma +" "+ me);
	}

}
