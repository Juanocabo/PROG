package Corregimientos;

import java.util.Random;

public class CondVota {

	public static void main(String[] args) {
		Random r =new Random();
		Votacion v = new Votacion(5);
		int electores=724983;
		int partidos=20;
		final int MAXVOTOS=500;
		int numVotos = r.nextInt(MAXVOTOS);
		int [] votos = {1000,25000,30000,12000};
		String[] p = {"P1","P2","P3","P4"};
		
		for (int i = 0; i<p.length; ++i) 
			v.insertarVotos(p[i], votos[i]);
			v.Calcular();
			System.out.println(v);

	}

}
