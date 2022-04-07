
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
	int partidos = l.getCantidad();
	int diputados;

	public Votacion(int diputados) {
		this.diputados=diputados;
	}


	public void insertarVotos(String partido, int votos) {
		Partido a= new Partido(partido,votos);
		e=null;
		l.annadirVotos(a);
	}

	/**
	 * Determina el numero de cada partido con los datos actuales
	 */
	public void Calcular() {
		partidos = l.getCantidad();
		int votostotal=0;
		ListaPartidos aux = new ListaPartidos(diputados*partidos);

		for( int i = 0; i<l.getCantidad(); i++) 
			votostotal+=l.getVotos(i);
		
		int porcentaje= (int) (votostotal / 100.0 * 5);
		for( int i = 0; i<diputados*partidos; i++) {
			
			int auxPartido = i%partidos;
			int divisor = i/partidos+1;
			aux.insertarVotos(l.getNombre(auxPartido),l.getVotos(auxPartido)< porcentaje ? 0 : 
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
		for(int i = 0; i<diputados;i++)
			e.annadirVotos(aux.getNombre(i),1);

	}

	public String toString() {
		if (e==null)
			return "No ha sido calculado";
		String salida="Partido\tVotos";
		for(int i = 0; i<e.getCantidad();i++) {
			Partido p = e.getPartido(i);
			salida+="\n"+p;
		}
		return salida;
	}
}
