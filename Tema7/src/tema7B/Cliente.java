package tema7B;
import java.util.Scanner;
public class Cliente implements Persona{

	Scanner tec = new Scanner(System.in);
	String nombre;
	public void pedirTodosDatos() {
		nombre=tec.next();
	}

	@Override
	public void visualizarTodosDatos() {
		System.out.println(nombre+" "+nomemp);
		
	}

}
