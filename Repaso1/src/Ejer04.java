import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce las horas que trabajas");
		int horas = tec.nextInt();
		System.out.println("Tu salario deberia ser: "+12*horas+"€");

	}

}
