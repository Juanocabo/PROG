import java.util.Scanner;

public class Ejer04 {	
	/**static boolean esPrimo (int n){
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
	}*/
	static void imPrimo(int n) {
		int cont=0;
		for(int m=n;cont<m;++cont) {
			if(Ejer01.esPrimo(cont))System.out.println(cont);
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero para saber la lista de primos hasta el");
		int n=teclado.nextInt();
		imPrimo(n);
	}

}
