package tema7empleados;

public class Maquinistas extends Empleados{
	int maquina,a�os;
	public Maquinistas() {
	pedirDatos();
	}

	public void pedirDatos() {
		super.pedirDatos();
		maquina=tec.nextInt();
		a�os=tec.nextInt();
	}
	public void verDatos() {
		System.out.println(nombre+edad+sueldobase+maquina+a�os);
		}
}
