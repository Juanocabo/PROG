package Tema6;

public class Conductorcon {

	public static void main(String[] args) {
		Conjunto con = new Conjunto();
		Conjunto hola = new Conjunto();
		con.agregar(1);
		con.agregar(1);
		con.agregar(2);
		con.agregar(3);
		con.agregar(4);
		con.imprimir();
		con.copiar(hola.tabla);
		hola.imprimir();
		con.vaciar();
		con.imprimir();
		if(hola.esMiembro(2)) {
		hola.eliminar(hola.posicion(2));
		}
		hola.imprimir();
	}

}