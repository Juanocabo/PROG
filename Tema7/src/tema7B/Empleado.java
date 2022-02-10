package tema7B;

import java.util.Scanner;

public class Empleado implements Persona{
	String nombre;
	Scanner tec = new Scanner(System.in);
	public void pedirTodosDatos() {
	
		nombre=tec.next();
	}

	@Override
	public void visualizarTodosDatos() {
	
		System.out.println(nombre+" "+nomemp);
	}

}
