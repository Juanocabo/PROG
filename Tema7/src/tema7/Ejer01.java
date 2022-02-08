package tema7;

import java.util.Scanner;

public class Ejer01 {
	Empleado[] copia;
	Scanner tec = new Scanner(System.in);
	public class Empleado{
		String nombre;
		float sueldo;
		public Empleado(String nombre, float sueldo) {
			this.nombre=nombre;
			this.sueldo=sueldo;
		}
		public void visEmp() {
			System.out.println(nombre+" "+sueldo);
		}
	}
	public class Jefe extends Empleado{
		String titulo,depto;
		public Jefe(String nombre, float sueldo,String titulo, String depto) {
			super(nombre,sueldo);
			this.titulo=titulo;
			this.depto=depto;
		}
		public void visEmp() {
			System.out.println(nombre+" "+sueldo+" "+titulo+" "+depto);
		}
	}
	public Ejer01(int num,boolean emj) {
		if(emj==true) {
		Empleado[] emp = new Empleado[num];
		for(int i =0;i<num;++i) {
			emp[i]=new Empleado(tec.next(),tec.nextFloat());}
				copia=emp;}
		else {
			Empleado[] emp = new Empleado[num];
			for(int i =0;i<num;++i) {
				emp[i]=new Jefe(tec.next(),tec.nextFloat(),tec.next(),tec.next());
				copia=emp;}
		}
		
	}
	public void Ver() {
		for(int i =0;i<copia.length;++i) {
			copia[i].visEmp();
		}
	}
	
}
