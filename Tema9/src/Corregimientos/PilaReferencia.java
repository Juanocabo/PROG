/**
 * 
 */
package Corregimientos;

/**
 * @author alu
 *
 */
public class PilaReferencia extends PilaEnteros {

	//clase qie representa el elemnteo de la pila
	class ElementoPila{
		// elemento de la pila
		int elto;
		//elemento siguiente
		ElementoPila sig;
		
		ElementoPila(int x){
			elto=x;
			sig=null;
		}
	}

	// vector que almacena la pila
	ElementoPila cima =null;
	//tamaño de qie me cago en todo
	int tam=0;
	@Override
	public void push(int x) {
		if(tam == MAXSIZE)
			throw new IndexOutOfBoundsException("Hiueputa pila iena");
		ElementoPila aux = new ElementoPila(x);
		aux.sig=cima;
		cima=aux;
		tam++;
	}

	@Override
	public int pop() {
		//si la pila no esta vacia
		if(cima != null) {
			ElementoPila aux = cima;
			cima=cima.sig;
			tam--;
			return aux.elto;
		}
		//return 0;
		throw new IndexOutOfBoundsException("Hiueputa pila vasía");
	}

	@Override
	public int size() {
		/*
		ElementoPila aux = cima;
		int size=0;
		while(aux != null) {
			size++;
			aux=aux.sig;
		}*/
		return tam;
	}

}
