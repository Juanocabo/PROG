package tema83;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejer03 {
	Scanner tec = new Scanner(System.in);
	int dividendo=0,divisor=0,cont=0, cociente = 0;
	String cadena;
	boolean correcto=true;
	public Ejer03(){
		try {
			pideNum();
			divide();
		}catch(InputMismatchException e) {
			try{pideCadena();
			divide();
			}catch(IOException e1) {
				System.out.println("Fallo :"+e.getMessage());
			}catch(ArithmeticException e2) {
				System.out.println("Divides por cero"+e2.getMessage());
			}
		}
	}
	public void pideNum() throws InputMismatchException{
		try {
			dividendo=tec.nextInt();
			divisor=tec.nextInt();
		}
		catch(InputMismatchException e) {}

	}
	public void pideCadena() throws IOException {
		cadena=tec.nextLine();
		String cadena2="";
		for(int i = 0 ; i<cadena.length();++i) {
			if(cadena.charAt(i)<='9'&&cadena.charAt(i)>='0'&& cont<=6) {cadena2+=cadena.charAt(i);++cont;}
			else if(cadena.charAt(i)=='/'&&cont==0){dividendo=Integer.parseInt(cadena2);}
			else if(cadena.charAt(i)=='/'&&cont==1){divisor=Integer.parseInt(cadena2);}
			else  throw new IOException("la cadena contiene un caracter invalido");
		}
	}
	public void divide() {
		try {
		cociente=dividendo/divisor;
		System.out.println(cociente);}
		catch(ArithmeticException e2) {
			System.out.println(e2.getMessage());
		}
	}
	public static void main(String[] args) {
		Ejer03 hola = new Ejer03();

	}

}
