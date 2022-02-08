package tema7;

import java.util.Scanner;

public class Ejer03 {
	public class Empleado {
		static final String empresa="Electrica,SA";
		static float sueldobase=1000,plusjefe=250;
		String nombre;
		int edad;
		float sueldo,porcentaje;
		public Empleado(String nombre, int edad,float porcentaje) {
			this.nombre=nombre;
			this.edad=edad;
			this.porcentaje=porcentaje;
			sueldo=sueldobase+(sueldobase*(porcentaje/100));
		}
		public void modSu(int sueld) {
			sueldobase=sueld;
		}
		public void modPlus(int plus) {
			plusjefe=plus;
		}
		public void verEmp() {
			System.out.println(nombre+" "+edad+" "+porcentaje+" "+sueldo);
		}
	}
	public class Jefe extends Empleado{
		String depto;
		public Jefe(String nombre, int edad,float porcentaje,String depto) {
			super(nombre,edad,porcentaje);
			this.depto=depto;
			sueldo+=plusjefe;
		}
		public void verEmp() {
			System.out.println(nombre+" "+edad+" "+porcentaje+" "+depto+" "+sueldo);
		}
	}
	public static void main(String[]args) {
		Scanner tec = new Scanner(System.in);
		int opcion=0;
		do{
			
		}while(opcion!=4);
	}
}
