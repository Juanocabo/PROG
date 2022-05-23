package ejercicio2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class MenuAgenda {

	String fichero="agenda.dat";
	Agenda agenda = new Agenda(fichero);
	String menu="1-.Añadir un contacto\r2-.Borrar un contacto\r3-.Listado en orden alfabetico\r"
			+ "4-.Buscar por nombre\r5-.Añadir un telefono\r6-.Borrar un telefono\r"
			+ "7-.Buscar telefono\r8-.Asignar sexo\r0-.Salir";
	Scanner tec = new Scanner(System.in);
	PrintStream out=null;

	public MenuAgenda() {
		
		int opcion;
		do {
			System.out.println(menu);
			do {
				System.out.println("-->");
				opcion=tec.nextInt();
				tec.nextLine();
			}while(!(opcion<=8 && opcion>=0));
			
			switch(opcion) {
			
			case 1 : anadirContacto();
				break;
			case 2 : borrarContacto();
				break;
			case 3 : listadoOrdenado();
				break;
			case 4 : buscaNombre();
				break;
			case 5 : anadirTelefono();
				break;
			case 6 : borrarTelefono();
				break;
			case 7 : buscaTelefono();
				break;
			case 8 : asignaSexo();
				break;
			
			}
		}while(opcion!=0);

	}
	
	private void anadirContacto(){
		
		String nombre,telefono,tipo;
		do {
		System.out.println("nombre del contacto");
		nombre=tec.nextLine();
		}while(agenda.buscaNombre(nombre)!=null);
		
		do {
			System.out.println("telefono");
			telefono=tec.nextLine();
		}while(!Telefono.telefonoValido(telefono));
		
		System.out.println("tipo:");
		tipo=tec.nextLine();
		agenda.addContacto(nombre, telefono, tipo);
		transaccion();
		
	}
	
	private void borrarContacto() {
		
		String nombre;
		System.out.println("nombre:");
		nombre=tec.nextLine();
		if(!agenda.delContacto(nombre))System.out.println("No se pudo eliminar");
		transaccion();
		
	}
	
	private void listadoOrdenado() {
		
		System.out.println(agenda.listadoAZ());
		
	}
	
	private void buscaNombre() {
		
		String nombre;
		System.out.println("nombre:");
		nombre=tec.nextLine();
		System.out.println((agenda.buscaNombre(nombre)!=null)?agenda.buscaNombre(nombre):
			"No existe ningun contacto con ese nombre");
		
	}
	
	private void anadirTelefono() {
		
		String nombre,telefono,tipo;
		do {
			System.out.println("nombre del contacto:");
			nombre=tec.nextLine();
			}while(agenda.buscaNombre(nombre)==null);
		do {
			System.out.println("telefono");
			telefono=tec.nextLine();
		}while(!Telefono.telefonoValido(telefono));
		System.out.println("tipo:");
		tipo=tec.nextLine();
		agenda.addTelefono(nombre, telefono, tipo);
		transaccion();
		
	}
	
	private void borrarTelefono() {
		
		String nombre,telefono;
		do {
			System.out.println("nombre del contacto:");
			nombre=tec.nextLine();
			}while(agenda.buscaNombre(nombre)==null);
		do {
			System.out.println("telefono");
			telefono=tec.nextLine();
		}while(!Telefono.telefonoValido(telefono));
		agenda.delTelefono(nombre, telefono);
		transaccion();
		
	}
	
	private void buscaTelefono() {
		
		String telefono;
		System.out.println("telefono:");
		telefono=tec.nextLine();
		System.out.println(agenda.buscaTelefono(telefono));
		
	}
	
	private void transaccion() {
		
		try {
			out= new PrintStream(new FileOutputStream(fichero,false));
			out.print(agenda);
		}catch(FileNotFoundException e) {}
		finally {
			if(out!=null)out.close();
		}
		
		
	}
	
	private void asignaSexo() {
		
		Random r = new Random();
		for(Contacto x : agenda.contactos) {
		int opcion=r.nextInt(2);
		if(opcion<1)x.sexo=new Mujer(r.nextInt());
		if(opcion>=1)x.sexo=new Hombre(r.nextInt(2)==1);
		}
	}
	

}
