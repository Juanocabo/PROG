package Tema74;

import java.util.Scanner;

public abstract class Persona {
	Scanner tec = new Scanner(System.in);
	String nombre;
	int edad;
	public abstract void DevolverMasAlto();
	public abstract void VisualListaValores();
}
