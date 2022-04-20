package Domino;

import java.util.Random;

public class Domino {
	Random r = new Random();
	Ficha[] domino = new FichaJuego[28];
	boolean[] encaja = new boolean[28];
	int cantidad;
	
	public Domino() {
		inicializar();
		
	}
	
	public void inicializar() {
		int u,u2;
		Ficha aux;
		for(int i = 0; i<domino.length;++i) {
			do {
			u=r.nextInt(7);
			u2=r.nextInt(7);
			aux = new Ficha(u,u2);
			}while(existe(aux,i));
			encaja[i]=true;
			domino[i]=new Ficha(u,u2);
			cantidad++;
		}
	}
	
	public boolean existe(Ficha u, int pos) {
		for(int i = 0;i<pos;++i)
			if(u.equals(domino[i]))
				return true;
		return false;
	
	}
	
	public Ficha getFicha(Ficha f) {
		for( int i = 0; i< domino.length;++i)
			if(encaja[i] &&f.equals(domino[i])) {
				encaja[i]=false;
				cantidad--;
				return domino[i];
				
			}
		return null;
		
	}
	
	public void putFicha(Ficha f){
		for( int i = 0; i< domino.length;++i)
			if(!encaja[i] && f == (domino[i]))
				encaja[i]=true;cantidad++;
		throw new IllegalArgumentException("La ficha no pertenece a este juego");
	}
	
	public Ficha[] getJuego() {
		return domino;
		
	}
	
	public Ficha getFicha() {
		Ficha a;
		if(cantidad>0) {
		do {
		Ficha aux = new Ficha(r.nextInt(7),r.nextInt(7));
		a=getFicha(aux);
		}while(a==null);
		cantidad--;
		return a;}
		return null;
		
	}
	

	public String toString() {
		String salida="";
		for(int i = 0 ; i<domino.length;++i)
			salida+=" --- "+domino[i]+(((i+1)%7==0)?"\n":"");
		return salida;
		
	}
}
