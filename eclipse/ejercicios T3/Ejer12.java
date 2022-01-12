package ejercicios;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,b,h;
		System.out.println("Para elegir la figura para calcular su area: ");
		System.out.println("Pulsa 1 Triangulo");
		System.out.println("Pulsa 2 Cuadrado");
		System.out.println("Pulsa 3 Rectangulo");
		n = teclado.nextInt();
		
		switch (n) {
		case 1 :
			System.out.println("introduce la base del triangulo en cm");
			b = teclado.nextInt();
			System.out.println("introduce la altura del triangulo en cm");
			h = teclado.nextInt();
			System.out.print("El area del triangulo es -> " + b*h/2 + " cm^2");break;
		case 2:
			System.out.println("introduce el lado del cuadrado en cm");
			b = teclado.nextInt();
			System.out.print("El area del cuadrado es -> " + b*b + " cm^2");break;
		case 3:
			System.out.println("introduce la base del rectangulo en cm");
			b = teclado.nextInt();
			System.out.println("introduce la altura del rectangulo en cm");
			h = teclado.nextInt();
			System.out.print("El area del rectangulo es -> " + b*h + " cm^2");break;
		}
	}

}