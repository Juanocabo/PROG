package Tema74;

import java.util.Scanner;

public final class Profesor extends Persona {
	Scanner tec = new Scanner(System.in);
	String dpto;
	int c_plus;
	class plus{
		String nombre;
		float cantidad;
		public plus() {
			nombre=tec.next();
			cantidad=tec.nextFloat();
		}
	}
	plus[] pls;
	public Profesor() {
		pedirDatos();
		pls = new plus[c_plus];
	}
	public void pedirDatos() {
		nombre=tec.next();
		edad=tec.nextInt();
		c_plus=tec.nextInt();
	}
	@Override
	public void DevolverMasAlto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void VisualListaValores() {
		// TODO Auto-generated method stub
		
	}

}
