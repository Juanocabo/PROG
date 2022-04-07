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
	
	public int compareTo(Object o) {
		if (diputados != ((Diputado)o).diputados)
			return -(diputados-((Diputado)o).diputados);
		return -(votos-((Diputado)o).votos);
	}
	
	public String toString() {
		return nombre + "\t" + diputados + "\t" + votos;
	}

	public void addVotos(int votos) {
		if(votos>0)diputados+=votos;
	}
	
}
