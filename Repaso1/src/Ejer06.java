import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Que hora es?");
		int hora=tec.nextInt();
		if (hora>=6 && hora<=12) System.out.println("BUenos dias");
		else if(hora>=12 && hora<=20)System.out.println("Buenas tardes");
		else if(hora<=24)System.out.println("Buenas noches");
		else System.out.println("La hora es incorrecta");
	}

}
