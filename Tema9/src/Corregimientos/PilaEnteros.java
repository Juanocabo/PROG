/*
 * Clase generica d edefinicion de una pila y sus ooperaciones asociadas
 * Es un TAD LIFO
 */
package Corregimientos;

public abstract class PilaEnteros {
	/**
	 * Numero maximo que soporta la pila
	 */
	public final int MAXSIZE=100;
	/**
	 * Inserta un numero en la pila
	 * @param x el numero a insertar
	 */
	public abstract void push (int x);
	
	/**
	 * 
	 * @return el numero que se axtrae
	 */
	public abstract int pop ();
	
	/**
	 * Devuelve el numero de elementos en la pila
	 * @return El numero de elementos
	 */
	public abstract int size();
	
}
