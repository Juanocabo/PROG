package tema5;

import java.util.Scanner;

public class Empleado {
	private String nombre;
	private int nemp;
	public Empleado() {
		leerDatos();
	}
	public Empleado(int nemp,String nombre) {
		this.nemp=nemp;
		this.nombre=nombre;
	}
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
	public void leerDatos() {
		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.next();
		int nemp = teclado.nextInt();
		sNombre(nombre);
		sNemp(nemp);
	}
	public void verDatos() {
		System.out.println(gNombre()+gNemp());
	}
}