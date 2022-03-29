package xdes;

import java.util.Random;

public class qqsort {
	public void qsort(int[] l, int ini , int fin) {
		if(ini>=fin)return;
		int i = ini;
		int j = fin;
		int pivote = l[ini];
		int aux;
		do{                                                            
			while(l[i] <= pivote && i < j) i++; 
			while(l[j] > pivote) j--;           
			if (i < j) {                                          
				aux= l[i];                     
				l[i]=l[j];
				l[j]=aux;
			}
		}	while(i < j);
		l[ini]=l[j];                                   
		l[j]=pivote;      
			qsort(l,ini,j-1);         
			qsort(l,j+1,fin);          
	}

	public static void main(String[] args) {
		long t =System.currentTimeMillis();
		Random r = new Random();
		qqsort h = new qqsort();
		int tam = 1000000,max=tam*10;
		int[] l = new int [tam];
		for(int i = 0; i<tam; ++i) {
			//l[i]=(int)(Math.random()*max)+1;
			l[i]=r.nextInt(max)+1;
		}
		h.qsort(l,0, l.length-1);
	
		//for(int i = 0 ; i<l.length;++i)System.out.println(l[i]);
		System.out.println((System.currentTimeMillis()-t)*0.001+" segundos");
	}

}
