import java.util.Scanner;

public class persona {
	Scanner tec = new Scanner(System.in);
		String nombre;
		static int total=1;
		int id;
		public persona(boolean va) {
			nombre ="";
			id = 0;
		}
		public persona() {
			System.out.println("escribe el nombre del pariticipante numero "+total);
			nombre = tec.nextLine();
			id = total;
			++total;
		}
	}
