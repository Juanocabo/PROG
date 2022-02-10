package tema7empleados;

public class Maquinistas extends Empleados{
	int maquina,años;
	public Maquinistas() {
	pedirDatos();
	}

	public void pedirDatos() {
		super.pedirDatos();
		maquina=tec.nextInt();
		años=tec.nextInt();
	}
	public void verDatos() {
		System.out.println(nombre+edad+sueldobase+maquina+años);
		}
}
