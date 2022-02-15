package tema81;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer01 {
 Scanner tec  =new Scanner(System.in);
	static public class alumno{
		 Scanner tec  =new Scanner(System.in);
		String nombre;
		int edad;
		float altura;
		boolean correcto=false;
		public alumno() {
			nombre=tec.next();
			while(correcto==false) {
				try {
					tec.nextLine();
					edad=tec.nextInt();
					correcto=true;
				}catch(InputMismatchException e) { correcto=false;
				System.out.println("error datatype");}}
			correcto = false;
			while(correcto==false) {
				try {
					tec.nextLine();
					altura=tec.nextFloat();
					correcto=true;
				}catch(InputMismatchException e) { correcto=false;
				System.out.println("error datatype");}}

		}
		public void verdatos() {
			System.out.println(nombre+" "+edad+" "+altura);
		}
		public void mayor(alumno alu2) {
			if(edad>alu2.edad)System.out.println("el mayor es: "+nombre);
			else if(edad<alu2.edad)System.out.println("el mayor es: "+alu2.nombre);
			else System.out.println("Ambos tienen la misma edad");
		}
	}

	public static void main(String[] args) {
		alumno alu1;
		alumno alu2;
		try {
			alu2 = new alumno();
			alu1 = new alumno();
			alu1.verdatos();
			alu2.verdatos();
			alu1.mayor(alu2);
		} catch (InputMismatchException e) {
			System.out.println("has introduci mal alguno de los datos");
			e.printStackTrace();
		}


	}

}
