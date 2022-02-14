package tema7empleados;
import java.util.Scanner;
public class Empleados {
	Scanner tec = new Scanner(System.in);	
	String nombre;
	static float sueldobase=1000;
	int edad;
	public Empleados(){
	  this.pedirDatos();
	}
	public void pedirDatos() {
		nombre=tec.next();
		edad=tec.nextInt();
	}
	public void verDatos() {
	System.out.println(nombre+edad+sueldobase);
	}
}
