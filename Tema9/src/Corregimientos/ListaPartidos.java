package Corregimientos;

import java.util.Arrays;

public class ListaPartidos {
	private final int MAXSIZE = 100;
	Partido[] l;
	int limite=0;

	public ListaPartidos() {
		l = new Partido[MAXSIZE];
	}
	public ListaPartidos(int size) {
		l = new Partido[size];
	}


	public void annadirVotos(String partido, int votos) {
		for(int i = 0; i<limite;i++)
			if(l[i].getNombre().equals(partido)) {
				l[i].addVotos(votos);
				return ;
			}
		l[limite++]= new Partido(partido,votos);
	}
	
	public  void insertarVotos(String partido, int votos) {
		l[limite++] = new Partido(partido,votos);
	}
	
	public int  getVotos (int posicion) {
		return l[posicion].getVotos();
	}
	public String  getNombre (int posicion) {
		return l[posicion].getNombre();
	}
	public void ordenar() {
		Arrays.sort(l);
	}
}

