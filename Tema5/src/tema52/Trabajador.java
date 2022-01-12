package tema52;

import java.util.Scanner;

public class Trabajador {
	static Trabajador tra = new Trabajador();
	int id,tit,a�os;
	String nombre;
	boolean ec,turno;
	public int gId () {
		return id;
	}
	public void sId(int id) {
		this.id=id;
	}
	public int gTit() {
		return tit;
	}
	public void sTit(int tit) {
		this.tit=tit;
	}
	public int gA�os() {
		return a�os;
	}
	public void sA�os(int a�os) {
		this.a�os=a�os;
	}
	public String gNombre() {
		return nombre;
	}
	public void sNombre(String nombre) {
		this.nombre=nombre;
	}
	public boolean gEc() {
		return ec;
	}
	public void sEc(boolean ec) {
		this.ec=ec;
	}
	public boolean gTurno() {
		return turno;
	}
	public void sTurno(boolean turno) {
		this.turno=turno;
	}
	public static void NuevoTrabajador() {
		Scanner teclado = new Scanner(System.in);
		String n;
		int m;
		m=teclado.nextInt();
		tra.sId(m);
		m=teclado.nextInt();
		tra.sTit(m);
		m=teclado.nextInt();
		tra.sA�os(m);
		n= teclado.next();
		tra.sNombre(n);
		n=teclado.next();
		tra.sEc(n.equals("S"));
		n=teclado.next();
		tra.sTurno(n.equals("D"));
	}
	public static void ModTrabajador() {
		Scanner tec = new Scanner(System.in);
		String opc;
		String campo="Titulo A�os Nombre Estadocivil Turno no si";
		do {
		System.out.println("Que campo deseas modificar? ");
		opc=tec.nextLine();
		switch (campo.indexOf(opc)){
		case 0: tra.sTit(tec.nextInt());break;
		case 7: tra.sA�os(tec.nextInt());break;
		case 12: tra.sNombre(tec.nextLine());break;
		case 19: tra.sEc(tec.next().equals("S"));break;
		case 31: tra.sTurno(tec.next().equals("D"));break;
		default: System.out.println("no es valido este campo");
		}
		System.out.println("Has terminado de modificar?");
		opc=tec.nextLine();
		}while(campo.indexOf(opc)!=40);
		
	}
	public void VerTrabajador() {
		String ec;
		if(tra.ec==true)ec="Soltero";
		else ec="Casado";
		String turno;
		if(tra.turno==true)turno="Diurno";
		else turno="Nocturno";
		System.out.println("Identificador: "+tra.id+" Nombre: "+tra.nombre+" Titulacion: "+tra.tit+" A�os en la empresa: "+tra.a�os+" Estado civil: "+ec+" Turno: "+turno);
	}
	public void Salario() {
		int t = 0,i=0;
		switch(tra.tit) {
		case 0:i=250;break;
		case 1:i=500;break;
		case 2:i=1000;break;
		case 3:i=1250;break;
		case 4:i=1500;break;
		}
		if(tra.turno)t=100;
		int salario=tra.a�os*75+425+t+i;
		System.out.println("el salario de "+tra.nombre+" es: "+salario+" �");
	}
}
