package tema7B;

public class CondPersona {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		Empleado emp = new Empleado();
		cli.pedirTodosDatos();
		cli.visualizarTodosDatos();
		emp.pedirTodosDatos();
		emp.visualizarTodosDatos();

	}

}
