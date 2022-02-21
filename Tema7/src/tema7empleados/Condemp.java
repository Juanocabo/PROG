package tema7empleados;

import java.util.Scanner;

public class Condemp {
	public static double Media(Empleados[] pers,int oc) {
		double media;
		int cont=0,edad=0;
		if(oc==1) {
		for(int i = 0 ; i<pers.length;++i) {
			if(pers[i] instanceof Empleados) {
				edad+=pers[i].edad;
				++cont;}
		}}
		else if(oc==2) {for(int i = 0 ; i<pers.length;++i) {
			if(pers[i] instanceof Administrativos) {
				edad+=pers[i].edad;
				++cont;}
			}
		}
		else {for(int i = 0 ; i<pers.length;++i) {
			if(pers[i] instanceof Maquinistas) {
				edad+=pers[i].edad;
				++cont;}
			}
		}
		media=edad/cont;
		return media;
	}
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int total;
		System.out.println("escribe el numeor de empleados basicos, admin, maquinistas:");
		int nemp=tec.nextInt();
		int nadm=tec.nextInt();
		int nmaq=tec.nextInt();
		total=nemp+nadm+nmaq;
		nadm+=nemp;
		nmaq+=nadm;
		Empleados[] emp = new Empleados[total];
		for(int i = 1 ; i<=emp.length;++i) {
			if(i<=nemp)emp[i-1]=new Empleados();
			else if(i<=nadm && i>nemp)emp[i-1]=new Administrativos();
			else if(i<=nmaq && i>nadm)emp[i-1]=new Maquinistas();
		}
		System.out.println("Datos de empleados basicos");
		for(int i = 0 ; i<emp.length;++i) {
			if(emp[i] instanceof Empleados)emp[i].verDatos();
		}
		System.out.println("Datos de empleados administrativos");
		for(int i = 0 ; i<emp.length;++i) {
			if(emp[i] instanceof Administrativos)emp[i].verDatos();
		}
		System.out.println("Datos de empleados maquinistas");
		for(int i = 0 ; i<emp.length;++i) {
			if(emp[i] instanceof Maquinistas)emp[i].verDatos();
		}
		
		Media(emp,1);
	}

}
