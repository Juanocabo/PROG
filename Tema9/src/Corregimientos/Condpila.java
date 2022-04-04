/**
 * 
 */
package Corregimientos;

import java.util.Random;

/**
 * Conductor para la prueba de las pilas
 * @author alu
 *
 */
public class Condpila {
private static void Imp(PilaEnteros l) {
		PilaEnteros aux = new PilaVector();
		while(l.size()>0) aux.push(l.pop());
		while(aux.size()>0) {
			int x = aux.pop();
			System.out.print(x + " ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//numero maximo de elementos a usar
		final int MAXOPE = 150;
		
		PilaEnteros p = new PilaReferencia();
		Random r = new Random(123456);
		
		for(int i = 0; i<MAXOPE;++i) {
			int x = r.nextInt();
			boolean meter = r.nextBoolean();
			System.out.println("operacion "+i+": "+(meter?"meter":"sacar"));
			if(meter || i<20)
				p.push(x);
			else
				p.pop();
		}
		Imp(p);
	}

	
}
