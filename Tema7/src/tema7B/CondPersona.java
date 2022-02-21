package tema7B;

public class CondPersona {

	public static void main(String[] args) {
		Persona cli = new Cliente();
		Persona emp = new Empleado();
		cli.pedirTodosDatos();
		cli.visualizarTodosDatos();
		emp.pedirTodosDatos();
		emp.visualizarTodosDatos();

	}

}
