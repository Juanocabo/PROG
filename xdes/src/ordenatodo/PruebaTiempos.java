package ordenatodo;

import java.util.Arrays;
import java.util.Random;

public class PruebaTiempos {

	public static void main(String[] args) {
		int tam = 100000,max=tam*10;
		int[] l = new int[tam];
		Random r = new Random();
		for(int i = 0; i<tam; ++i) {
		l[i]=r.nextInt(max)+1;}
		//Cosa[] u = new Cosa[tam];
		//Arrays.sort(u);
		Qsort q = new Qsort(l);
		System.out.println("qsort: "+q.tiempo());
		Burbuja b = new Burbuja(l);
		System.out.println("burbuja: "+b.tiempo());
		SeleccionDirecta sd = new SeleccionDirecta(l);
		PruebaArrays pa=new PruebaArrays(l);
		System.out.println("sort: "+pa.tiempo());
		System.out.println("selecciondirecta: "+sd.tiempo());
		Shell s = new Shell(l);
		System.out.println("shell: "+s.tiempo());
		
	}

}
