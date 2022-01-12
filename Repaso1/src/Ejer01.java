import java.util.Scanner;

public class Ejer01 {
	public static double eupst(int a){
		return a*166.386;
		
	}
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce el numero de euros que quieres convertir en pesetas");
		int euros = tec.nextInt();
		System.out.println(eupst(euros));

	}

}
