package Tema6;

public class Conductormatriz {

	public static void main(String[] args) {
		Matriz hola = new Matriz(3,3);
		Matriz adios = new Matriz(3,3);
		hola.Imprimir();
		adios.Imprimir();
		hola.mul(adios).Imprimir();

	}

}
