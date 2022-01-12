import java.util.Scanner;

public class Ejer03 {

	static int factorial(int N) {
		int cont, factorial=1;
		if(N>0) {
			for(cont=1;cont<=N;++cont){
				
				factorial= factorial * cont;
			}
			return factorial;
		}
		else return -1;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero par arealizar su factorial");
		int N = teclado.nextInt();
		if(N>-1)System.out.println(factorial(N));
		else System.out.println("el numero no es valido");
	}

}
