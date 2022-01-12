package tema52;

public class Conductor {

	public static void main(String[] args) {
		Trabajador tra = new Trabajador();
		Trabajador.NuevoTrabajador();
		tra.VerTrabajador();
		Trabajador.ModTrabajador();
		tra.VerTrabajador();
		tra.Salario();
	}

}
