package tema7empleados;

public class Administrativos extends Empleados{
	String estudios;
	int ordenador;
	public Administrativos() {
		pedirDatos();
	}
	public void pedirDatos() {
		super.pedirDatos();
		estudios=tec.next();
		ordenador=tec.nextInt();
	}
	public void verDatos() {
		System.out.println(nombre+edad+sueldobase+estudios+ordenador);
		}
}
