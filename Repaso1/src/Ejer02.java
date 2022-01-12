import java.util.Scanner;

public class Ejer02 {
	public static double ope(int a, char o, int b) {
		int resultado;
		boolean correcto;
		switch (o){
		case '+': resultado = a+b;break;
		case '-': resultado = a-b;break;
		case '*': resultado = a*b;break;
		case '/': resultado = a/b;break;
		default : resultado=0; 
		}
		return resultado;
	}
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce los numeros para realizar sus operaciones");
		int a = tec.nextInt(), b =tec.nextInt();
		System.out.println(ope(a,'+',b));
		System.out.println(ope(a,'-',b));
		System.out.println(ope(a,'*',b));
		System.out.println(ope(a,'/',b));
	}

}
