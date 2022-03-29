
public class Pila {

	final int maxsize=100;
	int cima=0;
	boolean vacia=true;
	int[] datos = new int[maxsize];
	public void push(int num) {
		datos[cima++]=num;
		vacia=false;
	}
	public int pop(){
		if(cima-1==0)vacia=true;
		return datos[--cima];
	}
	public int size() {
		return cima;
	}
}
