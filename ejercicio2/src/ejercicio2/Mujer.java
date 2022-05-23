package ejercicio2;

public class Mujer implements Sexo {

	String nombre=M;
	int hijos;
	public Mujer(int hijos) {
		
		this.hijos=hijos;
		
	}
	
	public String toString() {
		
		return nombre+" "+((hijos>0)?hijos+" hijos":"sin hijos");
		
	}
	
}
