import java.util.Scanner;

public class Ejer09 {

	
	public static double raiz(int a,int b, int c, char sig) {
		double resultado=0;
		if(sig == '+')resultado = (-b+Math.sqrt(b*b-4*a*c)/(2*a));
		else if(sig == '-')resultado = (-b-Math.sqrt(b*b-4*a*c)/(2*a));
		return resultado;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a=teclado.nextInt(),b=teclado.nextInt(),c=teclado.nextInt();
		char signo = teclado.next().charAt(0);
		System.out.println(raiz(a,b,c,signo));
		
	}

}
