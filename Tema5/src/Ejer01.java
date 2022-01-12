import java.util.Scanner;

public class Ejer01 {
	public static boolean esPrimo (int n){
	int i,c = 0;
	i = n - 1 ;
	while(i  > 1 ) {
		if(n % i == 0) {
			
			++c;
			}
		--i;
		
}
	if(c != 0 ) return false;
	else return true;
	
	
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("escribe un numero para saber si es primo");
		int P=teclado.nextInt();
		boolean primo;
		primo = esPrimo(P);
		if(primo)System.out.println("el numero es primo");
		if(!primo)System.out.println("el numero no es primo");
	}

}