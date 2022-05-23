package ejercicio2;

public class Hombre implements Sexo {
	
	String nombre=H;
	boolean barba;
	public Hombre(boolean barba) {
		
		this.barba=barba;
		
	}
	
	public String toString() {
		
		return nombre+" "+((barba)?"con barba":"sin barba");
		
	}
	
}
