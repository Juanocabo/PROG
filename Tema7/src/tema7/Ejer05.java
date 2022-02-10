package tema7;

public abstract class Ejer05 {
	public Ejer05() {
		System.out.println("hola");
	}
	public abstract int Metod();
	public static void NoAbs() {
		System.out.println("deja crear metodos no abstractos dentro de una clase abstracta");
	
	}
	public static void main(String[]args) {
		NoAbs();
		
	}
}
