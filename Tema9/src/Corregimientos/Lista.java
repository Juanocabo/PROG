package Corregimientos;

import java.util.Arrays;

public class Lista<T> {
	private final int MAXSIZE = 100;
	T[] l;
	int limite=100;

	public Lista() {
		l = new T[MAXSIZE];
	}
	public Lista(int size) {
		l = new T[size];
	}
/*
	public void annadirVotos(String partido, int votos) {
		for(int i = 0; i<limite;i++)
			if(l[i].getNombre().equals(partido)) {
				l[i].addVotos(votos);
				return ;
			}
		l[limite++]= new Partido(partido,votos);
	}

	public void annadirVotos(Partido p) {
		for(int i = 0; i<limite;i++)
			if(l[i].getNombre().equals(p.getNombre())) {
				l[i].addVotos(p.getVotos());
				return ;
			}
		l[limite++]= p;
	}*/
	
	public void insertar (T p) {
		l[limite++] = p;
	}
	
	public T getPartido(int i) {
		return l[i];
	}
/*	
	public Partido buscar(String nombre) {
	
		for(int i = 0; i<limite;i++)
			if(l[i].getNombre().equals(nombre)) 
				return l[i];
			return null;
	}
	*/
	public T buscar(T p) {
		
		for(int i = 0; i<limite;i++)
			if(l[i].getNombre().equals(p)) 
				return l[i];
			return null;
	}
	
	/*
	public  void insertarVotos(String partido, int votos) {
		l[limite++] = new Partido(partido,votos);
	}
	
	public int  getVotos (int posicion) {
		return l[posicion].getVotos();
	}
	public String  getNombre (int posicion) {
		return l[posicion].getNombre();
	}*/
	public void ordenar() {
		Arrays.sort(l);
	}
	
	public int getCantidad() {
		return limite;
	}
}

