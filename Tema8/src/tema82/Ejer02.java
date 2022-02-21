package tema82;

import java.io.IOException;
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
				}catch(IOException e1){
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
	public void pideCadena() throws IOException {
		cadena=tec.nextLine();
		for(int i = 0 ; i<=cadena.length()&&cont<6;++i) {
			if(cadena.charAt(i)<='9'&&cadena.charAt(i)>='0'&& cont<=6) {num=Integer.parseInt(String.valueOf(cadena.charAt(i)));
			resultado+=num;
			++cont;
			}
			else throw new IOException("la cadena contiene un caracter invalido");
		}--cont;
	}
	public static void main(String[] args) {
			Ejer02 hola = new Ejer02();
}}
