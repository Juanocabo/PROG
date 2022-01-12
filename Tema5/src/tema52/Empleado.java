package tema52;

import java.util.Scanner;

public class Empleado {
	String nombre;
	int nemp;
	public  String gNombre(){
		return nombre;
	}
	public void sNombre(String nombre){
		this.nombre=nombre;
	}
	public int gNemp() {
		return nemp;
	}
	public void sNemp(int nemp) {
		this.nemp =nemp;
	}
	public static void leerDatos() {
		Scanner teclado = new Scanner(System.in);
		Empleado leer = new Empleado();
		String nombre = teclado.next();
		int nemp = teclado.nextInt();
		leer.sNombre(nombre);
		leer.sNemp(nemp);
	}
	public static void verDatos() {
		Empleado ver = new Empleado();
		System.out.println(ver.nemp+ver.nombre);
	}
}