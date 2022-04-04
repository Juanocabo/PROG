/**
 * 
 */
package Corregimientos;
/**
 * 
 * @author alu
 *
 */
public class PilaVector extends PilaEnteros {
	
	// vector que almacena la pila
	private int[] pila = new int[MAXSIZE];
	// ultima posicion usada en la pila: elementos en la pila
	private int cima=0;
	@Override
	public void push(int x) {
		//si la pila no esta llena
		if(cima < MAXSIZE)
			pila[cima++]=x;
		else 
			throw new IndexOutOfBoundsException("Hiueputa pila iena");
	}

	@Override
	public int pop() {
		//si la pila no esta vacia
		if(cima>0)
			return pila[--cima];
		//return 0;
		throw new IndexOutOfBoundsException("Hiueputa pila vasía");
	}

	@Override
	public int size() {
		return cima;
	}

}
