package Corregimientos;

public class Partido implements Comparable{

	final private String nombre;
	private int votos;
public Partido(String nombre) {
	this.nombre=nombre;
	this.votos=0;
	}
public Partido(String nombre, int votos) {
	this.nombre=nombre;
	addVotos(votos);
}
public String getNombre() {
	return nombre;
}
public int getVotos() {
	return votos;
}
public void addVotos(int votos) {
	if(votos>0)this.votos+=votos;
}
@Override
public int compareTo(Object o) {
	return -(this.votos-((Partido)o).votos);
	/*if(this.votos < ((Partido)o).votos)
		return -1;
	else if (this.votos == ((Partido)o).votos)
		return 0;
	else 
		return 1;*/
}
}
