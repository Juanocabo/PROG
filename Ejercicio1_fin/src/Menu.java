import java.util.Scanner;

public class Menu {

	Scanner tec = new Scanner(System.in);
	boolean fin;
	String fichero;
	Dgt t;
	public Menu(String fichero) {
		this.fichero=fichero;
		t = new Dgt(fichero);

		do{
			fin=eleccion();
		}while(!fin);
		t.commit();

	}

	private boolean eleccion() {
		int opcion;
		do {
			imprimir();
			opcion=tec.nextInt();
			tec.nextLine();

		}while(opcion<1 || opcion >7);
		if(opcion == 7)return true;
		switch(opcion) {
		case 1: 
			a�adirV();
			break;
		case 2 : 
			eliminarV();
			break;
		case 3:
			a�adirSancion();
			break;
		case 4: 
			consultar();
			break;
		case 5: 
			eliminarS();
			break;
		case 6 : 
			listado();
			break;
		}
		return false;
	}

	private void imprimir() {

		System.out.println("Elige una opcion: ");
		System.out.println("1. A�adir un veh�culo al municipio\n"
				+ "2. Eliminar un veh�culo: si existen sanciones, debe mostrar el n�mero de las mismas y no realizar la\n"
				+ "eliminaci�n\n"
				+ "3. A�adir una sanci�n a un veh�culo\n"
				+ "4. Consultar las sanciones que tiene un veh�culo\n"
				+ "5. Eliminar las sanciones de un veh�culo\n"
				+ "6. Mostrar un listado de los veh�culos para los que la cuant�a de las sanciones es superior a una cantidad\n"
				+ "determinada (que se debe solicitar)\n"
				+ "7. Terminar el programa");
	}
	
	private void a�adirV() {
		
		boolean val=true;
		String matricula,marca,modelo,propietario,a�o;
		do {
			val=true;
			System.out.println("matricula:");
			matricula=tec.next();
			if(Vehiculos.valida(matricula)==false) {
				System.out.println("matricula invalida");
				val=false;
			}
		
		}while(!val);
		System.out.println("marca:");
		marca=tec.next();
		System.out.println("modelo:");
		modelo=tec.next();
		System.out.println("propietario:");
		propietario=tec.next();
		System.out.println("a�o:");
		a�o=tec.next();
		t.a�adirVehiculo(matricula,marca,modelo,propietario,a�o);
		
	}
	
	private void eliminarV() {
		String matricula;
		System.out.println("matricula del vehiculo:");
		matricula= tec.next();
		t.eliminarVehiculo(matricula);
		
	}
	
	private void a�adirSancion() {
		String matricula,fecha,motivo,importe;
		System.out.println("matricula del vehiculo:");
		System.out.println("matricula:");
		matricula=tec.next();
		System.out.println("fecha:");
		fecha=tec.next();
		System.out.println("motivo:");
		tec.nextLine();
		motivo=tec.nextLine();
		System.out.println("importe:");
		importe=tec.next();
		t.a�adirSancion(matricula, fecha, motivo, importe);
		
	}
	
	private void consultar() {
		
		String matricula;
		System.out.println("matricula del vehiculo:");
		matricula=tec.next();
		t.consultaSanciones(matricula);
		
	}
	
	private void eliminarS() {
		
		String matricula;
		System.out.println("matricula del vehiculo:");
		matricula= tec.next();
		t.quitarSanciones(matricula);
		
	}
	
	private void listado() {
		
		int num;
		System.out.println("numero de sanciones:");
		num= tec.nextInt();
		t.vehiculosCon(num);
		
	}
}