import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce las horas que trabajas");
		int horas = tec.nextInt();
		if(horas<=40)System.out.println("Tu salario deberia ser: "+12*horas+"€");
		else { 
			horas = horas-40;
			System.out.println("Tu salario deberia ser: "+(16*horas+480)+"€");
		}
	}

}
