package tema52;

import java.util.Scanner;

public class Trabajador {
	Scanner tec = new Scanner(System.in);
	int id,tit,a�os;
	static int num;
	String nombre;
	boolean ec,turno;
	public Trabajador(int tit,int a�os,String nombre,String ec,String turno) {
		this.id=num++;
		this.tit=tit;
		this.a�os=a�os;
		this.nombre=nombre;
		this.ec=ec.equals("S");
		this.turno=turno.equals("D");
	}
	public int gId () {
		return id;
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
	public void ModTrabajador() {
		String opc;
		String campo="Titulo A�os Nombre Estadocivil Turno no si";
		do {
		System.out.println("Que campo deseas modificar? ");
		opc=tec.nextLine();
		switch (campo.indexOf(opc)){
		case 0: sTit(tec.nextInt());break;
		case 7: sA�os(tec.nextInt());break;
		case 12: sNombre(tec.nextLine());break;
		case 19: sEc(tec.next().equals("S"));break;
		case 31: sTurno(tec.next().equals("D"));break;
		default: System.out.println("no es valido este campo");
		}
		System.out.println("Has terminado de modificar?");
		opc=tec.nextLine();
		}while(campo.indexOf(opc)!=40);
		
	}
	public void VerTrabajador() {
		String ec;
		if(gEc()==true)ec="Soltero";
		else ec="Casado";
		String turno;
		if(gTurno()==true)turno="Diurno";
		else turno="Nocturno";
		System.out.println("Identificador: "+gId()+" Nombre: "+nombre+" Titulacion: "+tit+" A�os en la empresa: "+a�os+" Estado civil: "+ec+" Turno: "+turno);
	}
	public void Salario() {
		int t = 0,i=0;
		switch(gTit()) {
		case 0:i=250;break;
		case 1:i=500;break;
		case 2:i=1000;break;
		case 3:i=1250;break;
		case 4:i=1500;break;
		}
		if(gTurno())t=100;
		double salario=gA�os()*75+425+t+i;
		if(gEc()==true)salario=salario*0.88;
		else salario = salario*0.9;
		System.out.println("el salario de "+gNombre()+" es: "+salario+" �");
	}
}
