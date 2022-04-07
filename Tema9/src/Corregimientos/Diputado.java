package Corregimientos;

public class Diputado extends Partido{
	private int diputados;
	
	public Diputado(String nombre ) {
		super(nombre);
		diputados=0;
	}
	
	public Diputado (String nombre, int votos, int diputados) {
		super(nombre,votos);
		this.diputados=diputados;
	}
	
	public Diputado (String nombre, int votos) {
		super(nombre,votos);
		this.diputados = 1;
	}
	
}
