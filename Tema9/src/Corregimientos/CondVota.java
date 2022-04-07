package Corregimientos;

import java.util.Random;

public class CondVota {

	public static void main(String[] args) {
		Random r =new Random(1);
		final int ELECTORES=724983;
		final int partidos=20;
		final int MAXVOTOS=500;
		final int escaños=27;
		int numVotos;
		int electores=ELECTORES;
		String[] p = new String[partidos];
		
		for (int i = 1; i<=partidos;++i) {
			p[i-1] = "P_" + (i<10 ? "0": "")+i;
		}
		
		Votacion v = new Votacion(escaños);
		
		while (electores >0) {
			numVotos = r.nextInt(MAXVOTOS);
			int auxPartido = r.nextInt(partidos+2);
			if(auxPartido < partidos)
				v.insertarVotos(p[auxPartido],numVotos);
			electores -= numVotos;
		}

			
			v.Calcular();
			System.out.println(v);

	}

}
