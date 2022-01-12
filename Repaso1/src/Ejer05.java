import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		Scanner tec =new Scanner(System.in);
		double resultado;
		System.out.println("Introduce la nota del primer examen:");
		double pri = tec.nextDouble();
		System.out.println("¿Qué nota quieres sacar en la segunda evaluación?");
		double media = tec.nextDouble();
		resultado = (media - pri*0.3)/0.7;
		System.out.println(resultado);
	}

}
