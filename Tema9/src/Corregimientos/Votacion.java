
package Corregimientos;

import java.util.Arrays;

/**
 * Almacena los datos de unas elecciones u determuina ellnumero 
 * de diputados de los partidos
 * @author alu
 *
 */
public class Votacion {

	int conDiputados;
	ListaPartidos e=null;
	private final int MAXSIZE = 100;
	ListaPartidos l =new ListaPartidos();
	int partidos = 0;
	int diputados;

	public Votacion(int diputados) {
		this.diputados=diputados;
	}


	public void insertarVotos(String partido, int votos) {
		e=null;
		l.annadirVotos(partido,votos);
	}

	/**
	 * Determina el numero de cada partido con los datos actuales
	 */
	public void Calcular() {
		int votostotal=0;
		ListaPartidos aux = new ListaPartidos(diputados*partidos);

		for( int i = 0; i<diputados*partidos; i++) 
			votostotal+=l.getVotos(i);
		
		int porcentaje= (int) (votostotal / 100.0 * 5);
		for( int i = 0; i<diputados*partidos; i++) {
			
			int auxPartido = i%partidos;
			int divisor = i/partidos+1;
			aux.insertarVotos(aux.getNombre(auxPartido),l.getVotos(auxPartido)< porcentaje ? 0 :  
								l.getVotos(auxPartido)/divisor);	
		}

		
		/*for( int i = 0; i<partidos; i++)
			int auxPartido = i%partidos;
		int divisor = i/partidos+1;
		aux.insertarVotos(aux.getNombre(auxPartido), 
							aux.getVotos(auxPartido)/divisor);
			if(l.getVotos(i)>=porcentaje)
				aux.insertarVotos(l.getNombre(i), l.getVotos(i));
			else
				aux.insertarVotos(l.getNombre(i),0);
		for(int i = partidos;i<diputados*partidos;i++) {	
			int auxPartido = i%partidos;
			int divisor = i/partidos+1;
			aux.insertarVotos(aux.getNombre(auxPartido), 
								aux.getVotos(auxPartido)/divisor);
		}*/
		aux.ordenar();
		e=new ListaPartidos(l.getCantidad());
		conDiputados=0;
		for(int i = 0; i<diputados;i++)
			e.annadirVotos(aux.getNombre(i),1);

	}

	public String toString() {
		if (e==null)
			return "No ha sido calculado";
		String salida="Partido\tVotos";
		for(int i = 0; i<e.getCantidad();i++) {
			salida+="\n"+e.getNombre(i)+"\t"+e.getVotos(i);
		}
		return salida;
	}
}
