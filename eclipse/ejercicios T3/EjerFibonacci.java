package ejercicios;

public class EjerFibonacci {

	public static void main(String[] args) {
		int n=0,m = 1, suma, c = 0;
		System.out.print(n+" " + m+ " ");
		while(c != 100) {
			suma = (n+m);
			n=m;
			m=suma;
			++c;
			System.out.print(" " + m+ " ");
		}
			
	}

}
