/**
 * Clase que representa un unica ficha de domino son uno o 2 numeros enteros
 */
package Repaso2Ev2;

public class FichaDomino {
	/**
	 * numeros o el numero de la ficha
	 */
	  private final int lad1;
	  private final int lad2;
	 
	public FichaDomino(int uno,int dos) {
		// 0 es la cara blanca de la ficha 
		if(uno<0 || uno>6 || dos<0 || dos>6)
			throw new IllegalArgumentException("Uno de los numeros de la ficha no es valido");
		lad1=uno;
		lad2=dos;
		
	}

	public int getLad1() {
		return lad1;
	}

	public int getLad2() {
		return lad2;
	}
	public String toString() {
		String salida="["+((lad1==0)?" ":lad1)+"|"+((lad2==0)?" ":lad2)+"]";
		return salida;
	}
}
