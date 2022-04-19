package Repaso2Ev2;

import java.util.Random;

public class CajaDomino {
	Random r = new Random();
	FichaDomino[] caja = new FichaDomino[28];
	
	public CajaDomino() {
		asignar();
		
	}
	private void asignar() {
		int u,u2,db=0;
		for(int i = 0; i<caja.length;++i) {
			do {
			u=r.nextInt(7);
			u2=r.nextInt(7);
			}while(existe(u,u2,i));
			caja[i]=new FichaDomino(u,u2);
			
		}
	}
	private boolean existe(int u, int u2,int pos) {
		for(int i = 0;i<pos;++i)
			if(u==caja[i].getLad1() && u2==caja[i].getLad2() || u==caja[i].getLad2() && u2==caja[i].getLad1())
				return true;
		return false;
	}
	public String toString() {
		String salida="";
		for(int i = 0 ; i<caja.length;++i)
			salida+=" --- "+caja[i]+(((i+1)%7==0)?"\n":"");
		return salida;
	}
	public FichaDomino getFicha(int pos) {
		return caja[pos];
	}
	}

