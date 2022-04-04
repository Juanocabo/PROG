
package Corregimientos;

import java.util.Arrays;

/**
 * Almacena los datos de unas elecciones u determuina ellnumero 
 * de diputados de los partidos
 * @author alu
 *
 */
public class Votacion {

	Partido[] e=null;
	private final int MAXSIZE = 100;
	Partido[] l = new Partido[MAXSIZE];
	int partidos = 0;
	int diputados;

	public Votacion(int diputados) {
		this.diputados=diputados;
	}
	
	public void insertarVotos(String partido, int votos) {
		e=null;
		for(int i = 0; i<partidos;i++)
			if(l[i].getNombre().equals(partido)) {
				l[i].addVotos(votos);
				return;
			}
		l[partidos++]= new Partido(partido,votos);
	}
	
	/**
	 * Determina el numero de cada partido con los datos actuales
	 */
	public void Calcular() {
		int votostotal=0;
		Partido[] aux = new Partido[diputados*partidos];
		
		for( int i = 0; i<partidos; i++)
			votostotal+=l[i].getVotos();
		
		int porcentaje= (int) (votostotal / 100.0 * 5);
		for( int i = 0; i<partidos; i++)
			if(l[i].getVotos()>=porcentaje)
				aux[i]=l[i];
			else
				aux[i]=new Partido(l[i].getNombre(),0);
		for(int i = partidos;i<diputados*partidos;i++) {	
			int auxPartido = i%partidos;
			int divisor = i/partidos+1;
			aux[i]=new Partido(aux[auxPartido].getNombre(),aux[auxPartido].getVotos()/divisor);
		}
		Arrays.sort(aux);
		e=new Partido[diputados];
		for(int i = 0; i<diputados;i++)
			e[i]=aux[i];
			
	}
	
	public String toString() {
		if (e==null)
			return "No ha sido calculado";
		String salida="Partido\tVotos";
		for(int i = 0; i<diputados;i++) {
			salida+="\n"+e[i].getNombre()+"\t"+e[i].getVotos();
		}
		return salida;
	}
}
