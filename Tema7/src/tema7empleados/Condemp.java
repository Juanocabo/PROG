package tema7empleados;

import java.util.Scanner;

public class Condemp {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int total;
		int nemp=tec.nextInt();
		int nadm=tec.nextInt();
		int nmaq=tec.nextInt();
		total=nemp+nadm+nmaq;
		Empleados[] emp = new Empleados[total];
		for(int i = 0 ; i<emp.length;++i) {
			if(i<=nemp-1)emp[i]=new Empleados();
			else if(i<=nadm-1)emp[i]=new Administrativos();
			else emp[i]= new Maquinistas();
		}
	}

}
