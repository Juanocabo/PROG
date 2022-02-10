package tema7;

import java.util.Scanner;

public class Empleado {
		static final String empresa="Electrica,SA";
		static float sueldobase=1000;
		static float plusjefe=250;
		String nombre;
		int edad;
		float sueldo,porcentaje;
		public Empleado() {}
		public Empleado(String nombre, int edad,float porcentaje) {
			this.nombre=nombre;
			this.edad=edad;
			this.porcentaje=porcentaje;
			sueldo=sueldobase+(sueldobase*(porcentaje/100));
		}
		public void pedirdatos(String nombre, int edad,float porcentaje) {
			this.nombre=nombre;
			this.edad=edad;
			this.porcentaje=porcentaje;
			sueldo=sueldobase+(sueldobase*(porcentaje/100));
		}
		public void modSu(int sueld) {
			sueldobase=sueld;
		}
		public void modPlus(float plus) {
			plusjefe=plus;
		}
		public void verEmp() {
			System.out.println(nombre+" "+edad+" "+porcentaje+" "+sueldo);
		}
	
	public static void main(String[]args) {
		int nemp, njefe;
		Empleado general = new Empleado();
		Scanner tec = new Scanner(System.in);
		System.out.println("cuantos empleados y jefes hay:");
		nemp = tec.nextInt();
		njefe = tec.nextInt();
		Empleado[] lista = new Empleado[nemp+njefe];
		for(int i = 0;i<(nemp+njefe);++i) {
			if(i<=nemp-1)lista[i]= new Empleado();
			else lista[i]=new Jefe();
		}
		for(int i = 0;i<(nemp+njefe);++i) {
			if(lista[i] instanceof Jefe) {
				((Jefe) lista[i]).pedirdatos(tec.next(),tec.nextInt(),tec.nextFloat(),tec.next());
				}
			else lista[i].pedirdatos(tec.next(),tec.nextInt(),tec.nextFloat());
		}
		int opcion=0;
		do{
			System.out.println("DADO EL SIGUIENTE MENU:");
			System.out.println("1. Modificar el sueldo base de todos los empleados.\r\n"
					+ "2. Modificar el plus de todos los jefes.\r\n"
					+ "3. Visualizar los datos de todos los empleados.\r\n"
					+ "4. Salir.");
			System.out.println("ELIJA UNA OPCIÓN:");
			opcion=tec.nextInt();
			switch(opcion) {
			case 1: general.modSu(tec.nextInt());break;
			case 2: general.modPlus(tec.nextFloat());break;
			case 3: for(int i = 0; i<lista.length;++i) {
				lista[i].verEmp();
			}break;
			default:break;
			}
		}while(opcion!=4);
	}
}
