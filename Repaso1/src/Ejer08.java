import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce la altura a la qeu cae el objeto en metros");
		int h = tec.nextInt();
		double t;
		final double g=9.81;
		t=Math.sqrt((2*h)/g);
		System.out.println("Tardara en caer: "+t+" segundos");
		
	}

}
