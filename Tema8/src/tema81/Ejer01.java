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
		boolean correcto=true;
		public alumno() throws IOException {
			
			try {
				do {
					System.out.println("Dime el nombre");
					nombre=tec.nextLine();
					for( int i=0; i<nombre.length()&&correcto==true;++i) {
					;
						if(nombre.toLowerCase().charAt(i)>='a' && nombre.toLowerCase().charAt(i)<='z')correcto=true;
						else correcto=false;
					}
				}while(correcto==false);
				//correcto=true;
			}catch(InputMismatchException e) { 
			throw new IOException("error datatype");}//}
			
			//while(correcto==false) {
				try {
					tec.nextLine();
					do {
						System.out.println("Dime la edad");
						edad=tec.nextInt();
					}while(edad<0);
					//correcto=true;
				}catch(InputMismatchException e) {
				throw new IOException("error datatype");}//}
			//correcto = false;
			//while(correcto==false) {
				try {
					tec.nextLine();
					do {
						System.out.println("Dime la altura");
						altura=tec.nextFloat();
					}while(altura<0);
					//correcto=true;
				}catch(InputMismatchException e) {
				throw new IOException ("error datatype");
				}}

		//}
		public void verdatos() {
			System.out.println(nombre+" "+edad+" "+altura);
		}
		public void mayor(alumno alu2) {
			if(edad>alu2.edad)System.out.println("el mayor es: "+nombre);
			else if(edad<alu2.edad)System.out.println("el mayor es: "+alu2.nombre);
			else System.out.println("Ambos tienen la misma edad");
		}
	}

	public static void main(String[] args){
		alumno alu1;
		alumno alu2;
		//try {
			try {
				alu1 = new alumno();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				return;
			}
			try {
				alu2 = new alumno();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				return;
			}
			
			alu1.verdatos();
			alu2.verdatos();
			alu1.mayor(alu2);
		//} catch (InputMismatchException e) {
			//System.out.println("has introduci mal alguno de los datos");
			//e.printStackTrace();
		//}


	}

}
