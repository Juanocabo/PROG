package Tema6;
public class Comedor {
	Plato[] carta = new Plato[6];
	static int cont=0;
	public int vendidos=0;
	public Comedor() {
		for(int i = 0;i<carta.length;++i) {
		carta[i] = new Plato();}
	}	
	public void setCarta(String Nombre, String Ingredientes, float precio) {
		
		carta[cont].setNombre(Nombre);
		carta[cont].setIngredientes(Ingredientes);
		carta[cont].setPrecio(precio);
		++cont;
	}
	public void verCarta() {
		for(int i = 0;i<carta.length;++i) {
			 System.out.println(carta[i].getNombre());
			 System.out.println(carta[i].getIngredientes());
			 System.out.println(carta[i].getPrecio());
			 System.out.println();
			 System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Comedor menu = new Comedor();
		menu.setCarta("salchicha","pan",21);
		menu.verCarta();
	}
}
