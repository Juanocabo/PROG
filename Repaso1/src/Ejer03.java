import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce primero la base y luego la altura del rectangulo");
		int b=tec.nextInt(), h = tec.nextInt();
		System.out.println("El area del rectangulo es: "+(b*h)+"m^2");

	}

}
