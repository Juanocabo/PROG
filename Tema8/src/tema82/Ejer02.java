package tema82;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer02 {
	Scanner tec = new Scanner(System.in);
	int num=0,cont=0, resultado = 0;
	String cadena;
	boolean correcto=true;
	public Ejer02(boolean adios) {

	}
	public Ejer02(){
		int n=0;
		do {
			try {
				pideNum();
			}catch(InputMismatchException e){
				try{pideCadena();
				}catch(NoNumCadenaException e1){
					correcto=false;
				}
			}
			
		}while(correcto && cont<6);
		System.out.println(resultado);
	}
	public void pideNum() throws InputMismatchException{
		try {
		num=tec.nextInt();
		resultado+=num;
		++cont;}
		catch(InputMismatchException e) {}

	}
	public void pideCadena() throws NoNumCadenaException {
		cadena=tec.nextLine();
		for(int i = 0 ; i<=cadena.length()&&cont<6;++i) {
			if(cadena.charAt(i)<='9'&&cadena.charAt(i)>='0'&& cont<=6) {num=Integer.parseInt(String.valueOf(cadena.charAt(i)));
			resultado+=num;
			++cont;
			}
			else throw new NoNumCadenaException("la cadena contiene un caracter que no es un numero");
		}--cont;
	}
	public class NoNumCadenaException extends Exception {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public NoNumCadenaException ( String error) {
			super();}
		

		}
	public static void main(String[] args) {
			Ejer02 hola = new Ejer02();
}}
