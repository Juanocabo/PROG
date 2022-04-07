
package Corregimientos;


/**
 * Almacena los datos de unas elecciones u determuina ellnumero 
 * de diputados de los partidos
 * @author alu
 *
 */
public class Votacion {

	int conDiputados;
	Lista<Diputado> e=null;
	//private final int MAXSIZE = 100;
	Lista<Partido> l =new Lista<>();
	int partidos = l.getCantidad();
	int diputados;

	public Votacion(int diputados) {
		this.diputados=diputados;
	}


	public void insertarVotos(String partido, int votos) {
		e=null;
		Partido o = new Partido(partido,votos);
		Partido p = l.buscar(o);
		if (p != null)p.addVotos(votos);
		else l.insertar(new Partido(partido,votos));
	}
	

	/**
	 * Determina el numero de cada partido con los datos actuales
	 */
	public void Calcular() {
		partidos = l.getCantidad();
		int votostotal=0;
		Lista<Partido> aux = new Lista<>(diputados*partidos);

		for( int i = 0; i<l.getCantidad(); i++) 
			votostotal+=l.getPartido(i).getVotos();
		
		int porcentaje= (int) (votostotal / 100.0 * 5);
		for( int i = 0; i<diputados*partidos; i++) {
			
			int auxPartido = i%partidos;
			int divisor = i/partidos+1;
			aux.insertar(new Partido(l.getPartido(auxPartido).getNombre(),l.getPartido(auxPartido).getVotos()< porcentaje ? 0 : 
				l.getPartido(auxPartido).getVotos()/divisor));	
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
		e=new Lista<>(l.getCantidad());
		for(int i = 0; i<diputados;i++) {
			Partido miAux = aux.getPartido(i);
			Partido p=e.buscar(miAux);
			if(p==null)
				e.insertar(new Diputado(miAux.getNombre(),miAux.getVotos()));
			else 
				p.addVotos(1);
			}

	}

	public String toString() {
		if (e==null)
			return "No ha sido calculado";
		String salida="Partido\tEscaños";
		for(int i = 0; i<e.getCantidad();i++) {
			Partido p = e.getPartido(i);
			salida+="\n"+p;
		}
		return salida;
	}
}
